package com.manadev.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manadev.restful.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
