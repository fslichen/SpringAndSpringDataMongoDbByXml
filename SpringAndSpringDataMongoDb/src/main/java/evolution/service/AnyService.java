package evolution.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import evolution.entity.AnyEntity;
import evolution.repository.AnyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml", "/applicationContext-mongo.xml"})
public class AnyService {
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	AnyRepository anyRepository;
	
	@Test
	public void anyMethod() {
		Criteria criteria = new Criteria();
		criteria.and("name").is("Chen");
		List<AnyEntity> anyEntities = mongoTemplate.find(new Query().addCriteria(criteria), AnyEntity.class);
		System.out.println(anyEntities);
		anyEntities = anyRepository.findByName("Chen");
		System.out.println(anyEntities);
	}
}
