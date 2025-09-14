public class splitarray {
    public static void main(String[] args) {
    int[] arr = {7,2,5,10,8};
    int k = 2;

    System.out.println(splitArray(arr,k));
    }

     public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0; i< nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start < end) {
// try for the mid for potential answerx
int mid = start + (end - start) /2;
// calculate how many pieces you can divide this in with this max sum
int sum = 0;
int pieces = 1;

for (int num : nums) {
    if(sum + num > mid){
        // you cannot add this in this sub array, make new one
    // say you add this num in new subarray, then sum = num;

    sum = num;
    pieces ++;

    }else{
        sum += num;
    }
    

}

if (pieces > k) {
    start = mid + 1;
}else{
    end = mid;
}
        }
        return end; 

    }
}
