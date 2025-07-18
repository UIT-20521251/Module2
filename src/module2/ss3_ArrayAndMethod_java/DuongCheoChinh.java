package module2.ss3_ArrayAndMethod_java;

import java.util.Arrays;
import java.util.Random;

public class DuongCheoChinh {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random random = new Random();
                a[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Mảng 2 chiều bất kỳ: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.printf("Tổng các phần tử ở đường chéo chính: " +SumMainDiagonal(a));
    }
    public static int SumMainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
