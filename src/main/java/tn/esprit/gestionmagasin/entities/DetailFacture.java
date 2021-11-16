package tn.esprit.gestionmagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "detailfacture")
public class DetailFacture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetailFacture ;
    private int qte ;
    private float prixTotal ;
    private int porcentageRemise ;
    private int montantRemise ;

/*    @OneToMany(mappedBy = "detailfact", cascade = CascadeType.ALL)
    private List<Produit> produits;*/

    @ManyToOne
    @JoinColumn(name="facture_id")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name="produit_id")
    private Produit produit;
}
