package com.tatyushevms.countletters;

import java.util.LinkedHashMap;

public class SimpleLetterCounter implements LetterCounter {
    
    @Override
    public String count(final String word) {
        final LinkedHashMap<Character, Integer> treeMap = new LinkedHashMap<>();
        
        word.chars().forEachOrdered(c ->
                treeMap.compute((char) c, (k, v) -> (v == null) ? 1 : ++v)
        );
        
        return report(treeMap);
    }
    
    private String report(final LinkedHashMap<Character, Integer> treeMap) {
        final StringBuilder sb = new StringBuilder();
        treeMap.forEach((character, count) -> {
            sb.append(character);
            sb.append(count);
        });
        return sb.toString();
    }
    
}
