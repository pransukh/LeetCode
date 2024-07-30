class MinimumDeletion {
    public int minimumDeletions(String a) {
         int res = 0;
        int count =0;
        for(char c:a.toCharArray()){
            if(c == 'b'){
                count++;
            }else if(count>0){
                res++;
                count--;
            }
        }
        return res;
    }
}
