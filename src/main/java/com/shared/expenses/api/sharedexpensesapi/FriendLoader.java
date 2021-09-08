package com.shared.expenses.api.sharedexpensesapi;

import com.shared.expenses.api.sharedexpensesapi.Models.Friend;
import com.shared.expenses.api.sharedexpensesapi.Repositories.FriendRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FriendLoader implements CommandLineRunner {
    public final FriendRepository friendRepository;

    public FriendLoader(FriendRepository FriendRepository) {
        this.friendRepository = FriendRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadFriends();
    }

    private void loadFriends() {
        if (friendRepository.count() == 0) {
            friendRepository.save(
                new Friend("Ana", "Valdemoro")
            );
            friendRepository.save(
                new Friend("Sara", "Valdemoro")
            );
            System.out.println("Sample friends loaded");
        }
    }
}