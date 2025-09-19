import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class allduplicates {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        
        System.out.println(search(arr));
    }

    static List<Integer> search(int[] arr) {
    int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for( i = 0; i< arr.length;i++){
           if(arr[i] != i + 1){
               ans.add(arr[i]);
           }
           
    }
    return ans;
    }
}