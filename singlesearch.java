// Link = https://leetcode.com/problems/single-element-in-a-sorted-array/

public class singlesearch {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //  only one element searching
        if (arr.length == 1) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Boundary check before accessing mid-1 or mid+1
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                    return arr[mid]; // found the single element
                }
            } else {
                return arr[mid]; // if mid is at boundary, it's the single element
            }

            // Handle odd and even mid separately
            if (mid % 2 == 1) { // odd index // Instead of this we can do if mid == odd (mid --);
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;   // move right
                } else {
                    end = mid - 1;     // move left
                }


            } else { // even index
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;   // move right
                } else {
                    end = mid - 1;     // move left
                }
            }
        }

        return -1; 
}

}
