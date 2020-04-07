package semen.sereda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] values = s.split(" ");
        long A = Long.parseLong(values[0]);
        long B = Long.parseLong(values[1]);
        System.out.println(A + B);

    }
}

