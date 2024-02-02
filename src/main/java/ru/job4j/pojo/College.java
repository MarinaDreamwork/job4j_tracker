package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Михайлов Михаил Михайлович");
        student.setGroupName("ПК221");
        student.setEntranceDate(new GregorianCalendar(2000, 8, 1).getTime());
        System.out.println("Студент " + student.getFullName() + " учится в группе " + student.getGroupName() + ", поступил " + student.getEntranceDate());
    }
}
