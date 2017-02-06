package evolution.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import evolution.entity.AnyEntity;

public interface AnyRepository extends MongoRepository<AnyEntity, String> {
	@Query(value = "{'name':?0}")
	public List<AnyEntity> findByName(String name);
}
