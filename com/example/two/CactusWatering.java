package com.example.two;

import java.time.LocalDate;
import java.time.Month;

public class CactusWatering {
    private LocalDate lastWateringDate;

    public CactusWatering(LocalDate lastWateringDate) {
        this.lastWateringDate = lastWateringDate;
    }

    public LocalDate getNextWateringDate(int humidity) {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();
        int daysSinceLastWatering = currentDate.getDayOfYear() - lastWateringDate.getDayOfYear();

        // Поливаем раз в месяц зимой
        if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
            if (daysSinceLastWatering >= 30) {
                return currentDate;
            }
        }
        // Поливаем раз в неделю весной и осенью
        else if (currentMonth == Month.MARCH || currentMonth == Month.APRIL || currentMonth == Month.MAY ||
                currentMonth == Month.SEPTEMBER || currentMonth == Month.OCTOBER || currentMonth == Month.NOVEMBER) {
            if (daysSinceLastWatering >= 7) {
                return currentDate;
            }
        }
        // Поливаем летом не чаще одного раза в два дня при влажности меньше 30%
        else {
            if (daysSinceLastWatering >= 2 && humidity < 30) {
                return currentDate;
            }
        }

        return null;
    }
}
