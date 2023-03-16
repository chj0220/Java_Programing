package Chapter_03;
import java.util.Scanner;

public class No_04 {
    public static void main(String[] args){
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        Scanner sc = new Scanner(System.in);
        String alph = sc.next(); //e
        char c = alph.charAt(0);
        int n= (int)(c-96); //5
        for (int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print((char)('a'+j));
            }
            System.out.println();
        }
        sc.close();
    }
}
