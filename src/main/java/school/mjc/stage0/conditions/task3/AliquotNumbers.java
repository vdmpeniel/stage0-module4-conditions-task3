package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        boolean isAliquot = second % first == 0;
        if (isAliquot){
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
