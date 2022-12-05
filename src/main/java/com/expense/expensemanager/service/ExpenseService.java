package com.expense.expensemanager.service;

import com.expense.expensemanager.dto.Expense;
import com.expense.expensemanager.exception.ExpenseDataNotFoundException;
import com.expense.expensemanager.exception.ExpenseInsertionFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {
    List<Expense> getAllCakes() throws ExpenseDataNotFoundException;

    Expense createExpense(Expense expense) throws ExpenseInsertionFailureException;
}
