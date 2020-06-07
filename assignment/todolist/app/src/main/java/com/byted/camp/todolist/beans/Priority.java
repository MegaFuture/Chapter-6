package com.byted.camp.todolist.beans;

import android.graphics.Color;

public enum Priority {
    LEVEL0(0),
    LEVEL1(1),
    LEVEL2(2),
    LEVEL3(3),
    LEVEL4(4),
    LEVEL5(5),
    LEVEL6(6);

    private final int level;

    Priority(int pLevel){
        this.level = pLevel;
    }

    public int getLevel(){
        return level;
    }

    public static Priority from(int level){
        for (Priority priority : Priority.values())
            if (priority.getLevel() == level)
                return priority;
        return LEVEL0;
    }

    public static int getBGColor(Priority priority){
        switch (priority){
            case LEVEL0:
                return Color.WHITE;
            case LEVEL1:
                return Color.YELLOW;
            case LEVEL2:
                return Color.GREEN;
            case LEVEL3:
                return Color.BLUE;
            case LEVEL4:
                return Color.RED;
            case LEVEL5:
                return Color.MAGENTA;
            case LEVEL6:
                return Color.CYAN;
            default:
                return Color.LTGRAY;
        }
    }
}
