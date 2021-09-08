package com.shared.expenses.api.sharedexpensesapi;

import com.shared.expenses.api.sharedexpensesapi.Models.Expense;    
import com.shared.expenses.api.sharedexpensesapi.Repositories.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 2)
@Component
public class ExpensesLoader implements CommandLineRunner {
    public final ExpenseRepository expenseRepository;

    public ExpensesLoader(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadExpenses();
    }

    private void loadExpenses() {
        if (expenseRepository.count() == 0) {
           
            expenseRepository.save(
                new Expense(21.11f , "Cena", "2018-04-05" )
            );
            expenseRepository.save(
                new Expense(11.11f , "Almuerzo", "2020-04-05" )
            );
            System.out.println("Sample Expenses loaded");
        }
    }
}