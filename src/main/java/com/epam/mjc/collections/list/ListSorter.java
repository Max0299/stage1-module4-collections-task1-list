package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> comparator = new ListComparator();

        sourceList.sort(comparator);

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        return Integer.compare(5 * x * x - 3, 5 * y * y - 3);

    }
}
