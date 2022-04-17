package com.homework.hashmap10;

import java.util.HashSet;

import static java.util.Arrays.asList;

/**
 * � ������ Set2 ���� ����� checkWords(String), ������� ������ ��������� ������� ����������� ����� � ��������� words.
 * ���� ����� ����, �� ������� � �������:
 * ����� [���������� �����] ���� � ���������
 * ���� ���:
 * ����� [���������� �����] ��� � ���������
 *
 * ����� main �� ��������� � ��������.
 *
 * ������ ������:
 * ����� Java ���� � ���������
 * ����������:
 * �	� ������ Set2 ������ ���� ��������� ����������� ���� words ���� HashSet<String>.
 * �	� ������ Set2 ������ ���� ��������� ����������� ����� checkWords(String) � ����� ������������� �������� void.
 * �	����� checkWords(String) ������ �����к��� �������� �������.
 */

public class Set2 {

  public static HashSet<String> words = new HashSet<>(asList("���� �� ���� ��������� ������� ���� �� ������ Java � �� �� �������".split(" ")));

  public static void checkWords(String word) {
    if(words.contains(word))
    {
      System.out.println(String.format("����� %s ���� � ���������", word));
  }else {
      System.out.println(String.format("����� %s ��� � ���������", word));
    }
    }


  public static void main(String[] args) {
    checkWords("JavaScript");
    checkWords("Java");
  }
}
