package org.launchcode.javawebdevtechjobsmvc;


import java.util.Comparator;

public class NameSorter implements Comparator<Object> {

    @Override
    public int compare(Object o11, Object o22) {
        return o11.toString().toLowerCase().compareTo(o22.toString().toLowerCase());
    }

}
