package Chapter_02;

import java.util.Scanner;

public class No_03 {
    public static void main(String[] args) {
        System.out.print("금액을 입력하시오. >> ");
        Scanner sc = new Scanner(System.in);
        int won = sc.nextInt();

        System.out.println("오만원권" + won / 50000 + "매");
        won %= 50000;
        System.out.println("만원권" + won / 10000 + "매");
        won %= 10000;
        System.out.println("천원권" + won / 1000 + "매");
        won %= 1000;
        System.out.println("100원" + won / 100 + "개");
        won %= 100;
        System.out.println("50원" + won / 50 + "개");
        won %= 50;
        System.out.println("10원" + won / 10 + "개");
        won %= 10;
        System.out.println("1원" + won / 1 + "개");

        sc.close();
    }
}
