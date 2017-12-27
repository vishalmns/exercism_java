class Acronym {
    private String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] phraseSplit = phrase.split("[ -]");
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < phraseSplit.length; index++) {
            char firstCharOfEachWord = phraseSplit[index].charAt(0);
            firstCharOfEachWord = Character.toUpperCase(firstCharOfEachWord);
            sb.append(firstCharOfEachWord);
        }
        String acronym = sb.toString();
        return  acronym;
    }

}
