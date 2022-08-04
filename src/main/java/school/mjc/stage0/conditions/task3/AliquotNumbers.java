package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int sum = 1;
        for (int i = 2; i < first; i++) {
            if (first % i == 0) {
                sum += first / i;
            }
        }
        if (sum == second || first * first == second) System.out.println("Aliquot");
        else System.out.println("Not aliquot");
    }
}
