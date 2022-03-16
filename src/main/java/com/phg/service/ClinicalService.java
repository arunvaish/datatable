package com.phg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phg.model.Clinical;
import com.phg.model.DataManager;
import com.phg.model.DataTableFilter;
import com.phg.repository.ClinicalRepository;

@Service
public class ClinicalService {

	private final ClinicalRepository repository;

	@Autowired
	public ClinicalService(ClinicalRepository repository) {
		this.repository = repository;
	}

	public DataManager findClinicalList(DataTableFilter filter) {
		return repository.getRecords(filter);
	}

	public void save(final Clinical clinical) {
		repository.save(clinical);
	}

	public Clinical findById(final int id) {
		return repository.findById(id).orElse(null);
	}

//
	public List<Clinical> findAll() {
		return (List<Clinical>) repository.findAll();
	}

	public List<String> searchByClinic1(String key) {
		return repository.searchByClinic1(key);
	}

	public List<String> searchByClinic2(String key) {
		return repository.searchByClinic2(key);
	}

	public List<String> searchByClinic3(String key) {
		return repository.searchByClinic3(key);
	}

	public List<String> searchByClinic4(String key) {
		return repository.searchByClinic4(key);
	}

	public List<String> searchByClinic5(String key) {
		return repository.searchByClinic5(key);
	}

	public List<String> searchByClinic6(String key) {
		return repository.searchByClinic6(key);
	}

	public List<String> searchByClinic7(String key) {
		return repository.searchByClinic7(key);
	}

	public List<String> searchByClinic8(String key) {
		return repository.searchByClinic8(key);
	}

	public List<String> searchByClinic9(String key) {
		return repository.searchByClinic9(key);
	}

	public List<String> searchByClinic10(String key) {
		return repository.searchByClinic10(key);
	}

	public List<String> searchByClinic11(String key) {
		return repository.searchByClinic11(key);
	}

	public List<String> searchByClinic12(String key) {
		return repository.searchByClinic12(key);
	}

	public List<String> searchByClinic13(String key) {
		return repository.searchByClinic13(key);
	}

	public List<String> searchByClinic14(String key) {
		return repository.searchByClinic14(key);
	}

	public List<String> searchByClinic15(String key) {
		return repository.searchByClinic15(key);
	}

	public List<Clinical> getById(int id) {
		return repository.getById(id);
	}

	public List<String> getAllByClinic1() {
		return repository.getByClinic1();
	}
	
	public List<String> getAllByClinic2() {
		return repository.getByClinic2();
	}
	
	public List<String> getAllByClinic3() {
		return repository.getByClinic3();
	}
	
	public List<String> getAllByClinic4() {
		return repository.getByClinic4();
	}
	
	public List<String> getAllByClinic5() {
		return repository.getByClinic5();
	}
	
	public List<String> getAllByClinic6() {
		return repository.getByClinic6();
	}
	
	public List<String> getAllByClinic7() {
		return repository.getByClinic7();
	}
	
	public List<String> getAllByClinic8() {
		return repository.getByClinic8();
	}
	
	public List<String> getAllByClinic9() {
		return repository.getByClinic9();
	}
	
	public List<String> getAllByClinic10() {
		return repository.getByClinic10();
	}
	
	public List<String> getAllByClinic11() {
		return repository.getByClinic11();
	}
	
	public List<String> getAllByClinic12() {
		return repository.getByClinic12();
	}
	
	public List<String> getAllByClinic13() {
		return repository.getByClinic13();
	}
	
	public List<String> getAllByClinic14() {
		return repository.getByClinic14();
	}
	
	public List<String> getAllByClinic15() {
		return repository.getByClinic15();
	}
}
