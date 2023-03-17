package Chapter_03;

public class No_07 {
    public static void main(String[] args) {
        int[] a = new int[10];
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        sum /= a.length;

        System.out.println("평균은 " + sum);
    }
}
