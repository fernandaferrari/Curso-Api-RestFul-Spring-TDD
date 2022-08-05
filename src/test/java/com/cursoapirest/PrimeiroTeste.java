package com.cursoapirest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeiroTeste {

    @Test
    /* Importante o nome do teste ser relaiconado ao que deve fazer */
    public void deveSomarDoisNumeros(){
        //cenario
        Calculadora calculadora = new Calculadora();
        //execução
        int result = calculadora.somar(10,20);

        //verificacao
        Assertions.assertThat(result).isEqualTo(30);

    }

//    @Test
//    public void naoDeveSomarNumerosNegativos(){
//        //cenario
//        Calculadora calculadora = new Calculadora();
//        //execução
//
//        Assertions.failBecauseExceptionWasNotThrown();
//        int result = calculadora.somar(-10,15);
//    }
}

class Calculadora{
    int somar(int num1, int num2){
        if(num1 <0 || num2 < 0){
            throw new RuntimeException("Não deve somar números negativos");
        }
        return num1+num2;
    }
}
