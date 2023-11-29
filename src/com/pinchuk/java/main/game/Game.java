package com.pinchuk.java.main.game;

import com.pinchuk.java.main.board.Board;

public interface Game {
    public void init();
    public boolean canMove();
    public boolean move(Direction direction);
    public void addItem();
    public Board getGameBoard();
    public boolean hasWin();
}
