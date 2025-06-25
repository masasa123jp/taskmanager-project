package com.example.taskmanager.repository;
import com.example.taskmanager.model.Task;import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;
public interface TaskSearchRepository extends ElasticsearchRepository<Task,String>{
 List<Task> findByTitleOrDescription(String t,String d);
}
