package com.pinchuk.main.games;

import com.pinchuk.main.boards.Board;
import com.pinchuk.main.directions.Direction;
import com.pinchuk.main.games.Game;
import com.pinchuk.main.games.GameHelper;

import java.util.Random;

public class Game2048 implements Game {

    private GameHelper gameHelper;
    private Board board;
    private Random random;

    public Game2048(Board board) {
        this.gameHelper = new GameHelper();
        this.board = board;
        this.random = new Random();
    }

    @Override
    public void init() {

    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean move(Direction direction) {
        return false;
    }

    @Override
    public void addItem() {

    }

    @Override
    public Board getGameBoard() {
        return null;
    }

    @Override
    public boolean hasWin() {
        return false;
    }
}
