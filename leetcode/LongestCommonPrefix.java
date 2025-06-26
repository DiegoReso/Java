package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str = {"flow", "flight", "flower"};

        System.out.println(verify(str));
    }

    static String verify(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        String firstString = str[0];
        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

            for (int j = 0; j < str.length; j++) {
                String currentString = str[j];

                if (i >= currentString.length() || currentString.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }
        return commonPrefix.toString();
    }
}
