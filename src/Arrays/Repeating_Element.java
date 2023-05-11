package Arrays;

public class Repeating_Element {
    public static void main(String[] args) {
        int a[]={ 4,5,6,6,4,1,2,3};
        int count =0;
        for (int i =0;i<=a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++){

                if(a[i]==a[j]){
                    count ++;
                    System.out.println(a[i]+" duplicates");
            }

            }


        }

    }

}
