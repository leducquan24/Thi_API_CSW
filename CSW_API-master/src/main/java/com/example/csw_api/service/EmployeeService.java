package com.example.csw_api.service;

import com.example.csw_api.model.Employees;

import java.util.List;

public interface EmployeeService {
    public void save(Employees employees);
    public void delete(Integer id);
    public Employees findById(Integer id);
    public List<Employees> findAll();
    public List<Employees> findAllByNameContainsIgnoreCase(String name);
}
