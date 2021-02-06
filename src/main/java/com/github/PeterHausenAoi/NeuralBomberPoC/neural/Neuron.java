package com.github.PeterHausenAoi.NeuralBomberPoC.neural;

import java.util.List;

public abstract class Neuron <T, V>{
    private List<NeuronConnection<V>> outConnections;

    protected abstract V process(T payload);

    public void fire(T payload){
        V processed = process(payload);

        for (NeuronConnection<V> conn : outConnections){
            conn.handleInput(processed);
        }
    }
}
