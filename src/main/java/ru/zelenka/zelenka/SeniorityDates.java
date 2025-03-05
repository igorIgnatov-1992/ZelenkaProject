package ru.zelenka.zelenka;

import java.time.LocalDate;
import java.time.Period;

public class SeniorityDates {
    
    private LocalDate start_army; // Начало службы
    private LocalDate contract_end; // До конца контракта
    private LocalDate prizivEnd; // Конец срочной службы
    private LocalDate start1Contract; // Начало 1 контракта (1 год за 1.5)
    private LocalDate startAcademy; // АКАДЕМИЯ
    private LocalDate endAcademy; // ВЫПУСК ИЗ АКАДЕМИИ
    private LocalDate start1vvo; // СЛУЖБА В ВВО
    private LocalDate start1svo; // НАЧАЛО 1 СВО
    private LocalDate end1svo; // КОНЕЦ 1 СВО
    private LocalDate start2svo; // НАЧАЛО 2 СВО
    private LocalDate end2svo; // КОНЕЦ 2 СВО
    private LocalDate start3svo; // НАЧАЛО 3 СВО
    private LocalDate end3svo; // КОНЕЦ 3 СВО

    
    
    public SeniorityDates(LocalDate start_army, LocalDate contract_end, LocalDate prizivEnd, LocalDate start1Contract,
            LocalDate startAcademy, LocalDate endAcademy, LocalDate start1vvo, LocalDate start1svo, LocalDate end1svo,
            LocalDate start2svo, LocalDate end2svo, LocalDate start3svo, LocalDate end3svo) {
        this.start_army =  LocalDate.of(2012, 7, 9); // Начало службы;
        this.contract_end = LocalDate.of(2027, 6, 20); // До конца контракта;
        this.prizivEnd = LocalDate.of(2013, 07, 9); // Конец срочной службы;
        this.start1Contract = LocalDate.of(2013, 07, 10); // Начало 1 контракта (1 год за 1.5);
        this.startAcademy = LocalDate.of(2014, 8, 1); // АКАДЕМИЯ
        this.endAcademy = LocalDate.of(2019, 6, 23); // ВЫПУСК ИЗ АКАДЕМИИ
        this.start1vvo = LocalDate.of(2019, 7, 23); // СЛУЖБА В ВВО
        this.start1svo = LocalDate.of(2022, 8, 2); // НАЧАЛО 1 СВО
        this.end1svo = LocalDate.of(2023, 3, 26); // КОНЕЦ 1 СВО
        this.start2svo = LocalDate.of(2023, 7, 19); // НАЧАЛО 2 СВО
        this.end2svo = LocalDate.of(2023, 11, 13); // КОНЕЦ 2 СВО
        this.start3svo = LocalDate.of(2024, 3, 20); // НАЧАЛО 3 СВО
        this.end3svo = LocalDate.of(2024, 6, 21); // КОНЕЦ 3 СВО
    }



    public LocalDate getStart_army() {
        return start_army;
    }



    public void setStart_army(LocalDate start_army) {
        this.start_army = start_army;
    }



    public LocalDate getContract_end() {
        return contract_end;
    }



    public void setContract_end(LocalDate contract_end) {
        this.contract_end = contract_end;
    }



    public LocalDate getPrizivEnd() {
        return prizivEnd;
    }



    public void setPrizivEnd(LocalDate prizivEnd) {
        this.prizivEnd = prizivEnd;
    }



    public LocalDate getStart1Contract() {
        return start1Contract;
    }



    public void setStart1Contract(LocalDate start1Contract) {
        this.start1Contract = start1Contract;
    }



    public LocalDate getStartAcademy() {
        return startAcademy;
    }



    public void setStartAcademy(LocalDate startAcademy) {
        this.startAcademy = startAcademy;
    }



    public LocalDate getEndAcademy() {
        return endAcademy;
    }



    public void setEndAcademy(LocalDate endAcademy) {
        this.endAcademy = endAcademy;
    }



    public LocalDate getStart1vvo() {
        return start1vvo;
    }



    public void setStart1vvo(LocalDate start1vvo) {
        this.start1vvo = start1vvo;
    }



    public LocalDate getStart1svo() {
        return start1svo;
    }



    public void setStart1svo(LocalDate start1svo) {
        this.start1svo = start1svo;
    }



    public LocalDate getEnd1svo() {
        return end1svo;
    }



    public void setEnd1svo(LocalDate end1svo) {
        this.end1svo = end1svo;
    }



    public LocalDate getStart2svo() {
        return start2svo;
    }



    public void setStart2svo(LocalDate start2svo) {
        this.start2svo = start2svo;
    }



    public LocalDate getEnd2svo() {
        return end2svo;
    }



    public void setEnd2svo(LocalDate end2svo) {
        this.end2svo = end2svo;
    }



    public LocalDate getStart3svo() {
        return start3svo;
    }



    public void setStart3svo(LocalDate start3svo) {
        this.start3svo = start3svo;
    }



    public LocalDate getEnd3svo() {
        return end3svo;
    }



    public void setEnd3svo(LocalDate end3svo) {
        this.end3svo = end3svo;
    }


        

    
}
