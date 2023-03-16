package Chapter_02;
import java.util.Scanner;

public class No_07 {
    public static void  main(String[] args ){
        System.out.print("점 (x,y)의 좌표를 입력하시오>> ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(((100<=x) && (x<=200)) && ((100<=y) && (y<=200))) System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
        else System.out.println("("+x+","+y+")는 사각형 안에 존재하지 않습니다.");
        sc.close();
    }
}
