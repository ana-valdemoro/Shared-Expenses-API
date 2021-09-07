package com.shared.expenses.api.sharedexpensesapi.Models;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;


@Entity( name= "Expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private long id;
    @Column
    private float value; 
    @Column
    private String description;
    @ManyToOne
    @JoinColumn
    private Friend person;
    @Column
    @CreationTimestamp
    private Date date;

    public Expense(float value, String description, Friend person, Date date){
        this.value = value;
        this.description = description;
        this.person = person;
        this.date = date;
    }

    public float getValue(){ return value;}
    public String getDescription(){ return description;}
    public Friend getPerson(){ return person;}
    public Date getDate(){ return date;}
}
