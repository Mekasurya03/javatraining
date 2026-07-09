import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a={{1,2,3},{4,5,6}};

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++)
                System.out.print(a[j][i]+" ");
            System.out.println();
        }

        sc.close();
    }
}