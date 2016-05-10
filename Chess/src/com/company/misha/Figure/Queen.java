package com.company.misha.Figure;



        import com.company.Constants;
        import com.company.Move;
        import com.company.FigureType;

public class Queen extends Figure implements Move{
    public Queen(int x, int y, FigureType type) {
        super(x, y, type);
    };

    @Override
    public void move(int x, int y) throws Exception {
        if (Math.abs(this.x - x) == Math.abs(this.y - y)) {
            this.y = y;
            this.x = x;
        } else if (Math.abs(this.x-x)==0 || Math.abs(this.y-y)==0) {
            this.y = y;
            this.x = x;
        } else {
            throw new Exception(Constants.ILLEGAL_MOVE_MSG);
        }
    }
}