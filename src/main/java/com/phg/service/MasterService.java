package com.phg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phg.model.Master;
import com.phg.repository.MasterRepository;

@Service
public class MasterService {
  
	private final MasterRepository repository;
  
	@Autowired
	public MasterService(MasterRepository repository) {
		this.repository = repository;
	}
	
	public void save(final Master master) {
		repository.save(master);
	}
	
	public Master findById(final int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Master> findAll() {
		List<Master> masters = new ArrayList<Master>();
		repository.findAll().forEach(master -> masters.add(master));
		return masters;
	}
	
	public List<String> searchByMid1(String code) {
		return repository.searchByMid1(code);
	}
	
	public List<String> searchByMid2(String code) {
		return repository.searchByMid2(code);
	}
	
	public List<String> searchByMid3(String code) {
		return repository.searchByMid3(code);
		
	}
	
	public List<String> searchByMid4(String code) {
		return repository.searchByMid4(code);
	}
	
	public List<String> searchByMid5(String code) {
		return repository.searchByMid5(code);
	}
}
