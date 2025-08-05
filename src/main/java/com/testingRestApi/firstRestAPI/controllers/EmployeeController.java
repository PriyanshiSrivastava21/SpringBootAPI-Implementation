package com.testingRestApi.firstRestAPI.controllers;
//operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.testingRestApi.firstRestAPI.dto.EmployeeDTO;
import com.testingRestApi.firstRestAPI.entity.EmployeeEntity;
import com.testingRestApi.firstRestAPI.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController {
    private final EmployeeService employeeService;
@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> getEmployees(){
    return  employeeService.getAllEmployee();
}

@GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }
    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long employeeId){
         employeeService.deleteEmpById(employeeId);
    }
}
