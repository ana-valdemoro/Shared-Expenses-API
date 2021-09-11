package com.shared.expenses.api.sharedexpensesapi.Repositories;

import java.util.List;
import com.shared.expenses.api.sharedexpensesapi.Models.Expense;


public interface ExpenseRepository extends BaseRepository<Expense, Long> {
    List<Expense> findByOrderByDateDesc();

    List<Expense> findByFriendId(Long id);


}
