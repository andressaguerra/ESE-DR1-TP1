package com.example.TP1.controller;

import com.example.TP1.model.TP1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operacao")
public class TP1Controller {

    // Soma
    @GetMapping("/soma")
    public double soma(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @PostMapping("/soma")
    public double somaPost(@RequestBody TP1 operacao) {
        return operacao.getA() + operacao.getB();
    }

    //Subtração
    @GetMapping("/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @PostMapping("/subtracao")
    public double subtracaoPost(@RequestBody TP1 operacao) {
        return operacao.getA() - operacao.getB();
    }

    //Multiplicação
    @GetMapping("/multiplicacao")
    public double multiplicacao(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @PostMapping("/multiplicacao")
    public double multiplicacaoPost(@RequestBody TP1 operacao) {
        return operacao.getA() * operacao.getB();
    }

    //Divisão
    @GetMapping("/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    @PostMapping("/divisao")
    public double divisaoPost(@RequestBody TP1 operacao) {
        if (operacao.getB() == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return operacao.getA() / operacao.getB();
    }

    //Exponenciação
    @GetMapping("/exponenciacao")
    public double exponenciacao(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a, b);
    }

    @PostMapping("/exponenciacao")
    public double exponenciacaoPost(@RequestBody TP1 operacao) {
        return Math.pow(operacao.getA(), operacao.getB());
    }
}