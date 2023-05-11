package Arrays;

public class Addition_of_2D_Array {
    public static void main(String[] args) {

        // Addition of two matrices

        int a[][]={{2,4,3},{3,4,5}};
        int b[][]={{5,7,8},{6,8,7}};

        int c[][]=new int[2][3];

        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){


                 c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }

    }
}
