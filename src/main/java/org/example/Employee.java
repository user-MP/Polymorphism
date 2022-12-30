package org.example;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee implements Computation {

    enum Gender {MALE,FEMALE}

    protected String surname;
    protected String name;

    protected LocalDate date_start_work;

    protected LocalDate date_birthday;

    protected double salary;

    protected Gender gender;

    public Employee(){


    }

    public Employee(String surname, String name,Gender gender, LocalDate date_start_work, LocalDate date_birthday, double salary) {
        this.surname = surname;
        this.name = name;
        this.gender=gender;
        this.date_start_work = date_start_work;
        this.date_birthday = date_birthday;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_start_work() {
        return date_start_work;
    }

    public void setDate_start_work(LocalDate date_start_work) {
        this.date_start_work = date_start_work;
    }

    public LocalDate getDate_birthday() {
        return date_birthday;
    }

    public void setDate_birthday(LocalDate date_birthday) {
        this.date_birthday = date_birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
