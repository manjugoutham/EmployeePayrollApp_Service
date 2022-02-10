package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.entity.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
