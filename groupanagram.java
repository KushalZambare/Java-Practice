import java.util.*;

public class groupanagram{
    public static void main(String[] args){
        String[] str = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : str){
            char[] chr = word.toCharArray();
            Arrays.sort(chr);
            String key = new String(chr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);

        }
        System.out.print(map.values());

    }
}
