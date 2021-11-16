package tn.esprit.gestionmagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  idClient  ;
    private String nom  ;
    private String prenom ;
    private String email ;
    private Date dateNaissance  ;
    private String password ;
    private Profession profession ;
    private CategorieClient categorieClient ;


    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Facture> factures;






}
