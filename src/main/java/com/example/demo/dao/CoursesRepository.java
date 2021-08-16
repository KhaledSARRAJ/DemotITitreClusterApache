package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Courses;

public interface CoursesRepository extends PagingAndSortingRepository<Courses, Long>,  JpaSpecificationExecutor<Courses>{

}
