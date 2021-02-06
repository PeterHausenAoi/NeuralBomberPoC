package com.github.PeterHausenAoi.NeuralBomberPoC.neural;

public class NeuronConnection<T> {
    private Neuron<?, T> srcNeuron;
    private Neuron<T, ?> targetNeuron;

    private double weight;

    public void handleInput(T payload){
        targetNeuron.fire(payload);
    }

    public Neuron<?, T> getSrcNeuron() {
        return srcNeuron;
    }

    public Neuron<T, ?> getTargetNeuron() {
        return targetNeuron;
    }

    public double getWeight() {
        return weight;
    }
}
