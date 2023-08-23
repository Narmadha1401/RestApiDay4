package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Studmodel;
import com.example.demo.repository.Studrepo;

@Service
public class Studservice {
	@Autowired
	Studrepo sr;
	//to create
	public List<Studmodel> saveinfo(List<Studmodel> sm)
	{
		return (List<Studmodel>)sr.saveAll(sm);
	}
	//to get
	public List<Studmodel> showinfo()
	{
		return sr.findAll();
	}
	//get by id
	public Optional<Studmodel> showbyid(int id)
	{
		return sr.findById(id);
	}
	//put by id
	public String updateinfo(int id,Studmodel sm)
	{
		sr.saveAndFlush(sm);
		if(sr.existsById(id))
		{
			return "Upadted";
		}
		else
		{
			return "Invalid id";
		}
	}
	//delete by id
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}

}
