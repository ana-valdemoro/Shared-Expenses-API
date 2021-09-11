package com.shared.expenses.api.sharedexpensesapi.Models;

public class Balance {
    private Friend friend;
    private float value;

    public Balance(Friend friend, float value){
        this.friend = friend;
        this.value = value;
    }

    public Friend getFriend(){
        return this.friend;
    }
    public float getValue(){
        return this.value;
    }
}
