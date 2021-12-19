package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        arr = new int[num];
        Random random = new Random();
        int[] mas = new int[num];
        for (int i = 0, n = 0; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
        }
        System.out.print("1.Заповнити масив тільки парними числами: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.print("2.Заповнити масив рандомними числами: ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = random.nextInt(num);
            System.out.print(arr[j] + " ");
        }
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = (double) sum / arr.length;
        System.out.println();
        System.out.println("3.Вивести середнє значення: " + avg);
        int sumDev = 0;
        int sumOfEvenIndex = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 3 == 0) {
                sumDev += arr[j];
            }
        }
        System.out.println("4.Вивести суму всіх значень кратних 3: " + sumDev);
        System.out.print("5.Вивести значення всіх парних індексів масиву: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && i != 0) {
                sumOfEvenIndex += arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("9.Вивести суму значень всіх парних індексів: " + sumOfEvenIndex);
//6. Просортувати масив в порядку зростання
        System.out.print("6.Просортувати масив в порядку зростання: ");
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
//7. Вивести найменше значення в масиві
        int min = arr[0];
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println();
        System.out.print("7.Вивести найменше значення в масиві: " + min);
//8. Вивести найбільше значення масиву
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println();
        System.out.println("8.Вивести найбільше значення масиву: " + max);
//10. Вивести перших 20 символів з таблиці ASCI
        System.out.print("10.Вивести перших 20 символів з таблиці ASCI: ");
        for (int i = 0; i < 20; i++) {
            System.out.print((char) (i));
        }

        }
    }
