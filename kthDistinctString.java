 HashMap<String, Integer> strings = new HashMap();
        for(String s : arr){
            strings.put(s,strings.getOrDefault(s,0)+1);
        }
        for(String s : arr){
            if(strings.get(s) == 1){
                k-=1;
                if(k == 0){
                    return s;
                }
            }
        }
        return "";
