package JAVA.searching;

import static JAVA.searching.FA3.getNextState;

public class FiniteAutomata_2 {

    static int ALPHABETS = 26;
    static String patt = "CAC";
    public static void main(String[] args) {
        char[] pat = "CAC".toCharArray();

        char[] txt = "ABCABCACBA".toCharArray();
        search(txt,pat);
    }

    private static void search(char[] txt, char[] pat){
        // make table
        int[][] Table = new int[pat.length][ALPHABETS + 1];

        Table = fillTable(Table, pat);
        for(int i=65;i<65+26;i++){
            System.out.print((char)i);
        }
        System.out.println();
        for(int row = 0;row<pat.length;row++){
            for(int col=0;col < ALPHABETS;col++){
                System.out.print(Table[row][col]);
            }
            System.out.println();
        }

    }

    private static int[][] fillTable(int [][] Table, char[] pat){
        int state = 0;
        for(int row = 0;row<pat.length;row++){
            int ascii = 65;
            for(int col=0;col < ALPHABETS;col++){

                if(pat[row] == (char)ascii ){

                    Table[row][col] = row+1;
                }else{
                    Table[row][col] = getNextState(patt, state, (char) ascii);
                }

                ascii++;
            }
        }
        return Table;
    }
}
