/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc_project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41344391
 */
public class Ex2Test {
    Ex2 eng;
    
    public Ex2Test() {
        eng = new Ex2();
    }
    
    @Test
    public void testCalculoIMC() 
    {
        double peso = 90.0;
        double altura = 180.0;
        double imc = peso/(altura*altura);
        assertEquals(imc, eng.calculoIMC(peso, altura), 0);
    }  
    
    @Test
    public void testGeraMensagensAbaixoDoPeso() 
    {    
        
        double imc = 18.4;
        String result = String.format("Voc� est� abaixo do peso recomendado. IMC %.2f", imc);
        assertEquals("Message is not equal", result, eng.geraMensagem(imc));
        
        imc = 10.0;
        result = String.format("Voc� est� abaixo do peso recomendado. IMC %.2f", imc);
        assertEquals("Message is not equal", result, eng.geraMensagem(imc));
    }
    
    @Test
    public void testGeraMensagensPesoNormal() 
    {    
        
        double imc = 18.6;
        String result = String.format("Voc� est� muito bem! Continue assim! IMC %.2f", imc);
        assertEquals("Message is not equal", result, eng.geraMensagem(imc));
        
        imc = 24.9;
        result = String.format("Voc� est� muito bem! Continue assim! IMC %.2f", imc);
        assertEquals("Message is not equal", result, eng.geraMensagem(imc));
        
        imc = 21.0;
        result = String.format("Voc� está muito bem! Continue assim! IMC %.2f", imc);
        assertEquals("Message is not equal", result, eng.geraMensagem(imc));
    }
    
    @Test
    public void testGeraMensagensAcimaPeso() 
    {    
        
        double imc = 25;
        String result = String.format("Você está acima do peso recomendado. Cuidado! IMC %.2f", imc);
        assertEquals("Mensagem não é igual.", result, eng.geraMensagem(imc));
        
        imc = 29.9;
        result = String.format("Você está acima do peso recomendado. Cuidado! IMC %.2f", imc);
        assertEquals("Mensagem não é igual.", result, eng.geraMensagem(imc));
        
        imc = 27.5;
        result = String.format("Você está acima do peso recomendado. Cuidado! IMC %.2f", imc);
        assertEquals("Mensagem não é igual.", result, eng.geraMensagem(imc));
    }
    
    @Test
    public void testGeraMensagensObeso() 
    {    
        
        double imc = 30.0;
        String result = String.format("Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas! IMC %.2f", imc);
        assertEquals("Mensagem não é igual.", result, eng.geraMensagem(imc));
        
        imc = 40;
        result = String.format("Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas! IMC %.2f", imc);
        assertEquals("Mensagem não é igual.", result, eng.geraMensagem(imc));
    }
}
