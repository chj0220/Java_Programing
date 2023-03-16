package Chapter_02;

import java.util.Scanner;

public class No_06 {
    public static void main(String[] args) {
        System.out.print("1~99 사이의 정수를 입력하시오>> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num % 10 == 3) || (num % 10 == 6) || (num % 10 == 9)) {
            System.out.print("박수 짝");
            if ((num / 10 == 3) || (num / 10 == 6) || (num / 10 == 9)) System.out.print("짝");
        }

        sc.close();
    }
}
