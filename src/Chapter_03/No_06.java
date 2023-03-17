package Chapter_03;
import java.util.Scanner;

public class No_06 {
    public static void main(String[] args){
        System.out.print("금액을 입력하시오.>> ");
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int [] unit = {50000,10000,1000,500,100,50,10,1};

        for (int i=0; i<unit.length;i++){
            if (money/unit[i] == 0) i++;
            System.out.println(unit[i] + "원 짜리 : " + money/unit[i] + "개");
            money %= unit[i];
        }
        sc.close();
    }
}
