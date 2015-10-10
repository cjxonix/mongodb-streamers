package startek.repositiries;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import startek.entity.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {

	@Query("{'name' : ?0}")
	public Iterable<Person> searchByName(String personName);

}