package com.shared.expenses.api.sharedexpensesapi.Models;

public class Balance {
    private Friend friend;
    private float value;

    public void setValue(float value) {
        this.value = value;
    }
    public float getValue(){
        return this.value;
    }
    public void setFriend(Friend friend){
        this.friend = friend;
    }
    public Friend getFriend(){
        return this.friend;
    }
}
