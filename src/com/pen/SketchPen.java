package com.pen;

public class SketchPen extends Pen {

    public SketchPen(IRefillStrategy refillStrategy) {
        this.refillStrategy = refillStrategy;
    }

    @Override
    public void write() {
        System.out.println("Write like a SketchPen");
    }

    @Override
    boolean isWorking() {
        return true;
    }

    @Override
    void refill() {
        this.refillStrategy.refill();
    }
}
