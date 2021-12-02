package com.christiandevenish;

import java.util.ArrayList;
import java.util.List;

public class MoveLog {
    private final List<Move> moves;

    public MoveLog() {
        this.moves = new ArrayList<>();
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void addMove(Move move) {
        this.moves.add(move);
    }

    public int size() {
        return this.moves.size();
    }

    public void clear() {
        this.moves.clear();
    }

    public Move removeMove(int index) {
        return this.moves.remove(index);
    }

    public boolean removeMove(Move move) {
        return this.moves.remove(move);
    }
}
