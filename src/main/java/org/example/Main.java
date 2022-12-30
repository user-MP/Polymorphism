package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

       Doctor doc1=new Doctor("Smith","Bob", Employee.Gender.MALE ,
       LocalDate.of(1990,3,2),
       LocalDate.of(2015,5,14),
       19500, Doctor.TypeDoctor.CARDIOLOG,42);

       Doctor doc2=new Doctor("Grisham","John",Employee.Gender.MALE,
       LocalDate.of(1999,12,21),
       LocalDate.of(2019,2,24),
       12500, Doctor.TypeDoctor.ALLERGIST,14);

       Policer policer1=new Policer("Cornwell", "Patricia",Employee.Gender.FEMALE,
       LocalDate.of(1994,10,29),
       LocalDate.of(2018,3,12),
       12500,318);

       Policer policer2=new Policer("Archer", "Jeffrey",Employee.Gender.MALE,

       LocalDate.of(1992,12,9),
       LocalDate.of(2018,12,12),
       14500,258);

       System.out.println("Reward for doctor " + doc1.getSurname() +" : " + doc1.reward() +" UAH");

       System.out.println("Reward for doctor " + doc2.getSurname() +" : " + doc2.reward() +" UAH");

       System.out.println("Reward for policer " + policer1.getSurname() + " : " + policer1.reward() +" UAH");

       System.out.println("Reward for policer " + policer2.getSurname() +" : " + policer2.reward() +" UAH");

    }
}