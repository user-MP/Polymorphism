package org.example;

import java.time.LocalDate;


public class Policer extends Employee {

    private int countDetectionOfOffencesPerMonth;


    public Policer(String surname, String name, Gender gender, LocalDate date_birthday, LocalDate date_start_work, double salary, int countDetectioOfOffencesPerMonth) {
        super(surname, name,gender, date_start_work, date_birthday, salary);
        this.countDetectionOfOffencesPerMonth = countDetectioOfOffencesPerMonth;
    }

    @Override
    public double reward() {


        double reward=0;

        if(salary>20000 &&  countDetectionOfOffencesPerMonth<20){

            reward= (salary*(0.2*countDetectionOfOffencesPerMonth));

        }
        else if(salary>50000 && countDetectionOfOffencesPerMonth<30){

            reward= ( salary*(0.2*countDetectionOfOffencesPerMonth));
        }
        else{
            reward= (salary*0.1);
        }

        return Math.floor(reward);
    }

    public int getCountDetectionOfOffencesPerMonth() {
        return countDetectionOfOffencesPerMonth;
    }

    public void setCountDetectionOfOffencesPerMonth(int countDetectionOfOffencesPerMonth) {
        this.countDetectionOfOffencesPerMonth = countDetectionOfOffencesPerMonth;
    }
}
