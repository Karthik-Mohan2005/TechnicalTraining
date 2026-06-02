import java.util.*;
public class ReverseSpiral{
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int top = 0;
        int left = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;
        ArrayList<Integer> a = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=right;i>=left;i--){
                a.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a.add(arr[i][left]);
            }
            left++;
            if(top<=bottom){
                for(int i=left;i<=right;i++){
                    a.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a.add(arr[i][right]);
                }
                right--;
            }
        }
        System.out.println(a);
    }
}