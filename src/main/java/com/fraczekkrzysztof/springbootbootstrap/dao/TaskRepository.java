package com.fraczekkrzysztof.springbootbootstrap.dao;

import org.springframework.data.repository.CrudRepository;

import com.fraczekkrzysztof.springbootbootstrap.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
