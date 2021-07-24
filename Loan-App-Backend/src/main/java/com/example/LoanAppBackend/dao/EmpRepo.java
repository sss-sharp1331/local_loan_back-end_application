package com.example.LoanAppBackend.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.LoanAppBackend.Entity.EmpEnt;

public interface EmpRepo extends CrudRepository<EmpEnt, Integer>{

}
