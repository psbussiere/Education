package edu.psbussiere.fizzbuzz;

public class FizzBuzzSolution {

    public static boolean isDivByNum(int toDiv, int divBy) {
        return toDiv % divBy == 0;
    }
    
    public static void main (String[] args){
        String fiz = "fiz";
        String buzz = "buzz";

        for(int i = 1; i <= 100; i++) {
            if (isDivByNum(i, 3) && isDivByNum(i, 5) ) {
                System.out.println(i + fiz + buzz);
            } else if (isDivByNum(i, 5)) {
                System.out.println(i + fiz);
            } else if (isDivByNum(i, 3)) {
                System.out.println(i + buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}
