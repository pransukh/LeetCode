package JAVA.searching;

public class FA3 {

    private static final int NO_OF_CHARS = 27; // Assuming ASCII characters

    // Function to build the DFA transition table
    public static int[][] buildTransitionTable(String pattern) {
        int m = pattern.length();
        int[][] TF = new int[m + 1][NO_OF_CHARS];
        int lps = 0;

        // Initialize all entries in TF[][] to 0
        for (int state = 0; state <= m; state++) {
            for (int ch = 0; ch < NO_OF_CHARS; ch++) {
                TF[state][ch] = 0;
            }
        }
        for (int state = 65; state<65+26; state++) {
            System.out.print((char) state);
        }
        System.out.println();
        for (int state = 0; state <= m; state++) {
            for (int ch = 0; ch < NO_OF_CHARS -1; ch++) {
                System.out.print(TF[state][ch] );
            }
            System.out.println();
        }

        // Fill the transition table
        for (int state = 0; state <= m; state++) {
            for (int ch = 0; ch < NO_OF_CHARS; ch++) {
                if (state < m && (char) ch == pattern.charAt(state)) {
                    TF[state][ch] = state + 1;
                } else {
                    TF[state][ch] = getNextState(pattern, state, (char) ch);
                }
            }
        }

        return TF;
    }

    // Function to calculate the next state
    public static int getNextState(String pattern, int state, char ch) {
        // If state is less than pattern length and character matches the next character in pattern
        if (state < pattern.length() && ch == pattern.charAt(state)) {
            return state + 1;
        }

        // Find the longest prefix which is also suffix
        int lps = 0;
        for (int i = state; i > 0; i--) {
            if (pattern.charAt(i - 1) == ch) {
                int j = 0;
                for (j = 0; j < i - 1; j++) {
                    if (pattern.charAt(j) != pattern.charAt(state - i + 1 + j)) {
                        break;
                    }
                }
                if (j == i - 1) {
                    lps = i;
                    break;
                }
            }
        }
        return lps;
    }

    // Function to perform pattern matching using the DFA
    public static void search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int[][] TF = buildTransitionTable(pattern);

        int state = 0;
        for (int i = 0; i < n; i++) {
            state = TF[state][text.charAt(i)];
            if (state == m) {
                System.out.println("Pattern found at index " + (i - m + 1));
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        String text = "ABCDEF";
        String pattern = "BCDE";
        search(text, pattern);
    }
}
