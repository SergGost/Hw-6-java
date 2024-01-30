
//  Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//  максимальное количество подряд идущих 1.


public class NumbersOnes {
    public static void main(String[] args) {
        

        int[] nums = { 0, 1, 1, 0, 0, 1, 1, 1, 1 };

        int maxCount = getMaxCountOnes(nums);
        System.out.println(maxCount);

    }

    private static int getMaxCountOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
                //maxCount = maxCount > count ? maxCount : count;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }


}