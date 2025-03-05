package ru.zelenka.zelenka;

import java.time.LocalDate;
import java.time.Period;

import ru.zelenka.zelenka.util.WordDeclension;

public class Employee {
    private LocalDate startDate;
    private LocalDate currentDate;


   
    public Employee(LocalDate startDate, LocalDate currentDate) {
        this.startDate = startDate;
        this.currentDate = currentDate;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currenDate) {
        this.currentDate = currenDate;
    }
    
    

    public Period calculateSeniority() {
        return Period.between(startDate, currentDate);
    }

    public String getSeniorityAsString() {
        Period seniority = calculateSeniority();
        int years = seniority.getYears();
        int months = seniority.getMonths();
        int days = seniority.getDays();

        String yearsText = WordDeclension.getCorrectForm(years, "год", "года", "лет");
        String monthsText = WordDeclension.getCorrectForm(months, "месяц", "месяца", "месяцев");
        String daysText = WordDeclension.getCorrectForm(days, "день", "дня", "дней");

        return String.format("%d %s %d %s %d %s",
                years, yearsText,
                months, monthsText,
                days, daysText);
    }

    public double getSeniorityAsStringMonths() {
        Period seniority = calculateSeniority();
        int months = (seniority.getYears()*12) + seniority.getMonths();

        return months;
    }
    
    public double getSeniorityAsStringMonths1_5() {
        Period seniority = calculateSeniority();
        double months = ((seniority.getYears()*12) + seniority.getMonths())*1.5;

        return months;
    }
    
    public double getSeniorityAsStringMonths3() {
        Period seniority = calculateSeniority();
       
        double months = ((seniority.getYears()*12) + seniority.getMonths())*3;

        return months;
    }
   
    
}
