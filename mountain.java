public class mountain {
    public static void main(String[] args) {
        
    }
     public int findInMountainArray(int target, int[] arr) {
        int peak = peakindexinmountainnew(arr);
        int firsttry = orderagnostic(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }

        return orderagnostic(arr, target, peak + 1, arr.length -1);

        
    }

     static int peakindexinmountainnew(int[] nums){
        int start = 0;
        int end = nums.length -1 ;


        while (start < end) {
            int mid = start + ( end - start ) / 2;

            if(nums[mid] > nums[mid + 1]){

                end = mid;
            }else{

                start = mid + 1;
            }
        }

        return start;
    }

    static int orderagnostic(int[]arr, int target,int start, int end){

        int ans = -1;

    boolean isasc = arr[start] < arr[end];

    while (start <= end) {
         int mid = start + (end - start) / 2;

           if (arr[mid] == target) {
            return mid;
        }

          if (isasc) {
       if (target > arr[mid]) {
            start = mid + 1;
        }else{
            end = mid -1;
        }
    }else{
        if (target > arr[mid]) {
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    }
   return ans;
} 

}

