public class L1537 {
    public static void main(String[] args) {
        int[] n1 = new int[]{2,4,5,8,10};
        int[] n2 = new int[]{4,6,8,9};
        System.out.println(maxSum(n1,n2));
    }
    public static int maxSum(int[] nums1,int[] nums2){
        int i = 0, j = 0, n = nums1.length, m = nums2.length;
        long a = 0, b = 0, mod = (long)1e9 + 7;
        while (i < n || j < m) {
            if (i < n && (j == m || nums1[i] < nums2[j])) {
                a += nums1[i++];
            } else if (j < m && (i == n || nums1[i] > nums2[j])) {
                b += nums2[j++];
            } else {
                a = b = Math.max(a, b) + nums1[i];
                i++; j++;
            }
        }
        return (int)(Math.max(a, b) % mod);
    }
}
