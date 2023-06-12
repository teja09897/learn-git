package com.te.ems.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
   private Integer deptNo;
	
   private String deptName;
   
   @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
   private List<Employee> employees=new ArrayList<Employee>();
}
