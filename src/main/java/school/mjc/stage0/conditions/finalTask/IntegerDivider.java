package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        }
        else {
            int div = dividend / divider;
            if (div*divider == dividend){
                System.out.println("can be divided completely");
            }
            else{
                System.out.println("cannot be divided completely");
            }
        }

    }
    public static void main (String [] args) {
        IntegerDivider integerDivider = new IntegerDivider();
        int dividend = 2;
        int divider = 3;
        integerDivider.printCompletelyDivided(dividend, divider);
    }
}
