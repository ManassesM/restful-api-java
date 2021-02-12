package com.manadev.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.restful.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
