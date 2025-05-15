package ss2_loop_java;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        int count=0, num=2;

        while (num <100){
            if(checkSNT(num)){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
    public static boolean checkSNT(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}

