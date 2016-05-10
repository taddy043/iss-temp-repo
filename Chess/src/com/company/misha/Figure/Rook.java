package com.company.misha.Figure;

import com.company.Move;
import com.company.Constants;
import com.company.FigureType;


public class Rook extends Figure implements Move {
    public Rook(int x, int y, FigureType type) {
        super(x, y, type);
    }

    @Override
    public void move(int x, int y) throws Exception {
        if (Math.abs(this.x-x) == 0 || Math.abs(this.y-y)==0) {
            this.x = x;
            this.y = y;
        } else {
            throw new Exception(Constants.ILLEGAL_MOVE_MSG);
        }
    }
}