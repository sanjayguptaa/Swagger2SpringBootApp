package com.sanjay.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sanjay.demo.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();
}
