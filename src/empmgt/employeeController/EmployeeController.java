/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.employeeController;

import empmgt.employeeService.EmployeeService;
import empmgt.model.Employee;

/**
 *
 * @author USER
 */
public class EmployeeController {
    public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        Employee emp = es.save(e);
        return emp;
    }
}
