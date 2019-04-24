package Modelo;

import java.io.Serializable;

public class IdNota implements Serializable {
    private int id;
    private String nota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    

}
