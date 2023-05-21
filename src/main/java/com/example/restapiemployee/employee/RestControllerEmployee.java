package com.example.restapiemployee.employee;

import com.example.restapiemployee.employee.request.EmployeeReq;
import com.example.restapiemployee.employee.response.EmployeeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RestControllerEmployee {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employees")
    public ResponseEntity<EmployeeResp> createEmployee(@RequestBody EmployeeReq emp) {
        return ResponseEntity.ok(employeeService.createEmployee(emp));
    }
}
