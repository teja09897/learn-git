package com.te.ems.dto;

import java.util.ArrayList;
import java.util.List;

import com.te.ems.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepartmentDto {
	private Integer deptNo;
	private String deptName;
	
	private List<RegistrationDto> registrationDtos=new ArrayList<RegistrationDto>();
}
