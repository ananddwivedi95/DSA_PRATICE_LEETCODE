import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, \ \);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            sb.insert(0, st.nextToken() + \ \);  // Insert each word at the beginning
        }

        return sb.toString().trim();  // Remove trailing space
    }
}