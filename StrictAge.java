class StrictAge {
public int  countSeniors(String[] details) {
        int count = 0;
        for(String detail: details){
           int o = detail.charAt(11)-'0';
            int t = detail.charAt(12)-'0';
            if((o*10)+t > 60) count+=1;

           
        }
        return count;
    }
}
