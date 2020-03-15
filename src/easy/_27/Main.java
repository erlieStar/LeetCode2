package easy._27;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] num1 = {0,1,2,2,3,0,4,2};
        int count = solution.removeElement(num1, 2);
        System.out.println("count " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(num1[i]);
        }
        int[] num2 = {3,2,2,3};
        count = solution.removeElement(num2, 3);
        System.out.println("count " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(num2[i]);
        }
        int[] num3 = {1};
        count = solution.removeElement(num3, 1);
        System.out.println("count " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(num3[i]);
        }
    }
}
