public class Identical {
    public static void main(String[] args){
        int[][] arr = {{1,0,2},{0,1,0},{0,0,1}};
        boolean f = true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j && arr[i][j]==1)
                {
                    f = true;
                }else if(arr[i][j]==0){
                    f= true;
                }else{
                    f=false;
                    break;
                }
            }
            if(!f) break;
        }
        if(f){
            System.out.println("identical");
        }else{
            System.out.println("not identical");
        }
    }
}