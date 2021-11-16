package tn.esprit.gestionmagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import lombok.*;
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table( name = "Facture")
public class Facture {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idFacture  ;
        private float monatantRemise  ;
        private float monatantFacture  ;
        private Date dateFacture  ;
        private boolean active  ;


        @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
        private List<DetailFacture> detailFactures;



        @ManyToOne
        @JoinColumn(name="client_id")
        private Client client;



}

