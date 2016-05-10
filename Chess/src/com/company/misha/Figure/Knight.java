package com.company.misha.Figure;

import com.company.Constants;
import com.company.FigureType;
import com.company.Move;

public class Knight extends Figure implements Move {
    public Knight(int x, int y, FigureType figureType) {
        super(x, y, figureType);
    }

    @Override
    public void move(int x, int y) throws Exception {
        if (Math.abs(this.x-x)==2 && Math.abs(this.y-y)==1 || Math.abs(this.x-x)==1 && Math.abs(this.y-y) == 2) {
            this.x = x;
            this.y = y;
        } else {
            throw new Exception(Constants.ILLEGAL_MOVE_MSG);
        }
    }
}