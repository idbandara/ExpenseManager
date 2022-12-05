package com.expense.expensemanager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Expense {
    private int id;
    private String reason;
    private float amount;
    private float vat;
    private Date date;
}
