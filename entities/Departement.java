package tn.agena3000.cloud.kaddemproject.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table( name = "departement")
@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;
    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants = new ArrayList<>();

}