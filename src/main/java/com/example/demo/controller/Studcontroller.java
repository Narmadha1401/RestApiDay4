package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studmodel;
import com.example.demo.service.Studservice;

@RestController
public class Studcontroller {
	@Autowired
	Studservice ss;
	@PostMapping("addstud")
	public List<Studmodel> add(@RequestBody List<Studmodel> sm)
	{
		return ss.saveinfo(sm);
	}
	@GetMapping("showcust")
	public List<Studmodel> show()
	{
		return ss.showinfo();
	}
	@GetMapping("showbyid/{id}")
	public Optional<Studmodel> showid(@PathVariable int id)
	{
		return ss.showbyid(id);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Studmodel sm)
	{
		return ss.updateinfo(id, sm);
	}
	@DeleteMapping("delid/{id}")
	public void deletebyid(@PathVariable int id)
	{
		ss.deleteid(id);
	}

}
