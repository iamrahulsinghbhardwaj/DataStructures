import java.util.Scanner;

public class PairStar {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(AddStars(input));
        System.out.println(AddStarsTwo(input, 0));
    }

    public static String AddStars(String s) {
        return AddStars(s, 0, "");
    }

    public static String AddStarsTwo(String s, int index) {

        if (index >= s.length() - 1) {
            return index == s.length() - 1 ? s.substring(index) : "";
        }

        if (s.charAt(index) == s.charAt(index + 1)) {
            return s.charAt(index) + "*" + AddStarsTwo(s, index + 1);
        } else {
            return s.charAt(index) + AddStarsTwo(s, index + 1);
        }
    }

    public static String AddStars(String s, int index, String finalString) {
        if (index >= s.length()) {
            return finalString;
        }

        if (index < s.length() - 1 && s.charAt(index) == s.charAt(index + 1)) {
            finalString = finalString + s.charAt(index) + "*";
        } else {
            finalString = finalString + s.charAt(index);
        }

        return AddStars(s, index + 1, finalString);
    }
}
