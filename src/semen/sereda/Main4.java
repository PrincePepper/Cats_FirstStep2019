package semen.sereda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main4 {
    public static void main(String[] args) {
        int result;
        String A="31";
        BigInteger c = new BigInteger(new BigInteger(A).toString(30), 10);
        result = c.intValue();
        System.out.print(result);
    }
}

