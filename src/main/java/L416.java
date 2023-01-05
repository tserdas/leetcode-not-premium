import java.util.Arrays;
import java.util.HashSet;

public class L416 {
    public static void main(String[] args) {
        int[] ex1 = new int[]{1,5,11,5};
        int[] ex2 = new int[]{3,3,3,4,5};
        int[] ex3 = new int[]{2,2,1,1};
        System.out.println(canPartition(ex3));
    }
    public static boolean canPartition(int[] nums){
        int sum = Arrays.stream(nums).sum();
        if(sum%2!=0) return false;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int target = sum/2;
        for(int i=nums.length-1;i>=0;i--){
            HashSet<Integer> next = new HashSet<>();
            for(Integer x : set){
                next.add(x+nums[i]);
                next.add(x);
            }
            set = next;
        }
        return set.contains(target);
    }
}
