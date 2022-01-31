package com.javafee.lesson.exceptions;

public class A {
    public void a() throws BusinessException {
        throw new BusinessException("method a failed"); // wyrzucenie wyjatku typu BusinessException nalezacego do
        // grupy checked exception
    }

    public void aa(int a) {
        int res = 1 / a;
    }
}
