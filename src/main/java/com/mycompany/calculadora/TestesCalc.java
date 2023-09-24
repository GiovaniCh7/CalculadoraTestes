package com.mycompany.calculadora;

public class TestesCalc {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //Testes de Soma
        //Cenário de teste 1: Soma de dois valores
        float soma = calculadora.soma(3, 7);
        System.out.println("Soma:" + soma);

        //Cenário de teste 2: Soma de dois valores sendo um zero
        soma = calculadora.soma(3, 0);
        System.out.println(soma);

        //Cenário de teste 3: Soma de dois valores sendo que ambos são zero
        soma = calculadora.soma(0, 0);
        System.out.println(soma);

        //Cenário de teste 4: Soma de dois valores sendo um negativo
        soma = calculadora.soma(-3, 7);
        System.out.println(soma);

        //Cenário de teste 5: Soma de dois valores negativos
        soma = calculadora.soma(-3, -7);
        System.out.println(soma);

        //Cenário de teste 6: Soma de dois valores sendo um negativo e um zero
        soma = calculadora.soma(-3, 0);
        System.out.println(soma);
        
        //Cenário de teste 7: Soma de dois valores sendo um zero negativo 
        soma = calculadora.soma(3,0);
        System.out.println(soma);
        
        //Cenário de teste 8: Soma de dois valores sendo um zero e o outro negativo 
        soma = calculadora.soma(0,-7);
        System.out.println(soma);
        
        //Cenário de teste 9: Soma de dois valores sendo um zero e o outro positivo
        soma = calculadora.soma(0,3);
        System.out.println(soma);
        
        //Testes de Subtração
        //Cenário de teste 1: Subtração de dois valores
        float sub = calculadora.subitracao(3, 7);
        System.out.println("Subtracao: " + sub);

        //Cenário de teste 2: Subtração de dois valores sendo um zero
        sub = calculadora.subitracao(3, 0);
        System.out.println(sub);

        //Cenário de teste 3: Subtração de dois valores sendo que ambos são zero
        sub = calculadora.subitracao(0, 0);
        System.out.println(sub);

        //Cenário de teste 4: Subtração de dois valores sendo um negativo
        sub = calculadora.subitracao(3, -7);
        System.out.println(sub);
        
         //Cenário de teste 5: Subtração de dois valores negativos
        soma = calculadora.subitracao(-3, -7);
        System.out.println(soma);

        //Cenário de teste 6: Subtração de dois valores sendo um negativo e um zero
        sub = calculadora.subitracao(-3, 0);
        System.out.println(sub);
        
        //Cenário de teste 7: Subtração de dois valores sendo um zero e um positivo
        sub = calculadora.subitracao(0, 3);
        System.out.println(sub);
        
        //Cenário de teste 8: Subtração de dois valores sendo um zero e outro negativo
        sub = calculadora.subitracao(0, -7);
        System.out.println(sub);
        
        //Cenário de teste 9: Subtração de dois valores sendo um negativo e um positivo
        sub = calculadora.subitracao(-3, 7);
        System.out.println(sub);

        //Testes de Multiplicação
        //Cenário de teste 1: Multiplicação de dois valores
        float multi = calculadora.Multiplicacao(3, 7);
        System.out.println("Multiplicacao: " + multi);

        //Cenário de teste 2: Multiplicação de dois valores sendo um zero
        multi = calculadora.Multiplicacao(3, 0);
        System.out.println(multi);

        //Cenário de teste 3: Multiplicação de dois valores sendo que ambos são zero
        multi = calculadora.Multiplicacao(0, 0);
        System.out.println(multi);

        //Cenário de teste 4: Multiplicação de dois valores sendo um negativo
        multi = calculadora.Multiplicacao(3, -7);
        System.out.println(multi);
        
        //Cenário de teste 5: Multiplicação de dois valores negativos
        multi = calculadora.Multiplicacao(-3, -7);
        System.out.println(multi);

        //Cenário de teste 6: Multiplicação de dois valores sendo um negativo e um zero
        multi = calculadora.Multiplicacao(-3, 0);
        System.out.println(multi);
        
        //Cenário de teste 7: Multiplicação de dois valores sendo um positivo e outro negativo
        multi = calculadora.Multiplicacao(-3, 7);
        System.out.println(multi);
        
        //Cenário de teste 8: Multiplicação de dois valores sendo um zero e outro positvo 
        multi = calculadora.Multiplicacao(0, 7);
        System.out.println(multi);

        //Cenário de teste 9: Multiplicação de dois valores sendo um zero e um negativo
        multi = calculadora.Multiplicacao(0, -7);
        System.out.println(multi);
        
        //Testes de Divisão 
        //Cenário de teste 1: Divisão de dois valores
        float divi = calculadora.divisao(300, 7);
        System.out.println("Divisao: " + divi);

        //Cenário de teste 2: Divisão de dois valores sendo um zero
        divi = calculadora.divisao(0, 7);
        System.out.println("Divisao: " + divi);

        //Cenário de teste 3: Divisão de dois valores sendo um negativo
        divi = calculadora.divisao(300, -7);
        System.out.println(divi);
        
        //Cenário de teste 4: Divisão de dois valores sendo um zero negativo 
        divi = calculadora.divisao(0,-3);
        System.out.println(divi);
        
        //Cenário de teste 5: Divisão de dois valores sendo um zero negativo e um zero
        divi = calculadora.divisao(-3, 3);
        System.out.println(divi);
        
        //Cenário de teste 6: Divisão de dois valores sendo dois zeros negativos
        divi = calculadora.divisao(-7, -7);
        System.out.println(divi);
    }

}
