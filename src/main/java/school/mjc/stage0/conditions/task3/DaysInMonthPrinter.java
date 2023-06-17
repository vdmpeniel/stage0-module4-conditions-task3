package school.mjc.stage0.conditions.task3;

import java.util.Arrays;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month < 1 || month > 12){
            System.out.println("wrong number!");
            return;
        }
        System.out.println(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31).get(month - 1));


    }
}
