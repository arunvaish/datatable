package com.phg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.phg.model.Clinical;
import com.phg.model.DataManager;
import com.phg.model.DataTableFilter;

@Transactional(readOnly = true)
@Repository
public interface ClinicalRepository extends JpaRepository<Clinical, Integer> {
	@Query(value = "SELECT DISTINCT c.clinic1 FROM Clinical c WHERE c.clinic1 like %:key% ORDER BY c.clinic1 ASC")
	public List<String> searchByClinic1(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic2 FROM Clinical c WHERE c.clinic2 like %:key% ORDER BY c.clinic2 ASC")
	public List<String> searchByClinic2(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic3 FROM Clinical c WHERE c.clinic3 like %:key% ORDER BY c.clinic3 ASC")
	public List<String> searchByClinic3(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic4 FROM Clinical c WHERE c.clinic4 like %:key% ORDER BY c.clinic4 ASC")
	public List<String> searchByClinic4(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic5 FROM Clinical c WHERE c.clinic5 like %:key% ORDER BY c.clinic5 ASC")
	public List<String> searchByClinic5(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic6 FROM Clinical c WHERE c.clinic6 like %:key% ORDER BY c.clinic6 ASC")
	public List<String> searchByClinic6(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic7 FROM Clinical c WHERE c.clinic7 like %:key% ORDER BY c.clinic7 ASC")
	public List<String> searchByClinic7(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic8 FROM Clinical c WHERE c.clinic8 like %:key% ORDER BY c.clinic8 ASC")
	public List<String> searchByClinic8(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic9 FROM Clinical c WHERE c.clinic9 like %:key% ORDER BY c.clinic9 ASC")
	public List<String> searchByClinic9(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic10 FROM Clinical c WHERE c.clinic10 like %:key% ORDER BY c.clinic10 ASC")
	public List<String> searchByClinic10(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic11 FROM Clinical c WHERE c.clinic11 like %:key% ORDER BY c.clinic11 ASC")
	public List<String> searchByClinic11(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic12 FROM Clinical c WHERE c.clinic12 like %:key% ORDER BY c.clinic12 ASC")
	public List<String> searchByClinic12(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic13 FROM Clinical c WHERE c.clinic13 like %:key% ORDER BY c.clinic13 ASC")
	public List<String> searchByClinic13(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic14 FROM Clinical c WHERE c.clinic14 like %:key% ORDER BY c.clinic14 ASC")
	public List<String> searchByClinic14(String key);
	
	@Query(value = "SELECT DISTINCT c.clinic15 FROM Clinical c WHERE c.clinic15 like %:key% ORDER BY c.clinic15 ASC")
	public List<String> searchByClinic15(@Param("key") String value);
	
	public List<Clinical> getById(int id);

	public DataManager getRecords(DataTableFilter filter);
}
