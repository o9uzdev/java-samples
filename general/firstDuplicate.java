import java.util.HashSet;
import java.util.Set;

public class firstDuplicate {
    public static void main(String[] args) {
        int[] test1 = {2, 1, 3, 5, 3, 2};
        int[] test2 = {1, 1, 3, 5, 3, 2};

        System.out.println(firstDuplicate(test1));
        System.out.println(firstDuplicate(test2));
    }

    static int firstDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i:a){
            if(!set.add(i)) {
                return i;
            }
        }
        return -1;
    }
}
