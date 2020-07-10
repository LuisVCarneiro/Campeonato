
package classes;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @Column (name = "sexo")
    private String sexo;
    @Column (name = "categoria")
    private String categoria;
    @Column (name = "cinturon")
    private String cinturon;
    
    @ManyToOne
    @JoinColumn (name = "idEquipo")
    private Equipo equipo;
    
    @OneToMany (mappedBy = "competidor", cascade = CascadeType.ALL)
    private Set <Video> videos;

    public Competidor() {
    }

    public Competidor(int licencia, String nome, String apelidos, int ano, String sexo, String categoria, String cinturon, Equipo equipo) {
        this.licencia = licencia;
        this.nome = nome;
        this.apelidos = apelidos;
        this.ano = ano;
        this.sexo = sexo;
        this.categoria = categoria;
        this.cinturon = cinturon;
        this.equipo = equipo;
        this.videos = new HashSet<>();
    }     

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCinturon() {
        return cinturon;
    }

    public void setCinturon(String cinturon) {
        this.cinturon = cinturon;
    }

    @Override
    public String toString() {
        return "Competidor{" + "licencia=" + licencia + ", nome=" + nome + ", apelidos=" + 
                apelidos + ", ano=" + ano + ", sexo=" + sexo + ", categoria=" + categoria + 
                ", cinturon=" + cinturon + ", equipo=" + equipo + '}';
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
    
    public void addVideo(Video video){
        this.videos.add(video);
    }
}


