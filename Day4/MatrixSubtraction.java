import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a={{5,6},{7,8}};
        int[][] b={{1,2},{3,4}};

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print((a[i][j]-b[i][j])+" ");
            System.out.println();
        }

        sc.close();
    }
}