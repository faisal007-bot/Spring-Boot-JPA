package com.boot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.jpa.model.User;

@Repository(value = "repo")
// jparepository provides methods related for pagination and batch processing
// jpa repository should be used because it posses all the methods of the crud repository
// as well as it provides some additional methods specific for performance improvement
// it alsoprovides methods for pagination and batch processing
// we can also define custom finder methods and query annotation inside the jpa repository
// spring creates bean of the proxy class as internally at runtime it creates proxy class
// and then it creates the bean of that proxy class bcoz creating the object of interface 
// is not possible in java
public interface UserRepository2 extends JpaRepository<User, Integer>{
	
}
