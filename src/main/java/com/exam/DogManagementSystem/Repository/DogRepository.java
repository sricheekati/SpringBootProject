package com.exam.DogManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exam.DogManagementSystem.models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{

	List<Dog> findByName(String name);
 
}
