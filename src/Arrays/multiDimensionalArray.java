package Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        int a[][]={{3,4,2},{7,8,4},{6,8,5}};

        for (int i=0;i<a.length;i++ ){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }

    }
}
