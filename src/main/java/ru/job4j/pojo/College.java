package ru.job4j.pojo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Михайлов Михаил Михайлович");
        student.setGroupName("ПК221");
        student.setEntranceDate(new GregorianCalendar(2000, Calendar.SEPTEMBER, 1).getTime());
        System.out.println("Студент " + student.getFullName());
        System.out.println("Группа " + student.getGroupName());
        System.out.println("Поступил в " + student.getEntranceDate());
    }
}
