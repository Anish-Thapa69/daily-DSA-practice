public class infinite {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(infinitesearch(array, target));
    }
    static int infinitesearch(int[] array, int target){ // This the Main Part We DID today 
       
int start = 0;// We don't know the Length of an array So we shit it from 0
int end = 1; // To 1 we keeping doubling this shit

while (end < array.length && target > array[end]) {  // Doubling logic Even Basic is hard for Stupid like me and if target is greater then End what the point of checking with start so and end might exceed array length so conditon for that
    int temp = end + 1; // here we are increaing the Start index by end + 1; 
    // 
    end = end + (end - start + 1) * 2; // This is the formula to calculate size and end will go double this 

    start = temp; // We have to use start in end before now I need to add Temp value here
}

        return binarysearch(array, target, start, end); // Returning bullshit

    }

    static int binarysearch(int[] nums, int target, int start, int end){


int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

        if(target > nums[mid]){
            start = mid + 1;
        }else if (target < nums[mid]){  // This is all basic bull shit Thank You:
            end = mid - 1;
        }else{
        return mid;
        }
        }

        return ans;
    }

}
