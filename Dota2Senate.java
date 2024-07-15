class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int rc = 0;
        int dc = 0;
        for (int i = 0; i < senate.length() ; ) {
            if(i == senate.length() - 1){
                break;
            }
            if(senate.charAt(i) == senate.charAt(i+1)){
                i+=1;
            }else{
                    senate = senate+senate.charAt(i);
                    senate=senate.replaceFirst(String.valueOf(senate.charAt(i)),"");
                    senate=senate.replaceFirst(String.valueOf(senate.charAt(i)),"");

                i=0;
            }
          }
        for (char k : senate.toCharArray()){
            if(k == 'R'){
                rc++;
            }
            if(k == 'D'){
                dc++;
            }
        }
        return rc>dc ? "Radiant" : "Dire";
    }
}
