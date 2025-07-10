
import java.util.ArrayList;

public class combinations {
    public static void main(String[] args) {
        // combo("", 4);

        // ArrayList<String> ans = comboRet("", 4);
        // System.out.println(ans);

        // System.out.println(comboRet("", 4));

        comboFace("", 4, 6);
    }
    static void combo(String p, int target) {
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            combo(p + i, target - i);
        }
    }

    static ArrayList<String> comboRet(String p, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(comboRet(p + i, target - i));
        }
        return list;
    }

    static void comboFace(String p, int target, int face) {
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            comboFace(p + i, target - i, face);
        }
    }
}
