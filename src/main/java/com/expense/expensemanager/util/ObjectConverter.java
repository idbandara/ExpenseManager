package com.expense.expensemanager.util;

import com.expense.expensemanager.dto.Expense;
import com.expense.expensemanager.entity.PersonalExpense;

public class ObjectConverter {
    public static Expense convertToExpenseDto(PersonalExpense personalExpense){
        Expense expense = new Expense();
        expense.setId(personalExpense.getId());
        expense.setReason(personalExpense.getExpenseReason());
        expense.setAmount(personalExpense.getExpenseAmount());
        expense.setVat(personalExpense.getExpenseVat());
        expense.setDate(personalExpense.getExpenseDate());
        return expense;
    }
    public static PersonalExpense convertToExpenseEntity(Expense expense){
        PersonalExpense personalExpense = new PersonalExpense();
        personalExpense.setId(expense.getId());
        personalExpense.setExpenseReason(expense.getReason());
        personalExpense.setExpenseAmount(expense.getAmount());
        personalExpense.setExpenseVat(expense.getVat());
        personalExpense.setExpenseDate(expense.getDate());
        return personalExpense;
    }
}
