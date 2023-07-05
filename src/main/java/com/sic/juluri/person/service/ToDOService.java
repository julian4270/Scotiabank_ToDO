package com.sic.juluri.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sic.juluri.person.repository.ToDORepository;
@Service
public class ToDOService {
	@Autowired
	private ToDORepository ToDORepository;

	public List<ToDORepository> findAll() {
		return ToDORepository.findAll();
	}

}
