package Arrays;

public class matrix_mul {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{3,5,6},{4,8,6}};
        int b[][]={{4,5,6},{4,5,6},{7,6,5}};

        int c[][]= new int[3][3];



        for (int i =0;i<3; i++){
            for (int j=0;j<3;j++){
                c[i][j]=0;

                for (int k=0;k<3;k++){
                    c[i][j]=+a[i][k]*b[j][k];
                }

                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }
}
