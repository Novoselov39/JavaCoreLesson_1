import java.security.PublicKey;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,7};
        int[] arr2 = new int[] {0,0,3,4,5,7};
       ;
        //task 1
        System.out.println(countEvens(arr));
        //task 2
        System.out.println(minMax(arr));
        //task 3
        System.out.println(nullFunction(arr));
        System.out.println(nullFunction(arr2));

    }


    //task 1
    public static Integer countEvens(int[] arr){
        int count =0;
        for (int i:arr){
            if (i%2==0){
                count++;
            }
        }
        return count;
    }

    //task 2

    public static Integer minMax(int[] arr){
        int min =arr[0];
        int max =arr[0];
        for (int i:arr){
            if (min>i){
                min =i;
            }
            if (max<i){
                max = i;
            }
        }
        return max-min;
    }

    //task 3

    public  static Boolean nullFunction(int[] arr){
        int tmp=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] ==0 && arr[i+1]==0) {
                return true;
            }


        }
        return false;
    }
}