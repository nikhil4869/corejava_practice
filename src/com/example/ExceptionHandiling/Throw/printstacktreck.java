package com.example.ExceptionHandiling.Throw;

public class printstacktreck extends Throwable {
    public printstacktreck(String invalid_marks) {
        super(invalid_marks);
    }
}
