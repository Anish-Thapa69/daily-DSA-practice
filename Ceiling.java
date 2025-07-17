
public class Ceiling {
    public static void main(String[] args) {
 int[] arr = {2,3,4,9,14,16,18};
int target = 15;
System.err.println(ceiling(arr, target));
    }

    static int ceiling(int[] array, int target){

        if(array.length == 0){
            return -1;
        }

        int start = 0;
        int end = array.length -1;

        while (start <= end) {
            
            int mid = start + (end - start);

            if(array[mid] == target){
                return mid;
            }else if(target > array[mid]){
                start = mid + 1;
            }else if(target < array[mid]){
                end = mid - 1;
           
        }

     }
     return end;
}
}