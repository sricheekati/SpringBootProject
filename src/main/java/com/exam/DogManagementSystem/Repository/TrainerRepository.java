package com.exam.DogManagementSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import com.exam.DogManagementSystem.models.Trainer;


public interface TrainerRepository extends CrudRepository <Trainer, Integer> {

}
