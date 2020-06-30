
package classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Competidores")

public class Competidor implements Serializable{
    
    @Id
    private int licencia;
    @Column (name = "nome")
    private String nome;
    @Column (name = "apelidos")
    private String apelidos;
    @Column (name = "anoNacemento")
    private int ano;
    
    @ManyToOne
    @JoinColumn (name = "idEquipo")
    private Equipo equipo;

    public Competidor() {
    }

    public Competidor(int licencia, String nome, String apelidos, int ano, Equipo equipo) {
        this.licencia = licencia;
        this.nome = nome;
        this.apelidos = apelidos;
        this.ano = ano;
        this.equipo = equipo;
    }     

    @Override
    public String toString() {
        return "Competidor{" + "licencia=" + licencia + ", nome=" + nome + ", apelidos=" + apelidos + ", ano=" + ano + ", equipo=" + equipo + '}';
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    
   
}


