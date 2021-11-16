package tn.esprit.gestionmagasin.entities;


import javax.persistence.*;
import java.util.Date;

import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "DetailProduit")
public class DetailProduit {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idDetailProduit  ;
    private Date dateCreation  ;
    private Date dateDerniereModification  ;

	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;

    @OneToOne
    private Produit produit;




}
