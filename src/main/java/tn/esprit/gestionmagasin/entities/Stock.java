package tn.esprit.gestionmagasin.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "Stock")
public class Stock {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idStock  ;
        private int qteStock  ;
        private int qteMin ;
        private String libelleStock  ;

        @JsonIgnore
        @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
        private List<Produit> produits;


}
