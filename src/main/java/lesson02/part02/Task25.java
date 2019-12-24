package lesson02.part02;

import java.io.*;
import java.util.*;

public class Task25 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        String bS = bufferedReader.readLine();
        int a = Integer.parseInt(aS);
        int b = Integer.parseInt(bS);
        if ((a > 0) & (b > 0)) {
            System.out.println(1);
        }
        else if ((a < 0) & (b > 0)) {
            System.out.println(2);
        }
        else if ((a < 0) & (b < 0)) {
            System.out.println(3);
        }
        else if ((a > 0) & (b < 0)) {
            System.out.println(4);
        }
    }
}