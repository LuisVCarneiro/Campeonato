
package classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Videos")

public class Video implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (name = "licencia")
    private int licencia;
    @Column (name = "enlace")
    private String enlace;
    
    @ManyToOne
    @JoinColumn ( name = "idVideo")
    private Competidor competidor;
    
    
    public Video(){
    }
    
    public Video (int licencia, String enlace, Competidor competidor){
        this.licencia = licencia;
        this.enlace = enlace;
        this.competidor = competidor;
    }

    @Override
    public String toString() {
        return "Video{" + "id=" + id + ", licencia=" + licencia + ", enlace=" + enlace + '}';
    }
 

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
    
}
