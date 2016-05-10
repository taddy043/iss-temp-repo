package com.company.misha.Figure;

import com.company.Constants;
import com.company.FigureType;
import com.company.Move;

public class King extends Figure implements Move{
    public King(int x, int y, FigureType type) {
        super(x, y, type);
    }

    @Override
    public void move(int x, int y) throws Exception {
        if (Math.abs(this.x - x) > 1 || Math.abs(this.y - y) > 1) {
            throw new Exception(Constants.ILLEGAL_MOVE_MSG);
        } else {
            this.x = x;
            this.y = y;
        }
    }
}