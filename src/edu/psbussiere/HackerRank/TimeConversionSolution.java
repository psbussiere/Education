package edu.psbussiere.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversionSolution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String [] time = s.split(":");
        char [] seconds = time[2].toCharArray();
        int miliHour = 0;
        if(s.contains("PM")) {
            int pmHour = Integer.parseInt(time[0]);
            if(pmHour == 12){
                miliHour = 12;
            } else {
                miliHour = pmHour + 12;
            }
            return (miliHour + ":" + time[1] + ":" + seconds[0] + seconds[1]);
        } else if (time[0].equals("12")) {
            return ("00:" + time[1] + ":" + seconds[0] + seconds[1]);
        } else {
            return (time[0] + ":" + time[1] + ":" + seconds[0] + seconds[1]);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
