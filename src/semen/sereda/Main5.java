package semen.sereda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] values = s.split(" ");
        String str1 = values[0];
        String str2 = values[1];
        int len1 = str1.length();
        int len2 = str2.length();
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    list.add(String.valueOf(str1.charAt(i)));
                    j = len2;
                }
            }
        }
        list.sort(String.CASE_INSENSITIVE_ORDER);
        String value2 = "";
        for (String value : list) {
            if (!value2.equals(value)) {
                System.out.print(value);
            }
            value2 = value;
        }
    }
}


