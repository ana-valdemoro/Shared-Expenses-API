package com.shared.expenses.api.sharedexpensesapi;

import com.shared.expenses.api.sharedexpensesapi.Models.Expense;
import com.shared.expenses.api.sharedexpensesapi.Models.Friend;
import com.shared.expenses.api.sharedexpensesapi.Repositories.ExpenseRepository;
import com.shared.expenses.api.sharedexpensesapi.Repositories.FriendRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 1)
@Component
public class DataLoader implements CommandLineRunner {
    public final FriendRepository friendRepository;
    public final ExpenseRepository expenseRepository;

    public DataLoader(FriendRepository FriendRepository, ExpenseRepository expenseRepository) {
        this.friendRepository = FriendRepository;
        this.expenseRepository = expenseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        if (friendRepository.count() == 0 && expenseRepository.count() == 0) {
            Friend friend1 = new Friend("Ana", "Valdemoro");
            Friend friend2 = new Friend("Sara", "Valdemoro");
            friendRepository.save(friend1);
            friendRepository.save(friend2);
            expenseRepository.save(
                new Expense(100.00f , "Cena", "2018-04-05", friend1 )
            );
            expenseRepository.save(
                new Expense(50.00f , "Almuerzo", "2020-04-05", friend2)
            );
            System.out.println("Sample friends and expenses loaded");
        }
    }
}