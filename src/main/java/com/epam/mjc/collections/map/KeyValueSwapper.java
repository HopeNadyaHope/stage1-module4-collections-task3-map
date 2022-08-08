package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (swappedMap.containsKey(entry.getValue())) {
                int swappedValue = swappedMap.get(entry.getValue());
                if (swappedValue > entry.getKey()) {
                    swappedMap.put(entry.getValue(), entry.getKey());
                }
            } else {
                swappedMap.put(entry.getValue(), entry.getKey());
            }
        }
        return swappedMap;
    }
}
