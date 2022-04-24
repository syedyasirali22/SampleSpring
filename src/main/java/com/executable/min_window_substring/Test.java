package com.executable.min_window_substring;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        System.out.println(minWindow("ABAACBAB", "AABC"));
    }

    public static String minWindow(String s, String t) {

        int[] ans = {-1, 0, 0};
        if(s.length() == 0 || t.length() == 0)
            return "";

        Map<Character, Integer> subMap = new HashMap<>();
        Integer count =0;
        for(int i = 0; i < t.length(); i++) {
            count = subMap.getOrDefault(t.charAt(i), 0);
            subMap.put(t.charAt(i), count);
        }
        Integer required  = subMap.size();
        Integer l = 0, r = 0, formed = 0;
        Map<Character, Integer> window = new HashMap<>();
        while( r < s.length()) {
            char c = s.charAt(r);
            count = window.getOrDefault(c, 0);
            window.put(c, count);
            if(window.containsKey(c) && window.get(c).intValue() == subMap.get(c).intValue())
                formed++;
            while (l <= r && formed == required) {
                c= s.charAt(l);
                if(ans[0] == -1 || r-l+1 > ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                window.put(c, window.get(c) - 1);
                if(subMap.containsKey(c) && window.get(c) < subMap.get(c))
                    formed --;

                l++;
            }

            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
