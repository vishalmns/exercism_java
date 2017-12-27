import java.util.*;

public class WordCount {
    public Map<String,Integer> phrase(String inputPharse) {
        Map<String,Integer> wordCount = new HashMap<String,Integer>();
        String[] words = inputPharse.split("[^\\w]+");
        for(String word : words) {
            word = word.toLowerCase();
            if(wordCount.containsKey(word)) {
                int frequency = wordCount.get(word);
                frequency = frequency + 1;
                wordCount.put(word,frequency);
            }
            else {
                wordCount.put(word,1);
            }
        }
        return wordCount;
    }
}