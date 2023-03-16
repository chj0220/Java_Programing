package Chapter_02;
import java.util.Scanner;

public class No_01 {
    public static void main(String args[]){
        System.out.print("원화를 입력하세요.(단위 원)>> ");
        Scanner sc = new Scanner(System.in);
        int won = sc.nextInt();
        double dall = won/1100;

        System.out.println(won + "원은 $" + dall + "입니다.");
        sc.close();
    }

}
