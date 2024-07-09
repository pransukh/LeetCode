package JAVA;

public class PracticeOfFiniteAutomata {
    static final int asciiCode = 7;
    public static void main(String[] args) {
        char[] txt = "ABABABACABA".toCharArray();
        char[] pat = "ABABACA".toCharArray();
       search(txt,pat);

    }
    private static void search(char txt[], char pat[]){
        int tl = txt.length;
        int pl = pat.length;

        int [][] TF = new int[pl + 1][26]; // + 1 is for state 0 where first match will be made.
        computeTF(pat,pl,TF);

        int i, state = 0;
        for (i = 0; i < tl; i++)
        {
            state = TF[state][i];
            if (state == pl)
                System.out.println("Pattern found "
                        + "at index " + (i-pl+1));
        }    }

    private static void computeTF(char pat[], int pl, int TF[][]){
        int state, character;

        System.out.print("S | ");
        for(int i=65;i<91;i++){
            System.out.print((char)i+" | ");
        }

        System.out.println();
        for(int i=65;i<=91;i++){
            System.out.print("__| ");
        }
        System.out.println();

        int ascii = 65;
        for (state = 0;state <= pl;state ++){
            for(character = 0; character < asciiCode; character++){
                TF[state][character] = matchAndFill(pat,pl,state,ascii);
                ascii++;
            }
            ascii = 65;
        }

        for (state = 0;state <= pl;state ++){
            System.out.print(state+" | ");
            for(character = 0; character < asciiCode; character++){
                System.out.print( TF[state][character]+" | ");
//                if(TF[state][character] > 0){
//                    System.err.print( TF[state][character]+" | ");
//                }else {
//                    System.out.print( TF[state][character]+" | ");
//                }

            }
            System.out.println();
        }
    }

    static int matchAndFill(char pat[], int pl, int state, int characterASCII){
        // ABCDEFG
        // CDEF
        // 0123
        if(state < pl && characterASCII == pat[state]) // 0 < 4 && 67 == pat[0]~C
            return state + 1;

        int ns, i;
        for (ns = state; ns > 0; ns--)
        {
            if (pat[ns-1] == characterASCII)
            {

                for (i = 0; i < ns-1; i++)
                    if (pat[i] != pat[state-ns+1+i])
                        break;
                if (i == ns-1)
                    return ns;
            }
        }
     return 0;
    }
}
