package org.telran.lecture_10_greedy_algo.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Activity {
    String name;
    int start;
    int finish;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return name + " " + start + " " + finish;
    }
}

public class ActivityGreed {
    public static void main(String[] args) {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity("drawing", 10, 13));
        activities.add(new Activity("writing", 10, 17));
        activities.add(new Activity("eating", 12, 14));
        activities.add(new Activity("coding", 15, 19));
        activities.add(new Activity("reading", 13, 16));
        activities.add(new Activity("dancing", 17, 18));

        print(activities);
        System.out.println("------");

        List<Activity> selectedActivities = selectActivity(activities);
        print(selectedActivities);
    }

    public static List<Activity> selectActivity(List<Activity> allActivities) {
        // TODO: проанализируйте код функции и найдите недостатки реализации
        //  Подсказка: побочные эффекты
        allActivities.sort(Comparator.comparingInt(activity -> activity.finish));
        List<Activity> selectedActivities = new ArrayList<>();
        Activity first = allActivities.get(0);
        int currentEndTime = first.finish;
        selectedActivities.add(first);

        for (int i = 1; i < allActivities.size(); i++) {
            if (allActivities.get(i).start >= currentEndTime) {
                currentEndTime = allActivities.get(i).finish;
                selectedActivities.add(allActivities.get(i));
            }
        }
        return selectedActivities;
    }

    public static void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e);
        }
    }


}
