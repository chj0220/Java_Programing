package Chapter_02;

import java.util.Scanner;

public class No_08 {
    public static boolean inRect(int x, int y) {
        if (((x >= 100) && (x <= 200)) && ((y >= 100) && (y <= 200))) {
            return true;
        } else return false;
    }

    public static void main(String[]  args) {
        System.out.print("두 점 (x1,y1), (x2,y2)를 입력해주세요>> ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (inRect(x1, y1) == true || inRect(x2, y2) == true)
            System.out.println("(" + x1 + "," + y1 + ")과 (" + x2 + "," + y2 + ")로 이루어진 직사각형은 (100,100),(200,200)으로 이루어진 직사각형과 충돌합니다.");
        else
            System.out.println("(" + x1 + "," + y1 + ")과 (" + x2 + "," + y2 + ")로 이루어진 직사각형은 (100,100),(200,200)으로 이루어진 직사각형과 충돌하지 않습니다.");
        sc.close();
    }
}
