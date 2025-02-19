package com.example.Comparator;

import java.util.Comparator;

public class ComprartorId implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getId()== o2.getId()){
            return  0;
        } else if (o1.getId()< o2.getId()) { // For ascending order use ">"
            return  1;
        }else {
            return -1;
        }

    }

}
