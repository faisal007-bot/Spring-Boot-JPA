package com.boot.jpa;

import java.util.List;

import org.hibernate.criterion.Order;

//import java.util.List;
//import java.util.List;
//import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import com.boot.jpa.dao.UserRepository;
import com.boot.jpa.dao.UserRepository2;
import com.boot.jpa.model.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepository userRepo = 
				context.getBean("userRepository",UserRepository.class);
		
//		saving the user into the database
//		User u = new User();
//		u.setCity("mumbai");
//		u.setName("faisal");
//		u.setId(2);
//		u.setPassword("faisal226536");
//		User user = userRepo.save(u);
//		System.out.println(user+" saved");
		
		
		
//		saving multiple users using the saveAll method
//		User user1 = new User();
//		user1.setId(10);
//		user1.setName("neko");
//		user1.setPassword("nerd");
//		user1.setCity("delhi");
//		User user2 = new User();
//		user2.setId(29);
//		user2.setName("cipher");
//		user2.setPassword("ciphertext");
//		user2.setCity("nevada");
//		User user = new User();
//		user.setId(7);
//		user.setName("faulty");
//		user.setPassword("fakeid");
//		user.setCity("vegas");
//		List<User> users = List.of(user1,user2,user);
//		Iterable<User> allUsers = userRepo.saveAll(users);
//		allUsers.forEach(e->{
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getPassword()+" "+e.getCity());
//		});
		
		
		
//		deleting a single user by passing the entity
//		User u = new User();
//		u.setCity("mumbai");
//		u.setName("faisal");
//		u.setId(2);
//		u.setPassword("faisal226536");
//		userRepo.delete(u);
//		System.out.println("user deleted");
		
//		deletes all the users present in the table
//		userRepo.deleteAll();
		
//		deletes all the users provided as an iterable
//		User user1 = new User();
//		user1.setId(10);
//		user1.setName("neko");
//		user1.setPassword("nerd");
//		user1.setCity("delhi");
//		User user2 = new User();
//		user2.setId(29);
//		user2.setName("cipher");
//		user2.setPassword("ciphertext");
//		user2.setCity("nevada");
//		User user = new User();
//		user.setId(7);
//		user.setName("faulty");
//		user.setPassword("fakeid");
//		user.setCity("vegas");
//		List<User> users = List.of(user1,user2,user);
//		userRepo.deleteAll(users);
		
//		deleting multiple users by providing their id
//		List<Integer> usersIds = List.of(29,10);
//		userRepo.deleteAllById(usersIds);
		
//		deleting the user by providing the id or primary key of the user
//		userRepo.deleteById(31);
		
		
//		returns the number of rows present in the database
//		long entries = userRepo.count();
//		System.out.println(entries);
		
//		returns boolean whether the entity exists or not by the provided id
//		boolean exists = userRepo.existsById(1);
//		System.out.println(exists);
		
//		findall methods returns all the entries of the database
//		Iterable<User> users = userRepo.findAll();
//		users.forEach(e->System.out.println(e));
		
//		returns all the entires that are present according to the provided id iterable
//		List<Integer> userIds = List.of(1,7);
//		Iterable<User> users = userRepo.findAllById(userIds);
//		users.forEach(u->System.out.println(u));
		
//		returns the single user mapped with the provided in optional format
//		we can use the get method of the optional to get the particular entity object
//		Optional<User> user = userRepo.findById(1);
//		User u = user.get();
//		System.out.println(u);
		
//		save and saveall methods are also used to update the existing entity in the database
//		User u1 = new User();
//		u1.setCity("japan");
//		u1.setId(1);
//		u1.setName("faisal khan");
//		u1.setPassword("faisal khan 226536");
//		userRepo.save(u1);
//		User u1 = new User();
//		u1.setCity("japan");
//		u1.setId(7);
//		u1.setName("faisal khan");
//		u1.setPassword("faisal khan 226536");
//		User u2 = new User();
//		u2.setCity("nevada");
//		u2.setId(11);
//		u2.setName("faiz");
//		u2.setPassword("faizkhan226536");
//		List<User> users = List.of(u1,u2);
//		userRepo.saveAll(users);
		
		
//		Custom finder methods
//		findBy is necessary in custom finder methods
		
//		using property to the object
//		List<User> users = userRepo.findByName("faiz");
//		users.forEach(u->System.out.println(u));
		
//		using distinct
//		List<User> users = userRepo.findDistinctByName("faisal khan");
//		users.forEach(u->System.out.println(u));
		
