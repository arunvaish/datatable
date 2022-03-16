package com.phg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.phg.model.Master;

public interface MasterRepository extends JpaRepository<Master, Integer> {
	
	@Query(value = "SELECT m FROM Master m WHERE m.code = :key")
	public Master findByCode(@Param("key") String value);

	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid1 = m.id AND c.mid1 IN (SELECT id FROM Master WHERE code like %:key%) ORDER BY m.code ASC")
	public List<String> searchByMid1(@Param("key") String value);

	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid2 = m.id AND c.mid2 IN (SELECT id FROM Master WHERE code like %:key%) ORDER BY m.code ASC")
	public List<String> searchByMid2(@Param("key") String value);

	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid3 = m.id AND c.mid3 IN (SELECT id FROM Master WHERE code like %:key%) ORDER BY m.code ASC")
	public List<String> searchByMid3(@Param("key") String value);

	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid4 = m.id AND c.mid4 IN (SELECT id FROM Master WHERE code like %:key%) ORDER BY m.code ASC")
	public List<String> searchByMid4(@Param("key") String value);

	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid5 = m.id AND c.mid5 IN (SELECT id FROM Master WHERE code like %:key%) ORDER BY m.code ASC")
	public List<String> searchByMid5(@Param("key") String value);
	
	/**
	 * 
	 * @Description Following methods to get data from ES
	 */
	
	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid1 = m.id ORDER BY m.code ASC")
	public List<String> getMasterByMid1();
	
	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid2 = m.id ORDER BY m.code ASC")
	public List<String> getMasterByMid2();
	
	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid3 = m.id ORDER BY m.code ASC")
	public List<String> getMasterByMid3();
	
	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid4 = m.id ORDER BY m.code ASC")
	public List<String> getMasterByMid4();
	
	@Query(value = "SELECT DISTINCT m.code FROM Master m , Clinical c WHERE c.mid5 = m.id ORDER BY m.code ASC")
	public List<String> getMasterByMid5();
}
