public class binary {

    public static void main(String[] args) {
        // Every thing will be passed
    }
     public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};  // If Bullshit happens like nothings shows up 

        ans[0] = search(nums, target, true); // Return First Occurence means end = mid -1 haha stupid me
       // Here Array target is passed as reference as reference varaible to search 
         ans[1] =search(nums, target, false); // Return Last occurence start = mid + 1 haha again i am stupid
       

         
        

       
       
return ans; // return output
    }


// Function for doing stuffs which will return 1st and last occurence
    int search(int[] nums , int target, boolean findstartindex) {
   
int ans = -1;
        
int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + (end - start ) / 2; // Whole Stuff is binary search which is easy peasy

            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){

                end = mid - 1;
            }else{
                ans = mid; // If target == mid then 
                if(findstartindex){ // this mf will execute cause we have to find stuff means occurance that is first one if true
                    
                    end = mid -1 ;
                }else{ // This mf will be doing stuffs for last occurance after first one this is false cause we are doing for last mf
                    start = mid + 1;
                }
            }
    }
    return ans; // Return the answer for first and last occurence

}

}











// public class binary {

//     public static void main(String[] args) {
        
//     }
//      public int[] searchRange(int[] nums, int target) {
//         int[] ans = {-1, -1};

//           int first = search(nums, target, true);
//         if (first < nums.length && nums[first] == target) {
//             int last = search(nums, target, false);
//             ans[0] = first;
//             ans[1] = last;
//         }

         
        

       
       
// return ans;
//     }



//     int search(int[] nums , int target, boolean findstartindex) {
   

        
// int start = 0;
//         int end = nums.length -1;

//         while (start <= end) {
//             int mid = start + (end - start ) / 2;

//             if(target > nums[mid]){
//                 start = mid + 1;
//             }else if(target < nums[mid]){

//                 end = mid - 1;
//             }else{
//                 if(findstartindex){
//                     end = mid -1 ;
//                 }else{
//                     start = mid + 1;
//                 }
//             }
//     }
//     return findstartindex ? start : end;

// }

// }