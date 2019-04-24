package Modelo;

import java.io.Serializable;

public class Abastecimento implements Serializable{
    private int id;
    private String data;
    private Fornecedor fornecedor;
    private Carro carro;
    private double valor, litros;
    private Funcionario funcionario;
    private String notas, odometro;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abastecimento other = (Abastecimento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Abastecimento{" + "id=" + id + ", data=" + data + ", fornecedor=" + fornecedor + ", carro=" + carro + ", valor=" + valor + ", litros=" + litros + ", funcionario=" + funcionario + ", notas=" + notas + ", odometro=" + odometro + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getOdometro() {
        return odometro;
    }

    public void setOdometro(String odometro) {
        this.odometro = odometro;
    }

}
