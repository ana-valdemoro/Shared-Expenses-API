package com.shared.expenses.api.sharedexpensesapi.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shared.expenses.api.sharedexpensesapi.Models.Friend;
import com.shared.expenses.api.sharedexpensesapi.Repositories.FriendRepository;

@RestController
@RequestMapping("/friends")
public class FriendController {
    private final FriendRepository repository;
    
    FriendController(FriendRepository repository){
        this.repository = repository;
    }

    @GetMapping
	public Iterable<Friend> getAlIterable() {
		return repository.findAll();
	}
    
    @PostMapping
    public Friend createFriend(@RequestBody Friend friend) {
        System.out.println(friend);
        return repository.save(friend);
       
    }
}
