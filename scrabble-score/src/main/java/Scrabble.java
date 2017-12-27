import java.util.*;

class Scrabble {
    String word;
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

    Scrabble(String word) {
        this.word = word.toLowerCase();
        hm.put('a', 1);
        hm.put('b', 3);
        hm.put('c', 3);
        hm.put('d', 2);
        hm.put('e', 1);
        hm.put('f', 4);
        hm.put('g', 2);
        hm.put('h', 4);
        hm.put('i', 1);
        hm.put('j', 8);
        hm.put('k', 5);
        hm.put('l', 1);
        hm.put('m', 3);
        hm.put('n', 1);
        hm.put('o', 1);
        hm.put('p', 3);
        hm.put('q', 10);
        hm.put('r', 1);
        hm.put('s', 1);
        hm.put('t', 1);
        hm.put('u', 1);
        hm.put('v', 4);
        hm.put('w', 4);
        hm.put('x', 8);
        hm.put('y', 4);
        hm.put('z', 10);

    }

    int getScore() {
        int scrabbleScore = 0;
        for (int index = 0; index < word.length(); index++) {
            char eachCharacterInString = word.charAt(index);
            if (hm.containsKey(eachCharacterInString))x {
                scrabbleScore = scrabbleScore + hm.get(eachCharacterInString);
            }
        }
        return scrabbleScore;
    }

}
