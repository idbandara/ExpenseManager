package com.expense.expensemanager.service;

import com.expense.expensemanager.dto.Expense;
import com.expense.expensemanager.entity.PersonalExpense;
import com.expense.expensemanager.exception.ExpenseDataNotFoundException;
import com.expense.expensemanager.exception.ExpenseInsertionFailureException;
import com.expense.expensemanager.repository.ExpenseRepository;
import com.expense.expensemanager.util.ObjectConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> getAllCakes() throws ExpenseDataNotFoundException {
        List<Expense> expenses = new ArrayList<Expense>();
        List<PersonalExpense> personalExpenses = expenseRepository.findAll();
        if(!personalExpenses.isEmpty()){
            expenses= personalExpenses.stream().map(x -> ObjectConverter.convertToExpenseDto(x)).collect(Collectors.toList());
            return expenses;
        }else{
            throw new ExpenseDataNotFoundException("No Data Found");
        }
    }

    @Override
    public Expense createExpense(Expense expense) throws ExpenseInsertionFailureException {
        return ObjectConverter.convertToExpenseDto(expenseRepository.save(ObjectConverter.convertToExpenseEntity(expense)));
    }
}
