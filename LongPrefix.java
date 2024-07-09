package JAVA.LEETCODE;

public class LongPrefix {
    public static void main(String[] args) {
        String [] strs = {"reflower","flow","flight"};
        System.out.println(solution(strs));
    }
    static String solution(String [] strs){

        int min = strs[0].length();
        String minStr = strs[0];
        for(String data : strs){
            if(data.length() < min){
                min = data.length();
                minStr = data;
            }
        }
        String lpx = "";
        boolean end = false;
        for(int i=0;i<=minStr.length()-1;i++){
            int k = 0;
            String match = String.valueOf(minStr.charAt(i));

            while (k<strs.length){
                if(!match.equals(strs[k].split("")[i])){
                    end = true;
                    break;
                }
                k+=1;
            }
            if(end){

                break;
            }else{
                lpx = lpx + match;
            }

        }
        return lpx;
    }
}
