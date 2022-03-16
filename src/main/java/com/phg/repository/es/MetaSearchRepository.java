package com.phg.repository.es;
import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.phg.mode.es.Metadata;

public interface MetaSearchRepository extends ElasticsearchRepository<Metadata, Integer>  {

	Optional<Metadata> findById(String id);

}
