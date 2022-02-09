package com.bridgelabz.employeepayroll.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollDTO
{
    @NotNull
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Employee name Invalid")
    public String name;
    @Min(value = 1000,message = "min salary should be more tham 1000")
    public long salary;

}
