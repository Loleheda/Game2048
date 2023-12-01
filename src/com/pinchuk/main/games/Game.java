package com.pinchuk.main.games;

import com.pinchuk.main.boards.Board;
import com.pinchuk.main.directions.Direction;

public interface Game {
    public void init();
    public boolean canMove();
    public boolean move(Direction direction);
    public void addItem();
    public Board getGameBoard();
    public boolean hasWin();
}
