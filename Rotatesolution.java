public class Rotatesolution {
    public static void main(String[] args) {
        int[] arr = {10,12,2,4,5,7,8,9};
        System.out.println(findpivot(arr));
    }

static int search(int[] arr, int target){
    int pivot = findpivot(arr);

    if (pivot == target) {
        return pivot;
    }
// IF you didn't find pivot means array is not rotated basic binary search is Done
    if (pivot == -1) {
        return binarysearch(arr, target, 0, arr.length -1);
    }

if (target > arr[0]) { // If start is less then target why the hell would I search in P + 1 and ofc all the number into start and pivot are bigger so we find there
    return binarysearch(arr, target, 0, pivot - 1);
}

return binarysearch(arr, target, pivot + 1, arr.length - 1); // Why the hell would I search between pivot and start even after we know target is less then start huh so p + 1 till end 
// Thank you just basic stuffsss


}

 static int binarysearch(int[] array, int target,int start, int end){

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
     return -1;
}




    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
// What is Pivot?
// Pivot the gretest element in the array and the index where the array is rotated 

            if(mid < end  && arr[mid] > arr[mid + 1]){ // This is the condition for Pivot if pivot is > mid + 1 because other will all be shorter then pivot easy stuffs
                // also condition for mid + 1 might exceeds array
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                // also condition for mid - 1 might exceeds array
                return mid -1; // Again basic stuff cause id mid < mid - 1 we are in decreasing order so mid - 1 is pivot
            }

            if(arr[start] >= arr[mid]){ // In this case if start is greater the Mid ofcourse pivot will be in mid - 1 because after mid all elements are smaller then start
                // So We ignore Mid + 1;
end = mid - 1; 
            }else{ // This all will not work for duplicate value remember how we supposed to check condition if start mid end is same think man think
                start = mid + 1;
            }

// if the element at the middle end start ate same 
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
// skip the duplicate 
// but but but what if the start and end are the pivot ????
if (arr[start] > arr[start + 1]) {
    return start;
}
                start ++;

                if (arr[end] < arr[end - 1]) {
                    return end -1;
                }
                end --;
            }else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;

            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}

