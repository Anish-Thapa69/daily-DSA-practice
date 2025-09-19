public class setmismatch {
    public int[] findErrorNums(int[] arr) {
         int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    for(  i = 0; i< arr.length;i++){
           if(arr[i] != i + 1){
              
               return new int[] {arr[i],i  + 1};
           }
           
          
    }
       
          return new int[] {-1,-1}; 
}

}

