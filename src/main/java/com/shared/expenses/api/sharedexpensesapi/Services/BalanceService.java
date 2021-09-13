package com.shared.expenses.api.sharedexpensesapi.Services;

import java.util.ArrayList;
import java.util.List;
import com.shared.expenses.api.sharedexpensesapi.Models.Balance;
import com.shared.expenses.api.sharedexpensesapi.Models.Expense;
import com.shared.expenses.api.sharedexpensesapi.Models.Friend;
import com.shared.expenses.api.sharedexpensesapi.Repositories.ExpenseRepository;
import com.shared.expenses.api.sharedexpensesapi.Repositories.FriendRepository;

import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    private FriendRepository friendRepository;
    private ExpenseRepository expenseRepository;
    
    public BalanceService(FriendRepository friendRepository, ExpenseRepository expenseRepository){
        this.friendRepository = friendRepository;
        this.expenseRepository = expenseRepository;
    }

    public List<Balance> getBalances(){
        List<Friend> friends = this.friendRepository.findAll();
        List<Expense> expenses = expenseRepository.findByOrderByDateDesc();
        List<Balance> balanceList= new ArrayList<Balance>();
        for(Friend friend : friends){
            List<Expense> individualExpenses = expenseRepository.findByFriendId(friend.getId());
            Balance balance = new Balance(friend, friend.getBalance(friends, expenses, individualExpenses));
            balanceList.add(balance);
        }
        return balanceList;
    }
}
