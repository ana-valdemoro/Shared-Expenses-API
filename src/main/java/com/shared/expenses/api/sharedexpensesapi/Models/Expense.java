package com.shared.expenses.api.sharedexpensesapi.Models;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


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
    // @ManyToOne
    // @JoinColumn(name="id", nullable=false)
    // private Friend person;
    @Column
    private LocalDate date;

    public Expense(float value, String description, String date){
        this.value = value;
        this.description = description;
        this.date  = LocalDate.parse(date);
        // this.person = person;
    }
    public Expense(){}
    public Long getId(){ return id;}
    public float getValue(){ return value;}
    public String getDescription(){ return description;}
    // public Friend getPerson(){ return person;}
    public LocalDate getDate(){ return date;}
}
