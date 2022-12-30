package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Doctor extends Employee {

    enum TypeDoctor{ENT, ALLERGIST, CARDIOLOG,PEDIATRICIAN }

    private int countPatiens;

    private TypeDoctor typeDoctor;



    public Doctor( ) {

    }

    public Doctor(String surname, String name,Gender gender , LocalDate date_birthday, LocalDate date_start_work,  double salary, TypeDoctor typeDoctor, int countPatiens) {
        super(surname, name, gender, date_start_work, date_birthday, salary);
        this.typeDoctor = typeDoctor;
        this.countPatiens=countPatiens;
    }

    @Override
    public double reward() {

        return Math.floor( switch(typeDoctor){

             case ENT -> (salary*countPatiens)/100.2;
             case ALLERGIST -> (salary*countPatiens)/100.4;
             case CARDIOLOG -> (salary*countPatiens)/100.5;
             case PEDIATRICIAN -> (salary*countPatiens)/100.8;

             default ->  500;
         });


    }

    public int getCountPatiens() {
        return countPatiens;
    }

    public void setCountPatiens(int countPatiens) {
        this.countPatiens = countPatiens;
    }

    public TypeDoctor getTypeDoctor() {
        return typeDoctor;
    }

    public void setTypeDoctor(TypeDoctor typeDoctor) {
        this.typeDoctor = typeDoctor;
    }
}
