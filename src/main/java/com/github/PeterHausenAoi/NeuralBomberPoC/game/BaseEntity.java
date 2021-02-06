package com.github.PeterHausenAoi.NeuralBomberPoC.game;

import java.util.List;

abstract public class BaseEntity implements Entity{
    private GridCell container;

    public void setContainer(GridCell cell){
        container = cell;
    }

    public void clearContainer(){
        container = null;
    }
}
