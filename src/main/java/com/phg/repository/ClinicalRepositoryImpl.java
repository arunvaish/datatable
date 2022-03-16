package com.phg.repository;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phg.helper.ValueMapper;
import com.phg.model.Clinical;
import com.phg.model.DataManager;
import com.phg.model.DataTableFilter;
import com.phg.model.Master;

@Component
public class ClinicalRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	MasterRepository masterRepository;

	public List<Clinical> getById(int id) {
		String query = "select c from Clinical c where c.id = :id";
		TypedQuery<Clinical> createQuery = entityManager.createQuery(query, Clinical.class);
		createQuery.setParameter("id", id);
		return createQuery.getResultList();
	}

	public DataManager getRecords(DataTableFilter filter) {
		DataManager result = new DataManager();

		String hqlQuery = "Select c from Clinical c ";
		String whereClouse = " where ";
		boolean hasWhereClouse = false;
		List<HashMap<String, String>> columns = filter.getColumns();
		for (HashMap<String, String> data : columns) {
			if (data.get("searchValue").length() != 0) {
				hasWhereClouse = true;
				if(data.get("data").contains("mid")) {
					Master master = masterRepository.findByCode(data.get("searchValue"));
					String masterKey = data.get("data").replace("code", "id");
					whereClouse += masterKey + " = '" + master.getId() + "' and ";
				} else {
					whereClouse += data.get("data") + " = '" + data.get("searchValue") + "' and ";
				}
			}
		}
		whereClouse = whereClouse.substring(0, whereClouse.length() - 4);
		if (hasWhereClouse) {
			hqlQuery += whereClouse;
		}

		hqlQuery += " ORDER BY " + ValueMapper.fieldName(Integer.parseInt(filter.getOrder().get(0).get("column"))) + " " + filter.getOrder().get(0).get("dir");

		@SuppressWarnings("unchecked")
		List<Clinical> resultList  = entityManager.createQuery(hqlQuery).setFirstResult(filter.getStart()).setMaxResults(filter.getLength()).getResultList();

		// Count
		Long total = 0L;
		String countQuery = "select count(c.id) from Clinical c ";
		total = (Long) entityManager.createQuery(countQuery).getSingleResult();
		if(hasWhereClouse) {
			String subCountQuery = "select count(c.id) from Clinical c " + whereClouse;
			total = (Long) entityManager.createQuery(subCountQuery).getSingleResult();
		}
		result.setData(resultList);
		result.setRecordsTotal(total.intValue());
		result.setRecordsFiltered(total.intValue());
		return result;
	}
}
