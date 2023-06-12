package com.te.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ems.entity.Department;
@Repository

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
}
