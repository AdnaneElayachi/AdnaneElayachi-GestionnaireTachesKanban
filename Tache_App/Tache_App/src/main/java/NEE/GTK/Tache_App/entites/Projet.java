package NEE.GTK.Tache_App.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProjet;

    private Date dateDebut;
    private Date dateFin;
    private Double budget;
    private String type;

    @ManyToMany
    @JoinTable(
            name = "projet_utilisateur",
            joinColumns = @JoinColumn(name = "projet_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Utilisateur> membres;

    @OneToMany(mappedBy = "projet")
    private List<Tache> taches;
}
