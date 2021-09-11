package com.shared.expenses.api.sharedexpensesapi.Controllers;


import java.util.List;

import com.shared.expenses.api.sharedexpensesapi.Models.Balance;
import com.shared.expenses.api.sharedexpensesapi.Services.BalanceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharedexpenses")
public class SharedExpensesController {
    private final BalanceService balanceService;

    SharedExpensesController(BalanceService balanceService){
      this.balanceService = balanceService;
    }
    @GetMapping
	public List<Balance> getBalance() {
		return this.balanceService.getBalances();
	}

}
