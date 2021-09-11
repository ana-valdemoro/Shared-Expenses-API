package com.shared.expenses.api.sharedexpensesapi.Controllers;


import java.util.List;
import com.shared.expenses.api.sharedexpensesapi.Models.Expense;    
import com.shared.expenses.api.sharedexpensesapi.Repositories.ExpenseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseRepository expenseRepository;

    ExpenseController(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    @GetMapping
	public List<Expense> getAllExpenses() {
		return expenseRepository.findByOrderByDateDesc();
	}

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }

}
