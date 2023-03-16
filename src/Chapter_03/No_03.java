package Chapter_03;
import java.util.Scanner;
public class No_03 {
    public static void main(String[] args){
        System.out.print("정수를 입력하시오.>> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
