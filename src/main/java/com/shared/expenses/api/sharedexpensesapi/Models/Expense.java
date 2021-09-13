package com.shared.expenses.api.sharedexpensesapi.Models;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity( name= "Expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column
    private float value; 
    @Column
    private String description;
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_friend",  nullable = false )
    private Friend friend;
    @Column
    private LocalDate date;

    public Expense(float value, String description, String date, Friend friend){
        this.value = value;
        this.description = description;
        this.date  = LocalDate.parse(date);
        this.friend = friend;
    }

    public static float sumtotalExpenses(List<Expense> expenses){
        float totalExpenses = 0.00f;
        for (Expense expense : expenses){
            totalExpenses += expense.getValue();
        }
        return totalExpenses;
    } 
    public Expense(){}
    public Long getId(){ return id;}
    public float getValue(){ return value;}
    public String getDescription(){ return description;}
    public Friend getFriend(){ return friend;}
    public LocalDate getDate(){ return date;}
}
