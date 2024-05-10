package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String originElement : origin) {
            check.add(originElement);
        }
        for (String textElement : text) {
            result = check.contains(textElement);
            if (!result) {
               break;
            }
        }
        return result;
    }
}
