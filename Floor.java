public class Floor {
    

    public static void main(String[] args) {
 char[] letters = {'a', 'c', 'd', 'f', 'g', 's', 's'};
 char target = 'g';
 System.out.println(charactersearch(letters, target));
}

static int charactersearch(char[] letters, char target){
    
  int start = 0;
        int end = letters.length -1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

           
             if(target >= letters[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
           
        }

     }
     
     return letters[start % letters.length] ;

}
}

