package Chapter_02;

import java.util.Scanner;

public class No_04 {
    public static void main(String[] args ){
        System.out.print("정수 3개 입력>> ");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(((num1<=num2)&&(num2<=num3)) || ((num3<=num2)&&(num2<=num1))) System.out.println("중간 값은 " + num2);
        else if (((num2<=num1)&&(num1<=num3)) || ((num3<=num1)&&(num1<=num2))) System.out.println("중간 값은 " + num1);
        else if (((num2<=num3)&&(num3<=num1)) || ((num1<=num3)&&(num3<=num2))) System.out.println("중간 값은 " + num3);

        sc.close();

    }
}
