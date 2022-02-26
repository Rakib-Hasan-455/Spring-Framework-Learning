package org._3_ReferenceTypePropInject;

// A depends on B class
public class A {
    private int x;
    private B object;

    public A(int x, B object) {
        this.x = x;
        this.object = object;
    }

    public int getX() {
        return x;
    }

    public A() {
    }



    public void setX(int x) {
        this.x = x;
    }

    public B getObject() {
        return object;
    }

    public void setObject(B object) {
        this.object = object;
    }
}
