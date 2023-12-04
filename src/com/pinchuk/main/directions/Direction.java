package com.pinchuk.main.directions;

public enum Direction {
    LEFT("left"), RIGHT("right"), UP("up"), DOWN("down");

    private String side;
    Direction(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }
}
