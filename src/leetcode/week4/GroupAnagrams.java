package leetcode.week4;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] words){
        if(words.length == 0){
            throw new RuntimeException("Words arr is empty");
        }

        HashMap<String, List<String>> map = new HashMap<>(); 

        for(String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            //check if key exist if not add value
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(word);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(word);
                map.put(sortedString, newList);
            }
        }

        return new ArrayList<>(map.values());
    }
}