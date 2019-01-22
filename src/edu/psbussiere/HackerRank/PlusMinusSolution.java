package edu.psbussiere.HackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinusSolution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positives = 0;
        double negatives = 0;
        double zeros = 0;
        double total = arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ){
                positives++;
            } else if( arr[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(positives / total));
        System.out.println(df.format(negatives / total));
        System.out.println(df.format(zeros / total));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
