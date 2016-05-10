package com.company.misha.Figure;


import com.company.FigureType;
import com.company.Move;


public abstract class Figure implements Move {
    protected int x;//текущее положение фигуры. Protected - значит наследники могут обращаться напрямую без геттеров
    protected int y;//текущее положение фигуры
    protected FigureType figureType;//черные или белые
    protected boolean isInitPosition = true;//флаг, начальная ли позиция у фигуры или ей уже походили. Нужен пешкам или для рокировки
    protected boolean isKilled = false;//флаг, ставим в true после того как фигуру съедят

    //Конструктор, который обязаны выполнить все наследники. Без начальной позиции и цвета шахматная фигура не имеет смысла
    public Figure(int x, int y, FigureType figureType) {
        this.x = x;
        this.y = y;
        this.figureType = figureType;
    }

    //Оставлены только геттеры, чтобы нельзя было изменить позицию фигуры в течении игры не через консутруктор или в обход метода move
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public boolean isInitPosition() {
        return isInitPosition;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setIsKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }

    public abstract void move(int x, int y) throws Exception;
}