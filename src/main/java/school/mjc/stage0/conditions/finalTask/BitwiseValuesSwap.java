package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
//        System.out.print(first);
        System.out.print(first+"\n");
        System.out.print(second+"\n");

    }
    public static void main (String [] args){
        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        int first = 3;
        int second = 5;
        bitwiseValuesSwap.swap(first, second);
    }
}
