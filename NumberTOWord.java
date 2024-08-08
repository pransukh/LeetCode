package org.example;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Stack;

public class NumberTOWord {
    static String[] All = new String[]{
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
            "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine",
            "Thirty", "Thirty One", "Thirty Two", "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine",
            "Forty", "Forty One", "Forty Two", "Forty Three", "Forty Four", "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine",
            "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four", "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine",
            "Sixty", "Sixty One", "Sixty Two", "Sixty Three", "Sixty Four", "Sixty Five", "Sixty Six", "Sixty Seven", "Sixty Eight", "Sixty Nine",
            "Seventy", "Seventy One", "Seventy Two", "Seventy Three", "Seventy Four", "Seventy Five", "Seventy Six", "Seventy Seven", "Seventy Eight", "Seventy Nine",
            "Eighty", "Eighty One", "Eighty Two", "Eighty Three", "Eighty Four", "Eighty Five", "Eighty Six", "Eighty Seven", "Eighty Eight", "Eighty Nine",
            "Ninety", "Ninety One", "Ninety Two", "Ninety Three", "Ninety Four", "Ninety Five", "Ninety Six", "Ninety Seven", "Ninety Eight", "Ninety Nine",
            "Hundred"
    };

    static String[] tyes = new String[]{"Ten","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static String hundred = "Hundred";
    static String thousand = "Thousand";
    static String million = "Million";
    static String billion = "Billion";




    public static void main(String[] args) {
        NumberTOWord n = new NumberTOWord();

//        System.out.println("Answer: "+n.process("9"));
//        System.out.println("Answer: "+n.process("11"));
//        System.out.println("Answer: "+n.process("91"));
//        System.out.println("Answer: "+n.process("918"));
//        System.out.println("Answer: "+n.process("9185"));
//        System.out.println("Answer: "+n.process("91856"));
//        System.out.println("Answer: "+n.process("918569"));
//        System.out.println("Answer: "+n.process("9185789"));
//        System.out.println("Answer: "+n.process("91852546"));
//        System.out.println("Answer: "+n.process("918574585"));
//        System.out.println("Answer: "+n.process("9185745854"));
//        System.out.println("Answer: "+n.process("91857458546"));



//        System.out.println("1  Answer: "+n.process("1"));
//        System.out.println("2  Answer: "+n.process("10"));
//        System.out.println("3  Answer: "+n.process("101"));
//        System.out.println("5  Answer: "+n.process("1001"));
//        System.out.println("6  Answer: "+n.process("10001"));
//        System.out.println("7  Answer: "+n.process("100001"));
//        System.out.println("8  Answer: "+n.process("1000001"));
//        System.out.println("9  Answer: "+n.process("10000001"));
//        System.out.println("10 Answer: "+n.process("100000001"));
//        System.out.println("10 Answer: "+n.process("548766562"));
//        System.out.println("11 Answer: "+n.process("1000000001"));
//        System.out.println("12 Answer: "+n.process("10000000001"));
//        System.out.println("13 Answer: "+n.process("100000000001"));






    }


    String process(String input){
       String pos[]= new String[]{"1-0","2-0",
                                           "12-0 Hundred 1",
                                           "112-0 Thousand 1 Hundred 2",
                                           "212-0 Thousand 1 Hundred 2",
                                           "1212-0 Hundred 1 Thousand 2 Hundred 3",
                                           "11212-0 Million 1 Hundred 2 Thousand 3 Hundred 4",
                                           "21212-0 Million 1 Hundred 2 Thousand 3 Hundred 4",
                                           "121212-0 Hundred 1 Million 2 Hundred 3 Thousand 4 Hundred 5",
                                           "1121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6",
                                           "2121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6",
                                           "3121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6"
       };
       int position = -1;
       for(char s : input.toCharArray()){
           position+=1;
        }

        String posArr[] = pos[position].split("-")[0].split("");
        String ans = pos[position].split("-")[1].trim();
        String pickedChars = "";
        int innerIdx = 0;
        int toPicIdx = 0;
        for (int i = 0; i < posArr.length ; i++) {
            int no = Integer.parseInt(posArr[i]);
            while(innerIdx < no){
                pickedChars+=String.valueOf(input.charAt(toPicIdx));
                innerIdx+=1;
                toPicIdx+=1;
            }
            if("Zero".equals(All[Integer.parseInt(pickedChars)])){
                ans=ans.replace(String.valueOf(i),"Zero");
            }
            else {
                ans=ans.replace(String.valueOf(i),All[Integer.parseInt(pickedChars)]);
            }



            pickedChars="";
            innerIdx=0;
        }
        if(ans.length()==4 && ans.equalsIgnoreCase("zero")){
            return ans.trim();
        }
//        "12-0 Hundred 1",
//                "112-0 Thousand 1 Hundred 2",
//                "212-0 Thousand 1 Hundred 2",
//                "1212-0 Hundred 1 Thousand 2 Hundred 3",
//                "11212-0 Million 1 Hundred 2 Thousand 3 Hundred 4",
//                "21212-0 Million 1 Hundred 2 Thousand 3 Hundred 4",
//                "121112-0 Hundred 1 Million 2 Hundred 3 Thousand 4 Hundred 5",
//                "1121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6",
//                "2121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6",
//                "3121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6"
//

        ans = ans.replace("Zero", "");
        ans = ans.replace("Thousand  Hundred", "Thousand");
        ans = ans.replace("Million  Hundred", "Million");
        ans = ans.replace("Million  Thousand", "Million");
        ans = ans.replace("Billion  Hundred", "Billion");
        ans = ans.replace("Billion  Million", "Billion");

        String format[] = ans.split(" ");
        ans = "";
        for(String f : format){

            if(f.trim().length() > 0){
                ans = ans +" "+f.trim();
            }
        }
        return ans.trim();
        //return get(input,pos[position]);
    }

    String get(String input, String pos){

        String posArr[] = pos.split("-")[0].split("");
        String ans = pos.split("-")[1].trim();
        String pickedChars = "";
        int innerIdx = 0;
        int toPicIdx = 0;
        int toReplace = 0;
        for (int i = 0; i < posArr.length ; i++) {
            int no = Integer.parseInt(posArr[i]);
            while(innerIdx < no){
                pickedChars+=String.valueOf(input.charAt(toPicIdx));
                innerIdx+=1;
                toPicIdx+=1;
            }
            if("Zero".equals(All[Integer.parseInt(pickedChars)])){
                ans=ans.replace(String.valueOf(i),"Zero");
            }
            else {
                ans=ans.replace(String.valueOf(i),All[Integer.parseInt(pickedChars)]);
            }



            pickedChars="";
            innerIdx=0;
        }
            if(ans.length()==4 && ans.equalsIgnoreCase("zero")){
                return ans.trim();
            }
//        "12-0 Hundred 1",
//                "112-0 Thousand 1 Hundred 2",
//                "212-0 Thousand 1 Hundred 2",
//                "1212-0 Hundred 1 Thousand 2 Hundred 3",
//                "11212-0 Million 1 Hundred 2 Thousand 3 Hundred 4",
//                "21212-0 Million 1 Hundred 2 Thousand 3 Hundred 4",
//                "121112-0 Hundred 1 Million 2 Hundred 3 Thousand 4 Hundred 5",
//                "1121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6",
//                "2121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6",
//                "3121212-0 Billion 1 Hundred 2 Million 3 Hundred 4 Thousand 5 Hundred 6"
//

        ans = ans.replace("Zero", "");
        ans = ans.replace("Thousand  Hundred", "Thousand");
        ans = ans.replace("Million  Hundred", "Million");
        ans = ans.replace("Million  Thousand", "Million");
        ans = ans.replace("Billion  Hundred", "Billion");
        ans = ans.replace("Billion  Million", "Billion");

        String format[] = ans.split(" ");
        ans = "";
        for(String f : format){

            if(f.trim().length() > 0){
                ans = ans +" "+f.trim();
            }
        }
        return ans.trim();
    }



}


