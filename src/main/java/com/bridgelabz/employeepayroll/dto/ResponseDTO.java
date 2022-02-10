package com.bridgelabz.employeepayroll.dto;

import com.bridgelabz.employeepayroll.entity.EmployeePayrollData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String string, EmployeePayrollData payrollData) {
        this.message = string;
        this.data = payrollData;
    }
}
