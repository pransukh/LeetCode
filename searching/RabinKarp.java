package JAVA.searching;

public class RabinKarp {
    public final static int d = 256;
    public static void main(String[] args) {
        String text = "HELLOMYNAMEISSANDEEPLLOMY";
        String pattern = "LLO";
        search(text,pattern);

    }

    static void search(String text, String pattern){
        int primeNumber = 101;
        int tl = text.length();
        int pl = pattern.length();
        int hashText = 0;
        int hashPattern = 0;
        int i,j;
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for(i = 0;i< pl - 1;i++){
            h = (h * d) % primeNumber;
        }

        for (i = 0; i < pl; i++) {

            hashPattern = (d * hashPattern + pattern.charAt(i)) % primeNumber;
            hashText = (d * hashText + text.charAt(i)) % primeNumber;

        }

        System.out.println(hashPattern+"-"+hashText+"-"+h);
        // Slide the pattern over text one by one
        for (i = 0; i <= tl - pl; i++) {

            // Check the hash values of current window of
            // text and pattern. If the hash values match
            // then only check for characters one by one
            if (hashPattern == hashText) {
                /* Check for characters one by one */
                for (j = 0; j < pl; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1,
                // ...i+M-1]
                if (j == pl)
                    System.out.println(
                            "Pattern found at index " + i);
            }

            // Calculate hash value for next window of text:
            // Remove leading digit, add trailing digit
            if (i < tl - pl) {
                char tc = text.charAt(i);
                char tc2 = text.charAt(i + pl);
                hashText = (d * (hashText - tc * h) + tc2) % primeNumber;

                // We might get negative value of t,
                // converting it to positive
                if (hashText < 0)
                    hashText = (hashText + primeNumber);
            }
        }

    }
}
