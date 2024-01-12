public class problem1
{
    public static void main(String args[])
    {
        int[] nums = {2,11,7,15};
        int target = 9;
        int[] output = {0,0};
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = 0; j < nums.length-1; j++) {
                if(i==j)
                    j++;
                if (nums[i] + nums[j] == target) {
                    output[0] = nums[i];
                    output[1] = nums[j];
                }
            }
        }
        System.out.print(output[0] + " and " + output[1]);
    }
}
