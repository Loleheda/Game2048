package com.pinchuk.java.main.direction;

public enum Direction {
    LEFT("left"), RIGTH("rigth"), UP("up"), DOWN("down");

    private String side;
    Direction(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }
}
