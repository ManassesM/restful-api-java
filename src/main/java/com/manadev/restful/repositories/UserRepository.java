package com.manadev.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manadev.restful.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
