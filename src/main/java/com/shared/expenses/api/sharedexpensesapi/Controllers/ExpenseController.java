package com.shared.expenses.api.sharedexpensesapi.Controllers;

import com.shared.expenses.api.sharedexpensesapi.Models.Expense;
import com.shared.expenses.api.sharedexpensesapi.Repositories.ExpenseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseRepository repository;
    
    ExpenseController(ExpenseRepository repository){
        this.repository = repository;
    }

    @GetMapping
	public Iterable<Expense> getAlIterable() {
		return repository.findByOrderByDateDesc();
	}

    // @PostMapping
    // public Expense createFriend(@RequestBody Expense expense) {
    //     return repository.save(friend);
    // }
}
