package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("silaevamo@gamil.com", "Трушина Марина Олеговна");
        for (Map.Entry<String, String> element : data.entrySet()) {
            String key = element.getKey();
            String value = element.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
