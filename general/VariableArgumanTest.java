// Variable Arguman Test Java Example

public class VariableArgumanTest {
    
    public static int sum(int... nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1,3,4,5));
    }
}
