package Entities;

public class ContaCorrente {
    private String agencia;
    private String numeroConta;
    private String tipo;
    private float saldo;
    private float limite;

    public ContaCorrente(String agencia, String numeroConta, String tipo, float saldo, float limite){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.saldo = saldo;
        if (this.tipo.equals("N")){
            this.limite = 0;
        }else {
            this.limite = limite;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void depositar(float valorFornecido){
        this.saldo += valorFornecido;
    }

    public boolean sacar(float valorFornecido){
        boolean saqueEfetuado;
        if (valorFornecido <= saldo){
            saqueEfetuado = true;
        }else {
            saqueEfetuado = false;
        }
        return saqueEfetuado;
    }
}
