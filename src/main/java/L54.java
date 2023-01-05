import java.util.ArrayList;
import java.util.List;

public class L54 {
    public static void main(String[] args) {

    }
    private static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> response = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while (left<right && top<bottom){

            for(int i=left;i<right;i++)
                response.add(matrix[top][i]);
            top++;

            for(int i=top;i<bottom;i++)
                response.add(matrix[i][right-1]);
            right--;

            // [1,2,3] or [[1],[2],[3]] check
            if (left>=right && top>=bottom)
                break;

            for(int i=right-1;i>=left;i--)
                response.add(matrix[bottom-1][i]);
            bottom--;

            for(int i=bottom-1;i>=top;i--)
                response.add(matrix[i][left]);
            left++;
        }
        return response;
    }
}
