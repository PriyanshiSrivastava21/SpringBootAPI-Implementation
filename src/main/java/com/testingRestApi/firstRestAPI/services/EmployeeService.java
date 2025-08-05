package com.testingRestApi.firstRestAPI.services;

import com.testingRestApi.firstRestAPI.dto.EmployeeDTO;
import com.testingRestApi.firstRestAPI.entity.EmployeeEntity;
import com.testingRestApi.firstRestAPI.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository,ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }
    public List<EmployeeEntity> getAllEmployee(){
        List<EmployeeEntity> employeeEntityList=employeeRepository.findAll();
        return employeeEntityList;
    }
//converting entity into dto
    public EmployeeDTO getEmployeeById(Long id){
EmployeeEntity employeeEntity=employeeRepository.getById(id);
return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    //converting dto into entity
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO){
EmployeeEntity employeeEntity= modelMapper.map(employeeDTO,EmployeeEntity.class);
return modelMapper.map(employeeRepository.save(employeeEntity),EmployeeDTO.class);
    }

    public void deleteEmpById(Long id){
    employeeRepository.deleteById(id);
    }
}
