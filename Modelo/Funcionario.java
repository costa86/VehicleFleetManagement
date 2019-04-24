package Modelo;

import java.io.Serializable;
import java.util.Objects;

public class Funcionario implements Serializable {
    private int id;
    private String nome, habilitacao, fone, email, notas;
    private String vencimento, categoria, status; 

    public Funcionario(int id, String nome, String habilitacao, String fone, String email, String notas, String vencimento, String categoria, String status) {
        this.id = id;
        this.nome = nome;
        this.habilitacao = habilitacao;
        this.fone = fone;
        this.email = email;
        this.notas = notas;
        this.vencimento = vencimento;
        this.categoria = categoria;
        this.status = status;
    }


    @Override
    public int hashCode() {
        int hash = 3;
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.habilitacao, other.habilitacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", habilitacao=" + habilitacao + ", fone=" + fone + ", email=" + email + ", notas=" + notas + ", vencimento=" + vencimento + ", categoria=" + categoria + ", status=" + status + '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
