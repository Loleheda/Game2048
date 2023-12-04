package com.pinchuk.tests;

import com.pinchuk.main.games.Game2048;
import com.pinchuk.main.boards.*;
import com.pinchuk.main.games.Game;
import com.pinchuk.main.games.GameHelper;

import static java.util.Arrays.asList;

public class TestClass {
    public static void main(String[] args) {
        Board board = new SquareBoard(4);
        Game game2048 = new Game2048(board);
        GameHelper gameHelper = new GameHelper();
        board.fillBoard(asList(1, null, 3,5,null,8));
        System.out.println(gameHelper.moveAndMergeEqual(asList(1,null,3, null, 3,null,2,3,4,1,null)));

    }
}
