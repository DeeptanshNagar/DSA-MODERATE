import java.util.ArrayList;

public class LSonMultipleOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 8, 9, 12};
        // findIndex(arr, 8, 0);
        // System.out.println(list); // print the collected indices

        // 2nd way -
        System.out.println(findIndex2(arr, 8, 0, new ArrayList<>()));
        // System.out.println(findAllIndex(arr, 8, 0));

    }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static void findIndex(int[] arr, int target, int index) {
    //     if (index == arr.length) {
    //         return ;
    //     }
    //     if (arr[index] == target) {
    //         list.add(index);
    //     }
    //     findIndex(arr, target, index + 1);
    // }

    // 2nd way -
    static ArrayList<Integer> findIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndex2(arr, target, index + 1, list);
    }

    // 3rd way - Not a good approach as it creates new arraylist multiple times with multiple recursion calls.
    // static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     if(index == arr.length) {
    //         return list;
    //     }

    //     // this will contain answer for that function call only.
    //     if(arr[index] == target) {
    //         list.add(index);
    //     }
    //     ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index+1);
    //     list.addAll(ansFromBelowCalls);
    //     return list;
    // }
}