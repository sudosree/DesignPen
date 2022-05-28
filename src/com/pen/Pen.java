package com.pen;

public abstract class Pen implements IWrite {

    protected IRefillStrategy refillStrategy;

    @Override
    abstract public void write();

    abstract boolean isWorking();

    abstract void refill();
}
