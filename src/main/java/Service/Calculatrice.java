package Service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "Service.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    public int somme(int a, int b) {
        return a + b;
    }

    public double multiplication(int a, int b) {
        return a * b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zero");
        }
        return (double) a / b;
    }

    @Override
    public double somme(double a, double b) {
        return a+b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double soustraction(double a, double b) {
        return a-b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }
}