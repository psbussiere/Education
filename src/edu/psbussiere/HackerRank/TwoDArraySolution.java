package edu.psbussiere.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoDArraySolution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>();
        for(int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                List<Integer> hrGl = new ArrayList<>();
                hrGl.add(arr[i][j]);
                hrGl.add(arr[i - 1] [j - 1]);
                hrGl.add(arr[i - 1] [j]);
                hrGl.add(arr[i - 1] [j + 1]);
                hrGl.add(arr[i + 1] [j - 1]);
                hrGl.add(arr[i + 1] [j]);
                hrGl.add(arr[i + 1] [j + 1]);
                System.out.println(hrGl);
                int sumOfHrGl = hrGl.stream().mapToInt(Integer::intValue).sum();
                System.out.println(sumOfHrGl);
                sums.add(sumOfHrGl);
            }
        }
        System.out.println(sums);
        int answer = Collections.max(sums);
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        String whatever = "asdfasdfasdf";
        whatever.substring(whatever.lastIndexOf(" "));

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
