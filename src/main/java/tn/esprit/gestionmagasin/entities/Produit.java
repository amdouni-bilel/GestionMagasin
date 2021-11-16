package tn.esprit.gestionmagasin.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "Produit")
public class Produit {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idProduit  ;
    private String codeProduit ;
    private String libelleProduit  ;
    private float prixUnitaire  ;

    @ManyToOne
    @JoinColumn(name="stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name="rayon_id")
    private Rayon rayon;

    @OneToOne(mappedBy="produit")
    private DetailProduit detailProduit;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> ProduitFrnsr;


    @JsonIgnore
    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private List<DetailFacture> detailFactures;

/* @ManyToOne
    @JoinColumn(name="detailFacture_id")
    private DetailFacture detailFacture;*/


    /*    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private List<DetailFacture> detailFactures;*/
}
