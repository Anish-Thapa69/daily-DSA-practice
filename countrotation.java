public class countrotation {

    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        System.out.println(search(arr));
    }


    static int search(int[] arr){
        int pivot = searchpivot(arr);

        if (pivot != -1 && pivot < arr.length - 1) {
            return pivot + 1; // I did without help By the way this One it is the revolution I guess will be looking forward to it
            // I just think pivot is the highest index then P + 1 is ofc the my Target how great I can think sometimes except for maths
        }
return -1;
    }


    static int searchpivot(int[] arr){
    int start = 0;
    int end = arr.length -1 ;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }

        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
            }

            if(arr[start] >= arr[mid]){
               end = mid - 1;
            }else{
                start = mid + 1;
            }
    }
    return -1;
}

}


