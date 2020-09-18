package Test;

import Entities.ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaCorrenteTest {

    public ContaCorrente contaCorrente = new ContaCorrente("001", "123", "N", 100.00f, 500.00f);

    @Test
    public void testDepositar(){
        contaCorrente.depositar(100);
        assertEquals(200.00f, contaCorrente.getSaldo(), 0.01);
    }

    @Test
    public void testSacar(){
        assertTrue(contaCorrente.sacar(50.00f));
    }

    @Test // Testar se o tipo conta influencia no limite
    public void testContaN(){
        assertEquals(0, contaCorrente.getLimite(), 0.00000001);
    }

}