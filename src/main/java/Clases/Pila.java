package Clases;

import java.util.Stack;

public class Pila {

    Stack<Character> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public boolean esVacia() {
        return pila.isEmpty();
    }

    public void push(Character c) {
        pila.push(c);
    }

    public Character pop() throws Exception {
        if (esVacia()) {
            throw new Exception("Código no balanceado: símbolo de cierre sin apertura.");
        }
        return pila.pop();
    }

    public String balanceado(String codigo) throws Exception {
        Pila p1 = new Pila();

        int countParentesis = 0;
        int countLlaves = 0;
        int countCorchetes = 0;

        for (int i = 0; i < codigo.length(); i++) {
            char c = codigo.charAt(i);

            // --- Aperturas ---
            if (c == '(' || c == '{' || c == '[') {
                p1.push(c);
                if (c == '(') countParentesis++;
                if (c == '{') countLlaves++;
                if (c == '[') countCorchetes++;
            }

            // --- Cierres ---
            else if (c == ')' || c == '}' || c == ']') {
                if (p1.esVacia()) {
                    throw new Exception("Símbolo de cierre sin apertura: " + c);
                }

                char top = p1.pop();
                if (!esPar(top, c)) {
                    throw new Exception("Desbalance entre " + top + " y " + c);
                }
            }
        }

        if (!p1.esVacia()) {
            throw new Exception("Faltan símbolos de cierre.");
        }

        // Si todo fue correcto
        return "Código balanceado\n"
                + "Paréntesis abiertos: " + countParentesis + "\n"
                + "Llaves abiertas: " + countLlaves + "\n"
                + "Corchetes abiertos: " + countCorchetes;
    }

    private boolean esPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
                || (apertura == '{' && cierre == '}')
                || (apertura == '[' && cierre == ']');
    }
}
