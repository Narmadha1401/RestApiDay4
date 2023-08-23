package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Studmodel;
@Repository
public interface Studrepo extends JpaRepository<Studmodel, Integer> {

}
