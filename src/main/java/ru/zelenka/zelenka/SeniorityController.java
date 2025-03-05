package ru.zelenka.zelenka;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.zelenka.zelenka.util.WordDeclension;

@Controller
public class SeniorityController {
    
    @GetMapping("/")
    public String showSeniority(Model model) {
        // Задаем даты в коде
        LocalDate start_army =  LocalDate.of(2012, 7, 9); // Начало службы;
        LocalDate contract_end = LocalDate.of(2027, 6, 20); // До конца контракта;
        LocalDate currentDate = LocalDate.now();
        LocalDate prizivEnd = LocalDate.of(2013, 07, 9); // Конец срочной службы;
		LocalDate start1Contract = LocalDate.of(2013, 07, 10); // Начало 1 контракта (1 год за 1.5);
		LocalDate startAcademy = LocalDate.of(2014, 8, 1); // АКАДЕМИЯ
		LocalDate endAcademy = LocalDate.of(2019, 6, 23); // ВЫПУСК ИЗ АКАДЕМИИ
        LocalDate start1vvo = LocalDate.of(2019, 7, 23); // СЛУЖБА В ВВО
        LocalDate start1svo = LocalDate.of(2022, 8, 2); // НАЧАЛО 1 СВО
        LocalDate end1svo = LocalDate.of(2023, 3, 26); // КОНЕЦ 1 СВО
        LocalDate start2svo = LocalDate.of(2023, 7, 19); // НАЧАЛО 2 СВО
        LocalDate end2svo = LocalDate.of(2023, 11, 13); // КОНЕЦ 2 СВО
        LocalDate start3svo = LocalDate.of(2024, 3, 20); // НАЧАЛО 3 СВО
        LocalDate end3svo = LocalDate.of(2024, 6, 21); // КОНЕЦ 3 СВО

        // Создаем объект Employee и вычисляем выслугу лет
        Employee calendarDays = new Employee(start_army, currentDate);
        String calendar = calendarDays.getSeniorityAsString();

        Employee contractEnd = new Employee(currentDate, contract_end);
        String contractEndString = contractEnd.getSeniorityAsString();

        //Расчет выслуги
        Employee priziv = new Employee(start_army, prizivEnd);
        double period1 = priziv.getSeniorityAsStringMonths();

        Employee academy = new Employee(startAcademy, endAcademy);
        double period2 = period1 + academy.getSeniorityAsStringMonths();

        Employee vvo1 = new Employee(start1Contract, startAcademy);
        double period3 = period2 + vvo1.getSeniorityAsStringMonths1_5();

        Employee vvo2 = new Employee(start1vvo, start1svo);
        double period4 = period3 + vvo2.getSeniorityAsStringMonths1_5();

        Employee svo1 = new Employee(start1svo, end1svo);
        double period5 = period4 + svo1.getSeniorityAsStringMonths3();

        Employee vvo3 = new Employee(end1svo, start2svo);
        double period6 = period5 + vvo3.getSeniorityAsStringMonths1_5();

        Employee svo2 = new Employee(start2svo, end2svo);
        double period7 = period6 + svo2.getSeniorityAsStringMonths3();

        Employee vvo4 = new Employee(end2svo, start3svo);
        double period8 = period7 + vvo4.getSeniorityAsStringMonths1_5();

        Employee svo3 = new Employee(start3svo, end3svo);
        double period9 = period8 + svo3.getSeniorityAsStringMonths3();

        Employee vvo5 = new Employee(end3svo, currentDate);
        double total = period9 + vvo5.getSeniorityAsStringMonths1_5();
        
        int years = (int) (total /12);
        int remainingMonths = (int) total % 12;
        String yearsString = years + " лет";
        String remainiString = remainingMonths + " " + WordDeclension.getCorrectForm(remainingMonths, "месяц", "месяца", "месяцев");


        // Передаем результат в шаблон
        model.addAttribute("calendar", calendar);
        model.addAttribute("contractEndString", contractEndString);
        model.addAttribute("yearsString", yearsString);
        model.addAttribute("remainiString", remainiString);
        return "index";


    }
}
