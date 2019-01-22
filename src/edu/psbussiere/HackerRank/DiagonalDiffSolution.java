package edu.psbussiere.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDiffSolution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        List<Integer> primaryDiag = new ArrayList<>();
        List<Integer> secondaryDiag = new ArrayList<>();
        int pos = 0;
        for(int i = 0; i < arr[0].length; i++) {
            primaryDiag.add(arr[i][i]);
        }
        System.out.println(primaryDiag);
        for(int i = arr[0].length - 1; i >= 0; i--) {
           secondaryDiag.add(arr[pos][i]);
           pos++;
        }
        System.out.println(secondaryDiag);
        int sumPrimary = primaryDiag.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumPrimary);
        int sumSecondary = secondaryDiag.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumSecondary);
        return Math.abs(sumPrimary - sumSecondary);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