//		using and
//		List<User> users = userRepo.findByNameAndPassword("faiz", "faizkhan226536");
//		users.forEach(u->System.out.println(u));
		
//		using or
//		List<User> users = userRepo.findByNameOrCity("faiz", "japan");
//		users.forEach(u->System.out.println(u));
		
//		using between
//		List<User> users = userRepo.findByIdBetween(1, 40);
//		users.forEach(e->System.out.println(e));
		
//		using less than
//		List<User> users = userRepo.findByIdLessThan(20);
//		users.forEach(u->System.out.println(u));
		
//		using less than equal
//		List<User> users = userRepo.findByIdLessThanEqual(17);
//		users.forEach(u->System.out.println(u));
		
//		using greater than
//		List<User> users = userRepo.findByIdGreaterThan(17);
//		users.forEach(u->System.out.println(u));
		
//		using greater than equal
//		List<User> users = userRepo.findByIdGreaterThanEqual(17);
//		users.forEach(u->System.out.println(u));
		
//		using starting with
//		List<User> users = userRepo.findByNameStartingWith("f");
//		users.forEach(u->System.out.println(u));
		
//		using ending with
//		List<User> users = userRepo.findByNameEndingWith("n");
//		users.forEach(u->System.out.println(u));
		
//		using containing
//		List<User> users = userRepo.findByCityContaining("ci");
//		users.forEach(u->System.out.println(u));
		
//		using order by
//		List<User> users = userRepo.findByNameOrderByIdDesc("faisal khan");
//		users.forEach(u->System.out.println(u));
		
//		using not
//		List<User> users = userRepo.findByIdNot(72);
//		users.forEach(u->System.out.println(u));
		
//		using in
//		List<User> users = userRepo.findByIdIn(new int[] {1,11,14,17});
//		users.forEach(u->System.out.println(u));
		
//		using not in
//		List<User> users = userRepo.findByIdNotIn(new int[] {1,11,14,17});
//		users.forEach(u->System.out.println(u));
		
//		using ignorecase
//		List<User> users = userRepo.findByNameIgnoreCase("FAISAL KHAN");
//		users.forEach(u->System.out.println(u));
		
//		using custom queries
		
//		JPQL query
//		List<User> users = userRepo.getAllUsers();
//		users.forEach(u->System.out.println(u));
		
//		JPQL with parameters
//		List<User> users = userRepo.getUsers(11, "faiz");
//		users.forEach(u->System.out.println(u));
		
//		JPQL update
//		int isUpdated = userRepo.updateUser("sleeping neko", "area 51",1);
//		System.out.println(isUpdated);
		
//		JPQL delete 
//		int status = userRepo.deleteUser("faiz");
//		System.out.println(status);
		
		
		
//		sql query
//		List<User> users = userRepo.getAll();
//		users.forEach(u->System.out.println(u));
		
//		sql with parameter
//		List<User> users = userRepo.selectAllUsers("greed");
//		users.forEach(u->System.out.println(u));
		
//		update user
//		int status = userRepo.updateUserNative("fakeid", "vegas", "cipher123", 7);
//		System.out.println(status);
		
//		delete user
//		int status = userRepo.deleteUserNative("bermingham");
//		System.out.println(status);
		
		
//		using jparepository methods
		UserRepository2 repo = context.getBean("repo",UserRepository2.class);
		
		
//		deleteAllByIdinBatch method is used in batch processing and it will execute a single query to delete
//		multiple entities from the database
//		List<Integer> ids = List.of(142,144,242);
//		repo.deleteAllByIdInBatch(ids);
		
//		deletes all the entities in the single query
//		repo.deleteAllInBatch();
		
//		findall method is used to get all the entities from the database
//		List<User> users = repo.findAll();
//		users.forEach(u->System.out.println(u));
		
//		saveall and flush saves all the entities and flushes instantly
//		User u1 = new User();
//		u1.setCity("japan");
//		u1.setId(67);
//		u1.setName("faisal khan");
//		u1.setPassword("faisal khan 226536");
//		User u2 = new User();
//		u2.setCity("nevada");
//		u2.setId(181);
//		u2.setName("faiz");
//		u2.setPassword("faizkhan226536");
//		List<User> users = List.of(u1,u2);
//		repo.saveAllAndFlush(users);
		
//		save and flush saves the single entity and flushes instantly
//		User u = new User();
//		u.setCity("algeria");
//		u.setId(789);
//		u.setName("nerd");
//		u.setPassword("nerdguy007");
//		repo.saveAndFlush(u);
	}

}
