package Chapter_03;
import java.util.Scanner;

public class No_08 {
    public static void main(String[] args) {
        System.out.print("정수 몇개? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int[] a = new int[num];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
            for (int j=0; j<i;j++){
                if (a[i] == a[j]){
                    a[i] = (int) (Math.random() * 100 + 1);
                    i--;
                }
            }
            count ++;
            if(count%10==0)System.out.println(a[i] + " ");
            else System.out.print(a[i] + " ");
        }
        sc.close();

    }
}
