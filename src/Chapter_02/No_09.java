package Chapter_02;

import java.util.Scanner;

public class No_09 {
    public static void main(String[] args) {
        System.out.print("원의 중심과 반지름 입력>> ");
        Scanner sc = new Scanner(System.in);
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        double r = sc.nextDouble();
        System.out.print("점 입력>> ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (((cx - r <= x) && (cx + r >= x)) && ((cy - r <= y) && (cy + r >= y)))
            System.out.print("점 (" + x + "," + y + ")는 원 안에 있다.");
        else System.out.print("점 (" + x + "," + y + ")는 원 밖에 있다.");

        sc.close();
    }
}
