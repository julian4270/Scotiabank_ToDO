package com.sic.juluri.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sic.juluri.person.model.ToDO_States;

public interface ToDORepository{

	List<ToDORepository> findAll(); 

}