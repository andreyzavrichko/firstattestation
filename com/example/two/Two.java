package com.example.two;

import java.time.LocalDate;
import java.util.Random;

public class Two {
    public static void main(String[] args) {
        LocalDate lastWateringDate = LocalDate.of(2023, 2, 1);
        CactusWatering cactus = new CactusWatering(lastWateringDate);
        // Генерируем влажность
        int max = 99;
        int min = 1;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        // Получаем следующую дату полива и выводим сообщение
        LocalDate nextWateringDate = cactus.getNextWateringDate(randomNum);
        if (nextWateringDate != null) {
            System.out.println("Кактус нужно полить " + nextWateringDate);
        } else {
            System.out.println("Кактус не нужно поливать");
        }
    }
}
