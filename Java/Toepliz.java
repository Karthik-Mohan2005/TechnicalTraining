public class Toepliz{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{5,1,2,3,4},{4,5,1,2,3},{3,4,5,1,2},{2,3,4,5,1}};
        boolean f = true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[0].length-1;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    f=false;
                    break;
                }   
            }
            if(!f){
                break;
            }
        }
        if(f){
                System.out.println("Toepliz");
            }else{
                System.out.println("Not toepliz");
            }
    }
}