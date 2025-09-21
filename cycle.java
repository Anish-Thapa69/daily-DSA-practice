import java.util.Arrays;
public class cycle {
    
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        search(arr);
       System.out.println(Arrays.toString(arr));
    }


    static void search(int[] arr){
int i = 0;
while (i < arr.length) {
    int correct = arr[i] -1;
   
    if(arr[i] > 0 && arr[i] != arr[correct]){
int temp = arr[correct];
arr[correct] = arr[i];
arr[i] = temp;

    }else{
        i++;
    }
}

// for( i = 0 ; i < arr.length; i++){ // For missing Number
//         if(arr[i] != i ){
//             return i;
//         }
//     }
}


    }

