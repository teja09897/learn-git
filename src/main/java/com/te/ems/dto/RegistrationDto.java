package com.te.ems.dto;

import com.te.ems.entity.Department;

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

public class RegistrationDto {
	
   private String empName;
   private Integer empAge;
   private Double empSal;
   
   
}
