import java.util.ArrayList;

public class LSonMultipleOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 8, 9, 12};
        // findIndex(arr, 8, 0);
        // System.out.println(list); // print the collected indices

        // 2nd way -
        System.out.println(findIndex2(arr, 8, 0, new ArrayList<>()));

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
}
