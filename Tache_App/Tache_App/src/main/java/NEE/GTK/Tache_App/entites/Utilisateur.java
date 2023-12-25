package NEE.GTK.Tache_App.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtilisateur;

    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private String poste;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    @OneToMany(mappedBy = "utilisateur")
    private List<Tache> taches;

    @ManyToMany(mappedBy = "utilisateurs")
    private List<Projet> projets;
}
