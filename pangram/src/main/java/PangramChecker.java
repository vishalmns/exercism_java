public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] alphabetExist = new boolean[26];
        int count = 0;

        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';

            if (index >= 0 && index < 26 && !alphabetExist[index]) {
                alphabetExist[index] = true;
                count = count + 1;
            }
            if (count == 26) {
                return true;
            }
        }
        return false;

    }

}
