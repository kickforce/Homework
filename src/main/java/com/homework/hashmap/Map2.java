package com.homework.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * В классе Map2 есть метод getProgrammingLanguages,
 * который возвращает список языков программирования. Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
 * Ключом в этой коллекции будет индекс элемента в ArrayList.
 * Требования:
 * •	В классе Map2 должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
 * •	Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
 */

public class Map2 {

  public static HashMap<Integer, String> lang = new HashMap<>();
  public static void main(String[] args) {
    System.out.println(getProgrammingLanguages());
  }

  public static HashMap<Integer, String> getProgrammingLanguages() {
    lang.put(1, "Java");
    lang.put(2,"Kotlin");
    lang.put(3,"Go");
    lang.put(4,"Javascript");
    lang.put(5,"Typescript");
    lang.put(6,"Python");
    lang.put(7,"PHP");
    lang.put(8,"C++");
    return lang;
  }
}
