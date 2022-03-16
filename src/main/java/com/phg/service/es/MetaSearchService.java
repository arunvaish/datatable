package com.phg.service.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phg.mode.es.Metadata;
import com.phg.repository.es.MetaSearchRepository;

@Service
public class MetaSearchService {
	
	private final MetaSearchRepository repository;
	
	@Autowired
	public MetaSearchService(MetaSearchRepository repository) {
		this.repository = repository;
	}
	
	public void save(final Metadata metadata) {
		repository.save(metadata);
	}
	
	public Metadata fetch(final String id) {
		return repository.findById(id).orElse(null);
	}
}
