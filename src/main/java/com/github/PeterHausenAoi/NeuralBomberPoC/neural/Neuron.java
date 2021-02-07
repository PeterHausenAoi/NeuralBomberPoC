package com.github.PeterHausenAoi.NeuralBomberPoC.neural;

import java.util.ArrayList;
import java.util.List;

public abstract class Neuron <T, V> {
    protected double bias;
    protected List<NeuronConnection<V>> outConnections;

    public Neuron(double bias) {
        this.bias = bias;
        outConnections = new ArrayList<>();
    }

    protected abstract V process(T payload);

    public void fire(T payload){
        V processed = process(payload);

        for (NeuronConnection<V> conn : outConnections){
            conn.handleInput(processed);
        }
    }

    public void addConnection(NeuronConnection<V> conn){
        outConnections.add(conn);
    }
}
