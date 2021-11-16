package tn.esprit.gestionmagasin.entities;

import javax.persistence.*;
import java.util.Set;

import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "Fournisseur")
public class Fournisseur {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idFournisseur  ;
        private String codeFournisseur  ;
        private  String libelleFournisseur  ;

        @ManyToMany(mappedBy="ProduitFrnsr", cascade = CascadeType.ALL)
        private Set<Produit> produits;


}
