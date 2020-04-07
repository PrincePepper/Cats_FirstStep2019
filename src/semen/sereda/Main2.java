package semen.sereda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int A = Integer.parseInt(s);
        int B = (A / 10) + 2;
        String StringOut;
        if ((A > (B - 1) * 10 - B) || A % 9 == 0 || A % 10 == 0) {
            StringOut = "YES";
        } else StringOut = "NO";
        System.out.print(StringOut);
    }
}

