class Solution {
    public String decodeString(String s) {
        Stack<Integer> intStack = new Stack<>();
        Stack<StringBuilder> sbStack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                intStack.push(n);
                n = 0;
                sbStack.push(stringBuilder);
                stringBuilder = new StringBuilder();
            } else if (c == ']') {
                int k = intStack.pop();
                StringBuilder temp = stringBuilder;
                stringBuilder = sbStack.pop();
                while (k-- > 0) {
                    stringBuilder.append(temp);
                }
            } else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}