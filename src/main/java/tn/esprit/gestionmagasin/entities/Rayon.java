package tn.esprit.gestionmagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "Rayon")
public class Rayon {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idRayon  ;
        private String codeRayon  ;
        private String libelleRayon  ;

        @JsonIgnore
        @OneToMany(mappedBy = "rayon", cascade = CascadeType.ALL)
        private List<Produit> produits;


}
