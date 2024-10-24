package ru.mirea.pavlov;

import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        int year = cal.get(java.util.Calendar.YEAR);
        int month = cal.get(java.util.Calendar.MONTH) + 1;
        int day = cal.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        cal.setTimeInMillis(1234567898765L);
        year = cal.get(java.util.Calendar.YEAR);
        month = cal.get(java.util.Calendar.MONTH) + 1;
        day = cal.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Год для 1234567898765L: " + year);
        System.out.println("Месяц для 1234567898765L: " + month);
        System.out.println("День для 1234567898765L: " + day);
    }
}