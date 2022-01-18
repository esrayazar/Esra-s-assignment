package com.esra.auth.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esra.auth.models.User;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	User findByEmail(String email);

}
