import java.util.Stack;

public class LogsDirAction {
    public static void main(String[] args) {
        Stack<String> actionStack = new Stack();
        String current = "./";
        String back = "../";
        // String[] actions = new String[] { "d1/", "d2/", "./", "d3/", "../", "d31/" };
        // //3
        // String[] actions = new String[] { "d1/", "../", "../", "../" }; // 0
        String[] actions = new String[] { "d1/", "d2/", "../", "d21/", "./" }; // 2

        for (String action : actions) {
            if (!action.equals(current) && !action.equals(back)) {
                actionStack.add(action);
            } else if (action.equals(back)) {
                if (!actionStack.isEmpty())
                    actionStack.pop();
            }
        }

        System.out.println(actionStack.size());
    }
}
