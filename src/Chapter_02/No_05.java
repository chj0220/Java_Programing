package Chapter_02;

import java.util.Scanner;

public class No_05 {
    public static void main(String[] args){
        System.out.print("정수 3개를 입력하시오>> ");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if ((num1+num2>num3) && (num2+num3>num1) && (num1+num3>num2)) System.out.println("삼각형이 됩니다.");
        else System.out.println("삼각형이 되지 않습니다.");

        sc.close();
    }
}
