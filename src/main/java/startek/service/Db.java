package startek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import startek.entity.Address;
import startek.entity.Person;
import startek.repositiries.AddressRepo;
import startek.repositiries.PersonRepo;

@Transactional
@Service
public class Db {

	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private AddressRepo addressRepo;

	public void setDb() {

		System.err.println(">>Loading the magic ...");
		Person personAchilles = new Person();
		personAchilles.setPersonId(1l);
		personAchilles.setName("Achilles");
		personRepo.save(personAchilles);
		Person personHektor = new Person();
		personHektor.setPersonId(2l);
		personHektor.setName("Hektor");

		Address address = new Address(1, "221b Baker Street", "London NW1", "London", 12345l);
		List<Address> addresses = personHektor.getAddresses();
		addresses.add(address);
		personAchilles.setAddresses(addresses);

		addressRepo.save(address);
		personRepo.save(personHektor);

		Iterable<Person> personList = personRepo.findAll();
		System.out.println("Person List : ");
		for (Person person : personList) {
			System.out.println(person);
		}

		System.out.println("Person Record with name Hektor  is " + personRepo.searchByName("Hektor"));

	}

}
