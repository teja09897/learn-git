package com.te.ems.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.ems.dto.DepartmentDto;
import com.te.ems.dto.RegistrationDto;
import com.te.ems.entity.Department;
import com.te.ems.entity.Employee;
import com.te.ems.repository.DepartmentRepository;
import com.te.ems.service.EmsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmsServiceImpl implements EmsService {
	private final DepartmentRepository departmentRepository;

	@Override
	public Optional<Boolean> register(DepartmentDto departmentDto) {
		if (departmentDto != null) {
			Department department = new Department();
			BeanUtils.copyProperties(departmentDto, department);

			List<Employee> employees = new ArrayList<Employee>();
			for (RegistrationDto deptDto : departmentDto.getRegistrationDtos()) {
				Employee employee = new Employee();
				BeanUtils.copyProperties(deptDto, employee);
				employee.setDepartment(department);
				department.getEmployees().add(employee);
			}
			

			departmentRepository.save(department);

			return Optional.ofNullable(true);
		}
		return Optional.ofNullable(false);

	}

}
