// Well Well Well Three ways of doing same question

import java.util.Arrays;

public class TwodBS {
    public static void main(String[] args) {
        int[][]  arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println(Arrays.toString(twoDSearch(arr,5)));
    }

    static int[] binarysearch(int[][] matrix, int rows, int cstart, int cend, int target){
while(cstart <= cend){
    int mid = cstart + (cend - cstart) / 2;
    if(matrix[rows][mid] == target){
        return new int[] {rows,mid};

    }
     if(matrix[rows][mid] <  target){
        
        cstart = mid + 1;
    }else{
        cend = mid -1; 
    }

   
}
 return new int[] {-1,-1};
    }

    //search in row provided between the cols provided
    static int[] twoDSearch(int[][] matrix, int target){
int rows = matrix.length ;
int cols = matrix[0].length;

if(rows == 1){
return binarysearch(matrix, 0, 0, cols - 1, target);
}
int rstart = 0;
int rend = rows - 1;
int cmid = cols /2;

// run the loop till two rows are remaining
while (rstart < (rend - 1)) {//while this is true it will have more than 2 rows// Stopping at two rows reduce complexity and Time and space complexity = log(n) + log(m)
    int mid = rstart + (rend - rstart) / 2;
    if(matrix[mid][cmid] == target){
        return new int[] {mid, cmid};

    }
// Here Rows are ignored according to target 
     if(matrix[mid][cmid] < target){
        rstart = mid; 
     }else{
        rend = mid;
     }
}

//now we have two rows 
// check weather the targest is in the colum of the two rows if matrix 
if(matrix[rstart][cmid] == target){
return new int[] {rstart,cmid};
}
// Checking the possibilites for both mids
if(matrix[rstart + 1][cmid] == target){
    return new int[] {rstart + 1, cmid};
}

// Search in 4 parts
        // 1st part: rstart, 0 to cmid-1
        if (target <= matrix[rstart][cmid - 1]) {
            return binarysearch(matrix, rstart, 0, cmid - 1, target);
        }
        // 2nd part: rstart, cmid+1 to end
        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
            return binarysearch(matrix, rstart, cmid + 1, cols - 1, target);
        }
        // 3rd part: rstart+1, 0 to cmid-1
        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binarysearch(matrix, rstart + 1, 0, cmid - 1, target);
        }
        // 4th part: rstart+1, cmid+1 to end
        else {
            return binarysearch(matrix, rstart + 1, cmid + 1, cols - 1, target);
        }
 
    }
}

// import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12}
//         };
//         int target = 12;
//         System.out.println(Arrays.toString(check(arr,target)));
//     }

//     static int[] binarysearch(int[][] matrix,int row,int cstart,int cend, int target){
//         while(cstart <= cend){
//             int mid = cstart +(cend - cstart) /2;
//             if(matrix[row][mid] == target){
//                 return new int[] {row,mid};
//             }
//             if(matrix[row][mid] < target){
//                 cstart = mid +1;
//             }else{
//                 cend = mid -1;
//             }
//         }
//         return new int[] {-1,-1};
//     }

//     static int[] check(int[][] matrix ,int target){
//         int row = matrix.length;
//         int col = matrix[0].length;

//         int rstart= 0;
//         int rend = row - 1;
//         int cmid = col / 2;

//         while(rstart < (rend - 1)){
//             int mid = rstart + (rend - rstart) /2;
//             if(matrix[mid][cmid] == target){
//                 return new int[]  {mid,cmid};
//             }
//             if(matrix[mid][cmid] > target){
//                 rend = mid;
//             }else{
//                 rstart = mid;
//             }
//         }

//         // Check in 2 rows mid
//         if(matrix[rstart][cmid] == target){
//             return new int[] {rstart,cmid};
//         }
//         if(matrix[rstart + 1][cmid] == target){
//             return new int[] {rstart + 1,cmid};
//         }
// // Top row, left half
// if(target >= matrix[rstart][0] && target <= matrix[rstart][cmid - 1]){
//     return binarysearch(matrix,rstart,0,cmid - 1,target);
// }
// // Top row, right half
// if(target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][col - 1]){
//     return binarysearch(matrix,rstart,cmid + 1,col -1,target);
// }
// // Bottom row, left half
// if(target >= matrix[rstart + 1][0] && target <= matrix[rstart + 1][cmid -1]){
//     return binarysearch(matrix,rstart + 1,0,cmid - 1,target ); 
// }
// // Bottom row, right half
// return binarysearch(matrix,rstart + 1, cmid + 1,col -1 , target);



       
//     }
// }


