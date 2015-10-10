package startek.repositiries;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import startek.entity.Address;

@Repository
public interface AddressRepo extends MongoRepository<Address, Long>{

}
