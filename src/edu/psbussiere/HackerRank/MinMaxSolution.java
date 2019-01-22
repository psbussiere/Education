package edu.psbussiere.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinMaxSolution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        List<Integer> arrAsList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> maxValues = new ArrayList<>();
        List<Integer> minValues = new ArrayList<>();
        long min = Collections.min(arrAsList);
        long max = Collections.max(arrAsList);
        if(max == min) {
            for(int i = 0; i < arr.length - 1; i++) {
                minValues.add(arr[i]);
                maxValues.add(arr[i]);
            }
        } else {
            for(Integer i : arrAsList) {
                if (i < max) {
                    minValues.add(i);
                }
                if (i > min) {
                    maxValues.add(i);
                }
            }
        }
        long maxSum = maxValues.stream().mapToLong(Integer::longValue).sum();
        long minSum = minValues.stream().mapToLong(Integer::longValue).sum();
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
