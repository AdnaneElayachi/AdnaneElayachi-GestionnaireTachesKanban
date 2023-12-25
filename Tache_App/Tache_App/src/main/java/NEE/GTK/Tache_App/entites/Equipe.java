package NEE.GTK.Tache_App.entites;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;

    private String specialite;

    @OneToMany(mappedBy = "equipe")
    private List<Utilisateur> membres;
}
