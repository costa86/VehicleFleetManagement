package Modelo;

import java.io.Serializable;

public class Viagem implements Serializable {
    private int id;
    private Carro carro;
    private Funcionario funcionario;
    private String dataS, dataR, horaS, horaR;
    private String odometroS, odometroR, notas;
    private double receita, despesa;

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
        final Viagem other = (Viagem) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Viagem{" + "id=" + id + ", carro=" + carro + ", funcionario=" + funcionario + ", dataS=" + dataS + ", dataR=" + dataR + ", horaS=" + horaS + ", horaR=" + horaR + ", odometroS=" + odometroS + ", odometroR=" + odometroR + ", notas=" + notas + ", receita=" + receita + ", despesa=" + despesa + '}';
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataS() {
        return dataS;
    }

    public void setDataS(String dataS) {
        this.dataS = dataS;
    }

    public String getDataR() {
        return dataR;
    }

    public void setDataR(String dataR) {
        this.dataR = dataR;
    }

    public String getHoraS() {
        return horaS;
    }

    public void setHoraS(String horaS) {
        this.horaS = horaS;
    }

    public String getHoraR() {
        return horaR;
    }

    public void setHoraR(String horaR) {
        this.horaR = horaR;
    }

    public String getOdometroS() {
        return odometroS;
    }

    public void setOdometroS(String odometroS) {
        this.odometroS = odometroS;
    }

    public String getOdometroR() {
        return odometroR;
    }

    public void setOdometroR(String odometroR) {
        this.odometroR = odometroR;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    
}
