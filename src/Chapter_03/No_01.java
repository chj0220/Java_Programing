package Chapter_03;

import java.util.Scanner;

public class No_01 {
    public void WhileTest() {
        int sum = 0, i = 0;
        while (i < 100) {
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
    }

    public void ForTest() {
        int sum = 0;
        for (int i = 0; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void DoWhileTest() {
        int sum = 0, i = 0;
        do {
            sum += i;
            i += 2;
        } while (i < 100);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        No_01 a = new No_01();

        a.WhileTest();
        a.ForTest();
        a.DoWhileTest();

    }
}
