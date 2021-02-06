package com.github.PeterHausenAoi.NeuralBomberPoC.neural;

import com.github.PeterHausenAoi.NeuralBomberPoC.game.Game;

public class NeuralNetwork {
    private Layer<Game, Double> inputLayer;
    private Layer<Double, PlayerMove> outputLayer;
}
