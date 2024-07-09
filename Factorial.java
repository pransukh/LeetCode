package JAVA.HE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String ans = "";
        while (t-- > 0) {
            ans = "";
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String input = stdin.readLine();
            String [] chunk = input.split(" ");
            for (int i = 0; i < chunk.length ; i++) {
               chunk[i]=chunk[i].replace(String.valueOf(chunk[i].charAt(0)),String.valueOf(chunk[i].charAt(0)).toUpperCase());
               ans = ans + chunk[i]+" ";
            }
            System.out.println(ans.trim());
            System.out.println();
        }

    }
}
