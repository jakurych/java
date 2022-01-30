package com.javafee.lesson.exceptions;

public class B {
    private A a = new A();

    public void b() throws BusinessException {
        a.a();
    }

    public void bb(int a) {
        this.a.aa(a);
    }
}
