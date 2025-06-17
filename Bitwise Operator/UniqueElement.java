// Kunal Kushwaha Method - (Method 3)
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 9, 2, 7, 7, 8, 7, 8, 8};
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    sum++;
                }
            }

            // If count of set bits is not a multiple of 3,
            // it means the unique number has that bit set.
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        System.out.println("The number that appears only once is: " + result);
    }
}

// Time Comp. - O(n * 32);
// Space Comp. - O(1)





// public class UniqueElement{
//     public static void main(String[] args) {
//         int[] arr = {4, 4, 4, 6, 5, 5, 5};
//         // int[] arr = {4, 4, 4, 5, 5, 5, 6};
//         // int[] arr = {6, 4, 4, 4, 5, 5, 5};
//         int ans = findUnique(arr);
//         System.out.println(ans);
//     }

//     static int findUnique(int[] arr) {
//         for (int i = 1; i < arr.length; i = i+3) {
//             if(arr[i] != arr[i-1]) {
//                 return arr[i-1];
//             }
//         }
//         return arr[arr.length-1];
//     }
// }



















// Method 1

// public class UniqueElement {
//      public static void main(String[] args) {
//         int[] arr = {2, 2, 3, 3, 3, 9, 2, 7, 7, 8, 7, 8, 8};
//         int ans = findUnique(arr);
//         System.out.println(ans);
//     }

//     // using hash tables - 
//     static int findUnique(int[] arr) {
//         int n = arr.length;
//         int maxi = arr[0];
//         for (int i = 0; i < n; i++) {
//             maxi = Math.max(maxi, arr[i]);
//         }
//         int[] hash = new int[maxi+1];
//         for (int i = 0; i < n; i++) {   // iterating arr
//             hash[arr[i]]++;
//         }
//         for (int i = 0; i <= maxi; i++) {       // iterating hash array
//             if(hash[i] == 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

// Time complexity - O(n * log m) + O(m)
// Space complexity - O(m)

// where m = (arr.length/3) + 1 // divide by 3 because each element is occuring thrice accept one element. So elements which occuring thrice we are taking that element only once in hash table or hashMap to record it occurences.





// Method 2 -
// check for this method ;--- 


// import java.util.HashMap;
// import java.util.Map;

// public class UniqueElement {
//     public static void main(String[] args) {
//         int[] nums = {2, 2, 3, 3, 3, 9, 2, 7, 7, 8, 7, 8, 8};
//         System.out.println(findUnique(nums));
//     }

//     static int findUnique(int[] nums) {
//         HashMap<Integer, Integer> mpp = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
//         }

//         for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//             if (it.getValue() == 1) {
//                 return it.getKey();
//             }
//         }

//         return -1; 
//     }
// }




