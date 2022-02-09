package com.bridgelabz.employeepayroll.entity;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payroll_db")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public @Data class EmployeePayrollData
{
    @Id
    private int employeeId;
    @Column(name = "name")
    private String name;
    private long salary;

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO)
    {
        this.employeeId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }


}
