package com.te.ems.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.ems.dto.DepartmentDto;
import com.te.ems.service.EmsService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RequestMapping(path = "/api")
@RestController
public class EmsController {
	private final EmsService emsService;
	
	
	@PostMapping(path = "register")
	public ResponseEntity<String> register(@RequestBody DepartmentDto departmentDto) {
		Optional<Boolean> empFromDb=emsService.register(departmentDto);
		if (empFromDb.get()) {
			return ResponseEntity.ok("employee Registration successful");
		}
		throw new RuntimeException("unable to register employee");
		
	}

}
