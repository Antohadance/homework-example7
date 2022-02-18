package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание №1
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
     // Задание №2
        String strUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + strUpper);
     // Задание №3
        String mainName = "Иванов Семён Семёнович";
        mainName = mainName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + mainName);

    }
}
