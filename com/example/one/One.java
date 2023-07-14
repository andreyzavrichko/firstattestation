package com.example.one;

import java.util.Scanner;

public class One {
        // 1 Задание
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину забора в см: ");
            int fenceLength = scanner.nextInt();

            // Рассчитываем длину сообщения в см
            int messageLength = 5 * 62 + 3 * 12;

            if (messageLength <= fenceLength) {
                System.out.println("Поместится!");
            } else {
                System.out.println("Не поместится!");
            }
        }

}
