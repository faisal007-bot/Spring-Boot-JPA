package com.boot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boot.jpa.model.User;

// we can also use all the annotations of the jpa and hibernate in boot jpql

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
//	using distinct clause to select distinct
	public List<User> findDistinctByName(String name);
	
//	using property to get the entity
	public List<User> findByName(String name);
	
//	using and clause to get the result if all the conditions will be true
	public List<User> findByNameAndPassword(String name,String password);
	
//	using or clause to get the result if one of the condition will be true
	public List<User> findByNameOrCity(String name,String city);
	
//	between clause to get all the entities between the provided range
	public List<User> findByIdBetween(int start,int end);
	
//	using less than to select all the entities less than the provided condition
	public List<User> findByIdLessThan(int id);
	
//	using less than equal to select all the entities less than or equal to the provided condition
	public List<User> findByIdLessThanEqual(int id);
	
//	using greater than to select all the entities greater than the provided condition
	public List<User> findByIdGreaterThan(int id);
	
//	using greater than equal to select all the entities greater than or equal to the provided condition
	public List<User> findByIdGreaterThanEqual(int id);
	
//	starting with selects all the entities that starts with the provided prefix
	public List<User> findByNameStartingWith(String prefix);
	
//	ending with selects all the entities that ends with the provided suffix
	public List<User> findByNameEndingWith(String suffix);
	
//	containing returns all the entries that contains the provided value
	public List<User> findByCityContaining(String pattern);
	
//	order by is used to order the entities in the provided sequence
	public List<User> findByNameOrderByIdDesc(String name);
	
//	selects all the entities except the entities that satisfies the provided condition
	public List<User> findByIdNot(int id);
	
//	selects all the entitites that satisfies the condition
	public List<User> findByIdIn(int[] ids);
	
//	selects all the entitites that doesnt satisfies the condition
	public List<User> findByIdNotIn(int[] ids);
	
//	ignorecase selects all the entities satisfies the condition ignoring of their case
	public List<User> findByNameIgnoreCase(String name);
	
	
	
//	query annotation is used to pass the custom queries 
//	JPQL query
	@Query(value = "from User")
	public List<User> getAllUsers();
	
//	param annotation is used to bind the method parameter with the query parameter
	@Query(value = "select u from User as u where u.id=:id and u.name=:name")
	public List<User> getUsers(@Param("id")int id,@Param("name")String name);
	
//	for modification inside the database we need to use the transactional and modifying annotation
//	on top of the method
//	the method can only support void or int return type
	
//	updating the user using the JPQL
	@Modifying
	@Transactional
	@Query(value = "update User set name=:name,city=:city where id=:id")
	public int updateUser(@Param("name")String name,@Param("city")String city,@Param("id")int id);
	
//	deleting the user using the JPQL
	@Modifying
	@Transactional
	@Query(value = "delete from User where name=:name")
	public int deleteUser(@Param("name")String name);
	
	
	
//	performing native sql query using query annotation 
//	we have to specify the nativequery to true to indicate that it is native query
	@Query(value = "select * from user",nativeQuery = true)
	public List<User> getAll();
	
//	using param with native queries
	@Query(value = "select * from user where password=?",nativeQuery = true)
	public List<User> selectAllUsers(@Param("password")String password);
	
//	updating the user using sql
	@Modifying
	@Transactional
	@Query(value = "update user set name=?,city=?,password=? where id=?",nativeQuery = true)
	public int updateUserNative(@Param("name")String name,@Param("city")String city,
			@Param("password")String password,@Param("id")int id);
	
//	deleting using the sql
	@Transactional
	@Modifying
	@Query(value = "delete from user where name=?",nativeQuery = true)
	public int deleteUserNative(@Param("name")String name);
	
}
