package com.example.restapiemployee.employee;

import com.example.restapiemployee.employee.dao.EmployeeDao;
import com.example.restapiemployee.employee.dao.EmployeeEntity;
import com.example.restapiemployee.employee.request.EmployeeReq;
import com.example.restapiemployee.employee.response.EmployeeResp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public EmployeeResp createEmployee(EmployeeReq emp) {

        EmployeeEntity employeeEntity = new EmployeeEntity(
                emp.getName(),
                emp.getCNP(),
                emp.getDateOfBirth()
        );
        employeeDao.save(employeeEntity);
        return new EmployeeResp(employeeEntity);
    }

}
