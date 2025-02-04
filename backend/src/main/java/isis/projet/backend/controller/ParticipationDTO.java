package isis.projet.backend.controller;

import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link isis.projet.backend.entity.Participation}
 */
@Data
public class ParticipationDTO implements Serializable {
    //les elements d'une participation qu'on doit renvoyer
    Integer id;
    String role;
    Float pourcentage;
    String projetNom;
    String personneNom;
    String personnePrenom;
}