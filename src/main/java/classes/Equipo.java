
package classes;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Equipos")

public class Equipo implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private int id;
    @Column (name = "nome")
    private String nome;
    @Column (name = "localidade")
    private String localidade;
    
    @OneToMany (mappedBy = "equipo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Set <Competidor> competidores;
    

    public Equipo() {
    }

    public Equipo(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
        this.competidores = new HashSet <>();
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nome=" + nome + ", localidade=" + localidade + ", competidores=" /*+ competidores + '}'*/;
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

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    public void addCompetidor(Competidor competidor){
    this.competidores.add(competidor);
    }
                
}
