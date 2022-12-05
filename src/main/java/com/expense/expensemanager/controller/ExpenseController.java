package com.expense.expensemanager.controller;

import com.expense.expensemanager.dto.Expense;
import com.expense.expensemanager.exception.ExpenseDataNotFoundException;
import com.expense.expensemanager.exception.ExpenseInsertionFailureException;
import com.expense.expensemanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("expenses")
    public List<Expense> getExpenses() throws ExpenseDataNotFoundException {
        return expenseService.getAllCakes();
    }

    @PostMapping("expenses")
    public Expense createExpense(@RequestBody Expense expense) throws ExpenseInsertionFailureException {
        return expenseService.createExpense(expense);
    }

}
