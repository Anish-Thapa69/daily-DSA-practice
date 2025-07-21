public class peak {
    // https://leetcode.com/problems/find-peak-element/description/
    public static void main(String[] args) {
        int[] nums = {0,10,5,2};

       System.out.println(peakIndexInMountainArray(nums));

    }
    static int peakIndexInMountainArray(int[] arr) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) { // if the left from mid and right from mid is less the mid then We are done with answer
                // this way might be inaccuracy cause its my freaking ass brain think at first so
                return mid;
            }

            if (arr[mid] < arr[mid + 1]) { // if mid id less the mid + 1 possibly start + 1;
                start = mid + 1;
            }else{
                end = mid -1; // else we are doing mid - 1
            }

            
        }
        return ans;
    }
}
