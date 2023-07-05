package com.sic.juluri.person.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.juluri.person.model.ToDO_States;
import com.sic.juluri.person.repository.ToDORepository;
import com.sic.juluri.person.service.ToDOService;

@RestController
@RequestMapping ("/scotiabank_tasks/")
public class ToDOREST {
	@Autowired
	private ToDOService ToDOService;
	
	@GetMapping
	private ResponseEntity<List<ToDORepository>> getAllTasks (){
		return ResponseEntity.ok(ToDOService.findAll());
	}	
}