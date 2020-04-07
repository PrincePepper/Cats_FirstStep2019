package semen.sereda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        long A = Long.parseLong(s);
        long B = (1+A)*A+(2*A+1);
        System.out.println(B);

    }
}

