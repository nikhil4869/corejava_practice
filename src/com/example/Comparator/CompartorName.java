package com.example.Comparator;

import java.util.Comparator;

public class CompartorName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getName().compareTo(o1.getName());

    }
}
