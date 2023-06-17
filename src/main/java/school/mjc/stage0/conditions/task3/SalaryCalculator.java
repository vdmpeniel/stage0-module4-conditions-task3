package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        int percentage = 0;
        if (salary > 20000){
             percentage = 20;
        } else if (salary > 10000){
            percentage = 18;
        } else if (salary >= 0){
            percentage = 15;
        } else {
            System.out.println("wrong input!");
            return;
        }
        System.out.println(salary - (salary * percentage / 100f));
    }

    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        sc.calculateSalary(5000);
    }
}
