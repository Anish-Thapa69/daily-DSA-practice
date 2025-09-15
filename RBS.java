public class RBS {
    public static void main(String[] args) {
       
      
    }
    
static int search(int[] nums, int target){
int pivot = RBSsearch(nums);

if(pivot == -1){
return binarysearch(nums, target, 0, nums.length -1);
}

if (nums[pivot] == target) {
    return pivot;
}
if (target >= nums[0]) {
    return binarysearch(nums, target, 0,  pivot - 1);
    
}

return binarysearch(nums, target, pivot + 1, nums .length -1);


}

  static int binarysearch(int[] array, int target, int start,int end){

        while (start <= end) {
            
            int mid = start + (end - start) / 2;
if (target == array[mid]) {
                return mid; // Return index if target is found
            }
            if(target > array[mid]){
                start = mid + 1;
            }else if(target < array[mid]){
                end = mid - 1;
           
        }

     }
     return -1;
}
    static int RBSsearch(int[] nums){

        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
}

if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

if (nums[start] >= nums[mid]) {
    end = mid -1;
}else{
    start = mid + 1;
}
        }
        return -1;
    }
}
