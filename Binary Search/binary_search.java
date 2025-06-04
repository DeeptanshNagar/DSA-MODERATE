import java.util.Arrays;
public class binary_search {
    public static void main(String[] args) {
    int[][] arr = {
        {1,3,6,8},
        {9,10,11},
        {20,21,22,23},
        {21,22,24,25,26,27},
        {31,32,35},
        {41,42,45,48}
    };
        int tar = 26;
        System.out.println(Arrays.toString(check(arr, tar)));
    }  

        public static int[] check(int[][] arr, int tar) {
              int start= 0; //start = row no of arr
              int end = arr.length-1; // last row no. of arr
              while(start<=end){
                int mid = start + (end-start)/2; // we find middle row of arr
                 System.out.println("avg row "+mid);
                if(tar>= arr[mid][0] && tar<= arr[mid][arr[mid].length-1]){ // we check if target is between first or last colm of the middle row
                  
                    return bs(arr , mid , arr[mid].length-1, tar ); //if yes then we send that row for binary search so that target can be binary searched in that array of mid row found
                    }
                else if(tar>= arr[mid][arr[mid].length-1])
                {   start = mid +1;
                     System.out.println("start " + start);                  
                }   
                    // if not in mid row then we check if tar is greater than the last element of mid row, if yes then we shift start of row after mid row for binary search among row oof matrix
                else 
                {  System.out.println("1end "+ end);  
                    end = mid -1;
                      System.out.println("end "+ end);}
            }    // else only option left is if the tar is less than first element of mid row(all mid row element check is already done at first check, therefore only elements before first element of mid row are left) so we shift end to mid-1 row
            return new int[]{-1,-1};
        }
            
                    
        public static int[] bs(int[][] arr, int row, int ecol, int tar) {
            // row_3- {21,22,24,25,26,27}  t=26
            int cstart =0;
            System.out.println(cstart + " " + ecol + " " + row);
            while(cstart <= ecol) { //(0<=5)
            int mid  = cstart + (ecol-cstart)/2;
               if(tar < arr[row][mid])
                   ecol = mid -1;
               else if (tar > arr[row][mid])
                   cstart = mid +1;
               else 
                   return  new int[]{row,mid} ;
             }
             return new int[]{-1,-1};
        }                      

    }