// import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12}
//         };
//         int target = 1;
//         System.out.println(Arrays.toString(check(arr,target)));
//     }

//     static int[] binarysearch(int[][] matrix,int row,int cstart,int cend, int target){
//         while(cstart <= cend){
//             int mid = cstart +(cend - cstart) /2;
//             if(matrix[row][mid] == target){
//                 return new int[] {row,mid};
//             }
//             if(matrix[row][mid] < target){
//                 cstart = mid +1;
//             }else{
//                 cend = mid -1;
//             }
//         }
//         return new int[] {-1,-1};
//     }

//     static int[] check(int[][] matrix ,int target){
//         int row = matrix.length;
//         int col = matrix[0].length;

//         int rstart= 0;
//         int rend = row - 1;
//         int cmid = col / 2;

//         while(rstart < (rend - 1)){
//             int mid = rstart + (rend - rstart) /2;
//             if(matrix[mid][cmid] == target){
//                 return new int[]  {mid,cmid};
//             }
//             if(matrix[mid][cmid] > target){
//                 rend = mid;
//             }else{
//                 rstart = mid;
//             }
//         }

//         // Check in 2 rows mid
//         if(matrix[rstart][cmid] == target){
//             return new int[] {rstart,cmid};
//         }
//         if(matrix[rstart + 1][cmid] == target){
//             return new int[] {rstart + 1,cmid};
//         }

// if(target >= matrix[rstart][0] && target <= matrix[rstart][col-1]){
//     return binarysearch(matrix, rstart, 0, col-1, target);
// } else {
//     return binarysearch(matrix, rend, 0, col-1, target);
// }

       
//     }
// }




                
                
    



// import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12}
//         };
//         int target = 12;
//         System.out.println(Arrays.toString(check(arr,target)));
//     }

//     static int[] binarysearch(int[][] matrix,int row,int cstart,int cend, int target){
//         while(cstart <= cend){
//             int mid = cstart +(cend - cstart) /2;
//             if(matrix[row][mid] == target){
//                 return new int[] {row,mid};
//             }
//             if(matrix[row][mid] < target){
//                 cstart = mid +1;
//             } else {
//                 cend = mid -1;
//             }
//         }
//         return new int[] {-1,-1};
//     }

//     static int[] check(int[][] matrix ,int target){
//         int row = matrix.length;
//         int col = matrix[0].length;

//         if(row == 1){
//             return binarysearch(matrix, 0, 0, col - 1, target);
//         }

//         int rstart= 0;
//         int rend = row - 1;
//         int cmid = col / 2;

//         while(rstart < (rend - 1)){
//             int mid = rstart + (rend - rstart) /2;
//             if(matrix[mid][cmid] == target){
//                 return new int[] {mid,cmid};
//             }
//             if(matrix[mid][cmid] < target){
//                 rstart = mid;
//             } else {
//                 rend = mid;
//             }
//         }

//         // check middle column of remaining 2 rows
//         if(matrix[rstart][cmid] == target) return new int[] {rstart, cmid};
//         if(matrix[rstart+1][cmid] == target) return new int[] {rstart+1, cmid};

//         // now check all 4 parts using binary search
//         // 1. rstart, left half
//         int[] res = binarysearch(matrix, rstart, 0, cmid-1, target);
//         if(res[0] != -1) return res;

//         // 2. rstart, right half
//         res = binarysearch(matrix, rstart, cmid+1, col-1, target);
//         if(res[0] != -1) return res;

//         // 3. rend, left half
//         res = binarysearch(matrix, rend, 0, cmid-1, target);
//         if(res[0] != -1) return res;

//         // 4. rend, right half
//         return binarysearch(matrix, rend, cmid+1, col-1, target);
//     }
// }


