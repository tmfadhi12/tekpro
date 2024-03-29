package com.java.praktikum.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.praktikum.model.Expense;
import com.java.praktikum.repo.ExpenseRepo;

@Service
public class ExpenseService {
    private final ExpenseRepo expenseRepository;

    public ExpenseService(ExpenseRepo expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }

    public void updateExpense(Expense expense) {
        Expense savedExpense = expenseRepository.findById(expense.getId())
                .orElseThrow(()-> new RuntimeException(
                    String.format("Cannot Find Expense by ID %s", expense.getId())
                ));
        
        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());

        expenseRepository.save(expense);
    }

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseByName(String name) {
        return expenseRepository.findByName(name).orElseThrow(()-> new RuntimeException(
            String.format("Cannot Find Expense By Name %s", name)
        ));
    }

    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }
}
