package com.github.PeterHausenAoi.NeuralBomberPoC.game;

import java.util.ArrayList;
import java.util.List;

public class GridCell {
    private int x;
    private int y;

    private List<Entity> entities;

    public GridCell() {
        this.entities = new ArrayList<>();
    }

    public void removeEntity(Entity entity){
        entities.remove(entity);
    }

    public void addEntity(Entity entity){
        if (!entities.contains(entity)){
            entities.add(entity);
            entity.setContainer(this);
        }
    }


}
