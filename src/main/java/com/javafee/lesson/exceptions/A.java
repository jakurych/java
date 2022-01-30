package com.javafee.lesson.exceptions;

public class A {
    public void a() throws BusinessException {
        throw new BusinessException("method a failed");
    }

    public void aa(int a) {
        int res = 1 / a;
    }
}
