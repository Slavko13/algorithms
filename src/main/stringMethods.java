package main;

public class stringMethods {
    static String overturnString(String name) {
        int stringLength = name.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = name.charAt(i) + result;
        }
        return result;
    }

    static String overturnStringNextLevel(String name) {
        char[] charsOfName = name.toCharArray();
        String result = "";

        for (char oneChar  : charsOfName    ) {
            result = oneChar + result;
        }
        return result;
    }

}
