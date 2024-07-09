package JAVA.searching;

import java.util.Arrays;

// Java program for Finite Automata Pattern
// searching Algorithm
public class FiniteAutomata {

    static int NO_OF_CHARS = 256;
    static int getNextState(char[] pat, int M,
                            int state, int x)
    {

        System.out.println("pat = " + Arrays.toString(pat) + ", M = " + M + ", state = " + state + ", x = " + x);
        // If the character c is same as next
        // character in pattern,then simply
        // increment state
        //System.out.println(state+" "+M+" "+pat[state]+" "+x);
        if(state < M && x == pat[state])
            return state + 1;

        // ns stores the result which is next state
        int ns, i;

        // ns finally contains the longest prefix
        // which is also suffix in "pat[0..state-1]c"

        // Start from the largest possible value
        // and stop when you find a prefix which
        // is also suffix
        for (ns = state; ns > 0; ns--)
        {
            if (pat[ns-1] == x)
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

    /* This function builds the TF table which
    represents Finite Automata for a given pattern */
    static void computeTF(char[] pat, int M, int TF[][])
    {
        int state, x;
        for (state = 0; state <= M; ++state)
            for (x = 0; x < NO_OF_CHARS; ++x)
                TF[state][x] = getNextState(pat, M, state, x);
    }

    /* Prints all occurrences of pat in txt */
    static void search(char[] pat, char[] txt)
    {
        int M = pat.length;
        int N = txt.length;

        int[][] TF = new int[M+1][NO_OF_CHARS];

        computeTF(pat, M, TF);
        // Just printing
        System.out.print("STATE ");
        System.out.print("CHAR");
        for(int i=0;i<NO_OF_CHARS;i++){
            System.out.print(" "+(char)i);
        }
        System.out.println();
        for(int i=0;i<TF.length-1;i++){
            System.out.print(i+"        "+pat[i]);
            for(int j=0;j<NO_OF_CHARS;j++){
                System.out.print (" "+TF[i][j]);
            }
            System.out.println();
        }
        // Just printing end

        // Process txt over FA.
        int i, state = 0;
        for (i = 0; i < N; i++)
        {
            state = TF[state][txt[i]];
            if (state == M)
                System.out.println("Pattern found "
                        + "at index " + (i-M+1));
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        char[] pat = "ABCDEF".toCharArray();
        char[] txt = "CDEF".toCharArray();
        search(txt,pat);
    }
}

// This code is contributed by debjitdbb.

