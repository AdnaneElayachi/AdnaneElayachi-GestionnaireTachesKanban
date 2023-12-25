package NEE.GTK.Tache_App.repository;

import NEE.GTK.Tache_App.entites.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Long> {
}
