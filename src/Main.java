import java.util.*;


public class Main {
    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> repetition = new HashMap<>();
        String textLower = TEXT.toLowerCase();
        for (int i = 0; i < textLower.length(); i++) {
            char c = textLower.charAt(i);
            if (!Character.isLetter(c)) {
                continue;
            }
            if (repetition.containsKey(c)) {
                repetition.put(c, repetition.get(c) + 1);
            } else {
                repetition.put(c, 1);
            }
        }

        int repMax = -1;
        char charMax = 0;
        for (char c : repetition.keySet()) {
            if (repetition.get(c) > repMax) {
                repMax = repetition.get(c);
                charMax = c;
            }
        }

        int repMin = Integer.MAX_VALUE;
        char charMin = 0;
        for (char c : repetition.keySet()) {

            if (repetition.get(c) < repMin) {
                repMin = repetition.get(c);
                charMin = c;
            }
        }
        System.out.println("Больше всего повторяется символ " + "'" + charMax + "'" + " он встречается:" + repMax + " раз(а)!");
        System.out.println("Меньше всего повторяется символ " + "'" + charMin + "'" + " он встречается:" + repMin + " раз(а)!");

    }
}