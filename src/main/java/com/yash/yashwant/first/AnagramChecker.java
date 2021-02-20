package com.yash.yashwant.first;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        HashMap<Character, Integer> freq1 = calcFreq(ch1, n1);
        HashMap<Character, Integer> freq2 = calcFreq(ch2, n2);

        boolean result = hashcompare(freq1, freq2);
        return result;

    }

    public HashMap<Character,Integer> calcFreq(char [] ch, int n){
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i=0; i<n; i++){
            char key = ch[i];
            if(freq.containsKey(key)){
                int value = freq.get(key);
                freq.put(key,value+1);
            }
            else{
                freq.put(key,1);
            }
        }
        return freq;
    }

    public boolean hashcompare(HashMap<Character, Integer> map1,HashMap<Character, Integer> map2){
        if (map1.size()!= map2.size()){
            return false;
        }
        for(Map.Entry<Character, Integer> entry: map1.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            Integer value2 = map2.get(key);
            if (value!=value2) {
                return false;
            }

        }
        return true;
    }

}
