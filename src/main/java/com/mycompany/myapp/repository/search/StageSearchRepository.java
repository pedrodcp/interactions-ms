package com.mycompany.myapp.repository.search;

import com.mycompany.myapp.domain.Stage;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Stage entity.
 */
public interface StageSearchRepository extends ElasticsearchRepository<Stage, Long> {
}
