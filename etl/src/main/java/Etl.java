import java.util.List;
import java.util.*;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        for (Map.Entry m : old.entrySet()) {
            List<String> listWithParticularValue = new ArrayList<String>();
            int score = (int) m.getKey();
            System.out.println(m.getValue().getClass().getName());
            listWithParticularValue = (List) old.get(score);
            for (String alphabet : listWithParticularValue) {
                mp.put(alphabet.toLowerCase(), score);
            }
        }
        return mp;
    }

}
