package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary > 0) System.out.println((double) salary -  (double) salary * 0.15);
        else if (salary <= 20000 && salary > 0) System.out.println((double) salary -  (double) salary * 0.18);
        else if (salary > 20000 && salary > 0)System.out.println((double) salary -  (double) salary * 0.20);
        else if (salary < 0)System.out.println("wrong input!");
    }
}
