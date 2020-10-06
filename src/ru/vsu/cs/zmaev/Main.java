package ru.vsu.cs.zmaev;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static double Input(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input", name);
        return scanner.nextDouble();
    }

    public static double Func1(double n) {
        double x = 1;
        double s = 0;

        while (n >= 1) {
            x++;
            n--;
            s = s + Math.pow(x, n);
        }
        return s;
    }

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.ROOT);

        double n = Input("n");
        double s = Func1(n);

        System.out.println(s);
    }
}
