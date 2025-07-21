public class peaknewway {
    // https://leetcode.com/problems/find-peak-element/description/
    public static void main(String[] args) {
        
    }
    static int peakindexinmountainnew(int[] nums){ // While this is the method finding in peak in an array from I leanred more accuracy and better;
        int start = 0;
        int end = nums.length -1 ;


        while (start < end) { // <= because we already will be get an answer but if = it will run loop again and its useless so both start and end will have value
            int mid = start + ( end - start ) / 2;

            if(nums[mid] > nums[mid + 1]){ // If mid is greater then mid + 1 means we are in decreasing part of array

                end = mid; // Mid might be potential answer who knows what we don't have target so its going to be this and we still still checking
                // Who know answer might be left side then this greater I mean
                //this is why end != mid -1
            }else{

                start = mid + 1; // else we are doing start stuffs if(nums[mid] > nums[mid - 1]) // bescause we know that mid + 1> then mid element 
                
            }
        }

        return start;// in the end , start == end pointing at the largest number because of the two checks 
        //start and end are always tryingg to find max element in the above two checks hence when they are pointing to just 
        //one element thats the maximum element
        //at every point of time for start for end they have the best possible ans till that time
        //and if we are saying only one item is remaining caause the is best answer 
    }
}
