package com.expense.expensemanager;

import com.expense.expensemanager.dto.Expense;
import com.expense.expensemanager.exception.ExpenseDataNotFoundException;
import com.expense.expensemanager.exception.ExpenseInsertionFailureException;
import com.expense.expensemanager.service.ExpenseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ExpenseServiceTest {
    @Mock
    ExpenseService expenseService;
    @Mock
    private List<Expense> expenses;
    @Mock
    Expense expense;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        expense = Expense.builder().id(1).build();
        expenses = List.of(new Expense(), new Expense());
    }

    @Test
    public void createCake() throws ExpenseInsertionFailureException {
        expense.setReason("Fuel Cost");
        expense.setAmount(80.01f);
        expense.setVat(16f);
        expense.setDate(Date.valueOf("2022-12-05"));
        when(expenseService.createExpense(expense)).thenReturn(expense);
        assertEquals(1, expense.getId());
    }


    @Test
    public void testGetAllCakes() throws ExpenseDataNotFoundException {
        when(expenseService.getAllCakes()).thenReturn(expenses);
        assertEquals(2,  expenses.size());
    }
}
