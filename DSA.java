
public class DSA {
    public static void main(String[] args) {
       int[] nums = {1,2,4,6,10,12,14,16,17,18};
       int mission = 16;
System.out.println(binarysearch(nums, mission));
    }
// return the index
//return -1 if it doesn't exist 
    static int binarysearch(int[] array, int target){

        if(array.length == 0){
            return -1;
        };

       
        int start = 0;
        int end = array.length - 1;

        // To check array is ascending or decending
         boolean isasc = array[start] < array[end];


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(array[mid] == target){
return mid; 
            }
            
            if (isasc) {
                          if (target < array[mid]){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
            }

            else
    {
            if(target > array[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            }
            

  
        }

        return - 1;
       
    }
       



}