package isis.projet.backend.dao;

import isis.projet.backend.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Integer> {
    // integer type de clé
    //celui ci gere par defaut les operations crud
}