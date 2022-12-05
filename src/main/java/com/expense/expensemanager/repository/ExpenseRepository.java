package com.expense.expensemanager.repository;

import com.expense.expensemanager.entity.PersonalExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<PersonalExpense, Integer> {
}
