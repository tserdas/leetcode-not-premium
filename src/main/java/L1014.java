public class L1014 {
    public static int maxScoreSightseeingPair(int[] values) {
        //n^2 time
        /*int response=0;
        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){
                response = Math.max(response,values[i]+values[j]+i-j);
            }
        }
        return response;*/
        //better than n^2
        int max_so_far = values[0];
        int result = 0;
        for(int i=1;i<values.length;i++){
            result = Math.max(result, max_so_far + values[i] - i);
            max_so_far = Math.max(max_so_far, values[i] + i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(arr));
    }
}
