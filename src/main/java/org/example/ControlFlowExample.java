package org.example;

// Prueba de flujo de control
public class ControlFlowExample {
    public String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
