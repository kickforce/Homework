package com.homework.hashmap;

import java.util.HashMap;

/**
 * В классе Map объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка.
 * Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
 * Значения можешь выбрать любые.
 * Требования:
 * •	В классе Map нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
 * •	В классе Map должен быть публичный статический метод addStudents с типом возвращаемого значения void.
 * •	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.
 */
public class Map {

  public static HashMap<String, Double> grades = new HashMap<>();

  public static void main(String[] args) {
    addStudents();
    System.out.println(grades);
  }

  public static void addStudents() {
    grades.put("Иван", 3.3);
    grades.put("Петр", 4.3);
    grades.put("Сергей", 4.4);
    grades.put("Евгений", 4.1);
    grades.put("Юрий", 3.3);

  }
}
