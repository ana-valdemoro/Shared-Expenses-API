package com.shared.expenses.api.sharedexpensesapi.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Friends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String lastName;


    public Friend(){}
    public Friend(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId(){ return id;}
    public String getLastName(){ return lastName;}
    public String getName(){return name;}
    // public float getSaldo(){
    //     return
    // }
}
