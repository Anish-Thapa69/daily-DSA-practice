import java.util.Arrays;

public class duplicatearra {
  public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        search(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Duplicate number: " + find(arr));
    }

    static void search(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // For Index Value - 1
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) { // Easy Stuffs Sort Arrays Using Cyclic Sort O(n) time andO(1)  
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
// After Sorting
    static int find(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];  // first duplicate mismatch
            }
        }
        return arr.length + 1;  // if all are correct
    }  
}
