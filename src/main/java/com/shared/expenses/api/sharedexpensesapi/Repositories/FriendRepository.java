package com.shared.expenses.api.sharedexpensesapi.Repositories;

import java.util.List;
import com.shared.expenses.api.sharedexpensesapi.Models.Friend;

public interface FriendRepository extends BaseRepository<Friend, Long>{
    List<Friend> findAll(); 
}