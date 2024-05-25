package ru.job4j.hashmap;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0D;
        int subjectsCount = 0;
        for (Pupil person : pupils) {
            for (Subject subject : person.subjects()) {
                sum += subject.scope();
            }
            subjectsCount += person.subjects().size();
        }
        return sum / subjectsCount;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labelsList = new LinkedList<>(); 
        for (Pupil pupil : pupils) {
            double sumByPerson = 0;
            for (Subject subject : pupil.subjects()) {
                sumByPerson += subject.scope();
            }
            labelsList.add(new Label(pupil.name(), sumByPerson / pupil.subjects().size()));
        }
        return labelsList;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> linkedMap = new HashMap<>();
        List<Label> labels = new LinkedList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) { 
                String name = subject.name();
                linkedMap.put(subject.name(), linkedMap.getOrDefault(name, 0) + subject.scope()); 
            }
        }
        for (String key : linkedMap.keySet()) {
            Integer value = linkedMap.get(key);
            labels.add(new Label(key, value / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> pupilList = new LinkedList<>();
        double scope = 0D;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scope += subject.scope();
            }
            pupilList.add(new Label(pupil.name(), scope));
            scope = 0;
        }
        pupilList.sort(Comparator.naturalOrder());
        return pupilList.get(pupilList.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        List<Label> list = new LinkedList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                linkedMap.put(subject.name(), linkedMap.get(subject.name()) != null ? linkedMap.get(subject.name()) + subject.scope() : subject.scope());
            }  
        }
        for (String key : linkedMap.keySet()) {
            double value = linkedMap.get(key);
            list.add(new Label(key, value));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}
