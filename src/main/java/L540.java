import java.util.Stack;

public class L540 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()){
                st.push(nums[i]);
            } else {
                if(st.peek()==nums[i]) {
                    st.pop();
                }
            }
        }
        return st.pop();
    }
}
