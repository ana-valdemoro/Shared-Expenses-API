package com.shared.expenses.api.sharedexpensesapi.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Friends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private long id;
    @Column
    private String name;
    @Column
    private String lastName;



    public Friend(String name, String lastName, long id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public Long getId(){ return id;}
    public String getLastName(){ return lastName;}
    public String getName(){return name;}
}
