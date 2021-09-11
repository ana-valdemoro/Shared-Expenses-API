package com.shared.expenses.api.sharedexpensesapi.Controllers;


import java.util.List;

import com.shared.expenses.api.sharedexpensesapi.Models.Balance;
import com.shared.expenses.api.sharedexpensesapi.Models.SharedExpensesGroup;
import com.shared.expenses.api.sharedexpensesapi.Repositories.ExpenseRepository;
import com.shared.expenses.api.sharedexpensesapi.Repositories.FriendRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharedexpenses")
public class SharedExpensesController {
    private final SharedExpensesGroup expensesGroup;

    SharedExpensesController(FriendRepository friendRepository, ExpenseRepository expenseRepository){
        this.expensesGroup =  new SharedExpensesGroup(friendRepository, expenseRepository);
    }
    @GetMapping
	public List<Balance> getBalance() {
		return this.expensesGroup.getBalances();
	}

}
