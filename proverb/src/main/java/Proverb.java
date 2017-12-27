class Proverb {
    String[] words;

    Proverb(String[] words) {
        this.words = words;

    }

    String recite() {
        StringBuilderls
                poem = new StringBuilder();
        if (words.length == 0) {
            return "";
        }
        for (int index = 0; index < words.length - 1; index++) {
            poem.append(addLine(words[index], words[index + 1]));
        }
        poem.append(addLastLine(words[0]));
        return poem.toString();
    }

    String addLine(String firstWord, String secondWord) {
        return "For want of a " + firstWord + " the " + secondWord + " was lost.\n";
    }

    String addLastLine(String firstWord) {
        return "And all for the want of a " + firstWord + ".";
    }

}
