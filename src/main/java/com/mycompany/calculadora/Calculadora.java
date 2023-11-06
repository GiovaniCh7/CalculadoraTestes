
package com.mycompany.calculadora;
public class Calculadora {
    /**
     * realiza a operação de soma
     * 
     * @param a o primeiro operando da soma 
     * @param b o segundo operando da soma
     * @return a soma de a e b
     */
     public float soma(int a, int b){
        return a + b;
     }
     /**
      * Realiza a operação de subtração.
      * 
      * @param a o primeiro operando numero que será subtraido;
      * @param b o segundo operando numero que o valor será subtraido de a
      * @return resultado de a subtraindo o valor de b
      */
        public float subitracao(int a, int b){
        return a - b;
    }
        /**
         * Realiza a operação de divisão
         * 
         * @param a o primeiro operando numero que será dividido 
         * @param b o segundo operando numero que o valor dividirá a
         * @return resultado de a dividido pelo valor de b
         */
        public float divisao(int a, int b){
        return a / b;
    }     
        /**
         * realiza a operção de multiplicação
         * 
         * @param a o primeiro operando numero que será multiplicado
         * @param b o segundo operando numero que o valor multiplicará a
         * @return resultado de a multiplicado pelo valor de b
         */
        public float Multiplicacao(int a, int b){
        return a * b;
    }
}

