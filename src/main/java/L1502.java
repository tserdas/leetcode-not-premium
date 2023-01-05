import java.util.Arrays;

public class L1502 {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==0 || arr.length==1) return true;
        Arrays.sort(arr);
        int dif = arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=dif)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
