package com.javafee.lesson.exceptions;

public class C {
    private B b = new B();

    public void c() throws BusinessException {
        b.b();
    }

    public void cc(int a) {
        b.bb(a);
    }
}
