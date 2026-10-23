class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If opening bracket, add to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                // No opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if brackets match
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
