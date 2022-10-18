import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static Set<String> stringPermutation(String input) {
        HashSet<String> stringPerm = new HashSet<>();
        if (input == null) {
            return null;
        } else if (input.length() == 0) {
            stringPerm.add("");
            return stringPerm;
        }
        char firstChar = input.charAt(0);
        String stringRem = input.substring(1);
        Set<String> stringRemPerm = new HashSet<>();
        stringRemPerm = stringPermutation(stringRem);

        for (String value : stringRemPerm
        ) {
            for (int i = 0; i <= value.length(); i++) {
                stringPerm.add(insertFirstChar(value, firstChar, i));
            }
        }
        return stringPerm;
    }

    public static String insertFirstChar(String input, char firstChar, int pos) {

        String firstPosition = input.substring(0, pos);
        String endPosition = input.substring(pos);
        String middlePosition = firstPosition + firstChar + endPosition;
        return middlePosition;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(stringPermutation(str)); //[ACB, BCA, ABC, CBA, BAC, CAB]
    }
}
