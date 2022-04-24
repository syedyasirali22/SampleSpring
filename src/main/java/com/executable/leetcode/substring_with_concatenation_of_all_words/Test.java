package com.executable.leetcode.substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(findSubstring(s, words));
    }

    private static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        Integer wordLength = words[0].length();
        Integer count = 0;
        Map<String , Integer> wordMap = new HashMap<>();
        for(int i = 0; i < words.length; i ++) {
            count = wordMap.getOrDefault(words[i], 0);
            wordMap.put(words[i], count + 1);
        }

        Integer founded = 0;
        for(int i = 0 ; i < s.length() - (words.length * wordLength); i ++){
            founded = 0;
            Map<String, Integer> tempWordMap = new HashMap<>(wordMap);
            for(int j = i ; j < (s.length() - wordLength +1); j+=wordLength) {
                String w = s.substring(j , j + wordLength);
                if(tempWordMap.containsKey(w) && tempWordMap.get(w) != 0 && founded < words.length) {
                    tempWordMap.put(w, tempWordMap.get(w) - 1);
                    founded++;
                    if(founded == words.length) {
                        answer.add(i);
                        break;
                    }
                }
                else
                    break;
            }
        }

        return answer;
    }
}
