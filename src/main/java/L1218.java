import java.util.HashMap;
import java.util.Map;

public class L1218 {
    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        for (int j : arr) {
            int len = map.getOrDefault(j - difference, 0) + 1;
            map.put(j, len);
            ans = Math.max(ans, len);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,7,8,5,3,4,2,1};
        int dif = -2;
        System.out.println(longestSubsequence(arr,dif));
    }
}
