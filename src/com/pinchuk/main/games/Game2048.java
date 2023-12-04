package com.pinchuk.main.games;

import com.pinchuk.main.boards.Board;
import com.pinchuk.main.directions.Direction;
import com.pinchuk.main.games.Game;
import com.pinchuk.main.games.GameHelper;
import com.pinchuk.main.keys.Key;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

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
        board.fillBoard(asList(1,2,3,null));
    }

    @Override
    public boolean canMove() {
        return !board.availableSpace().isEmpty();
    }

    @Override
    public boolean move(Direction direction) {
        switch (direction) {
            case UP -> {
                for (int j=0; j < board.getWidth(); j++) {
                    gameHelper.moveAndMergeEqual(board.getValues(board.getColumn(j)));
                }
            }
            case DOWN -> {
                for (int j=board.getWidth()-1; j >= 0 ; j--) {
                    gameHelper.moveAndMergeEqual(board.getValues(board.getColumn(j)));
                }
            }
            case LEFT -> {
                for (int i=0; i < board.getHeight(); i++) {
                    gameHelper.moveAndMergeEqual(board.getValues(board.getRow(i)));
                }
            }
            case RIGHT -> {
                for (int i=board.getHeight(); i >= 0 ; i--) {
                    gameHelper.moveAndMergeEqual(board.getValues(board.getRow(i)));
                }
            }
        }
        return false;
    }

    @Override
    public void addItem() {
        List<Key> emptyKeysList = board.availableSpace();
        if(!emptyKeysList.isEmpty()) {
            int index = random.nextInt(emptyKeysList.size()) + 1;
            if(index < emptyKeysList.size()) {
                board.addItem(emptyKeysList.get(index), 2);
            }
        }
    }

    @Override
    public Board getGameBoard() {
        return board;
    }

    @Override
    public boolean hasWin() {
        return board.hasValue(2048);
    }
}
