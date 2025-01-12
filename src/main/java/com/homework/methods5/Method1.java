package com.homework.methods5;

/**
 * Перед тобой — плохой пример использования методов:
 * <p>
 * Методы разделили двустишие;
 * Одну строку кода не стоит оборачивать в отдельный метод.
 * Перепиши код так, чтобы весь текст выводился в методе main, а остальные методы удали.
 * Вывод программы не должен измениться.
 * Требования:
 * •	Метод main() должен быть единственным методом в классе Method1.
 * •	Вывод в консоли должен соответствовать условию задачи.
 */


public class Method1 {

  public static void main(String[] args) {
    MethodNew.print1();
    MethodNew.print2();
  }

}

 class MethodNew {
  public static void print1() {
    System.out.println("Я — поэт, зовусь я Цветик.");
  }

  public static void print2() {
    System.out.println("От меня вам всем приветик.");
  }
}