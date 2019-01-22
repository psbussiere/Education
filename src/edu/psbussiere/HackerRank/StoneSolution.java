package edu.psbussiere.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StoneSolution {

    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {
        if(a == b){
            int [] answer = new int [1];
            answer[0] = a * (n-1);
            return answer;
        } else {
            int [] answer = new int[n];
            for(int i = 0; i < n; i++) {
                int temp = a * ((n - 1) - i) + b * i;
                answer[i] = temp;
            }
            Arrays.sort(answer);
            return answer;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = stones(n, a, b);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
