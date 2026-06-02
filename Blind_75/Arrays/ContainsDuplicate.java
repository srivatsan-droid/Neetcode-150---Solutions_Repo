package Blind_75.Arrays;

public class ContainsDuplicate {
    public static boolean isDuplicateBrute(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        boolean ans = isDuplicateBrute(nums);
        System.out.println(ans);
    }
}
