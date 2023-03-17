package Chapter_03;

public class No_10 {
    public static void main(String[] args){
        int [][] num = new int[4][4];
        int [] ran = new int[10];

        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                num[i][j] = 0;
            }
        } // 4*4 배열의 모든 값 0으로 초기화

        for(int i=0;i<ran.length;i++){
            ran[i] = (int)(Math.random()*10+1);
            for(int j=0;j<i;j++){
                if (ran[i]==ran[j]){
                    ran[i] = (int)(Math.random()*10+1);
                    i--;
                }
            }
        } // 랜덤함수 1~10까지 중복체크 후 저장

        for (int k=0; k<ran.length;k++){
            num[ran[k]/4][ran[k]%4] = (int)(Math.random()*10+1);;
        }

        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(num[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
