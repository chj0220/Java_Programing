package Chapter_02;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class No_12 {
    public static void main(String[] args){
        System.out.print("연산>> ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        switch (op)
        {
            case "+":
                System.out.println(a+op+b+"의 계산 결과는 " + (a+b));
                break;
            case "-":
                System.out.println(a+op+b+"의 계산 결과는 " + (a-b));
                break;
            case "*":
                System.out.println(a+op+b+"의 계산 결과는 " + (a*b));
                break;
            case "/":
                if (b!=0) {
                    System.out.println(a + op + b + "의 계산 결과는 " + (a / b));
                }
                break;
            default:
                break;
        }
        sc.close();

    }
}
