package com.shared.expenses.api.sharedexpensesapi.Repositories;

import java.util.Optional;

import com.shared.expenses.api.sharedexpensesapi.Models.Friend;

public interface FriendRepository extends BaseRepository<Friend, Long>{
    Optional<Friend> findById(Long primaryKey);

    Iterable<Friend> findAll(); 
}