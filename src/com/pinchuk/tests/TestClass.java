package com.pinchuk.tests;

import com.pinchuk.main.games.Game2048;
import com.pinchuk.main.boards.*;
import com.pinchuk.main.games.Game;

public class TestClass {
    public static void main(String[] args) {
        Board board = new SquareBoard(4);
        Game game2048 = new Game2048(board);
        System.out.println(game2048.canMove());
    }
}
