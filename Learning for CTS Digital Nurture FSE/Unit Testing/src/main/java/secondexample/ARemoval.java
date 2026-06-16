package secondexample;

public class ARemoval {
    public String removal(String str){
        if(str.length()>=2){
            if(str.charAt(0)=='A'){
                if(str.charAt(1)=='A'){
                    return str.substring(2);
                }else {
                    return str.substring(1);
                }
            }else if(str.charAt(1)=='A'){
                String st = str.charAt(0) + str.substring(2);
                return st;
            }
        }else {
            if(str.length()==1){
                if(str.charAt(0)=='A') return "";
            }
        }
        return str;
    }
}
