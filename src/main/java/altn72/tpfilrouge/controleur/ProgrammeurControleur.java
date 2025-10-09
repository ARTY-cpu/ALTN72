package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Programmeur;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/tpfilrouge")
public class ProgrammeurControleur {


    //@Autowired
    private final ProgrammeurService programmeurService;

    // cela remplace autowired le constructeur
    public ProgrammeurControleur(ProgrammeurService programmeurService) {
        this.programmeurService = programmeurService;
    }

    @GetMapping("/hello")
    public List<Programmeur>afficherProgrammeurs(){
        return programmeurService.getProgrammeurs();

    }

    @GetMapping("/unProgrammeur/{idProgrammeur}")
    public Optional<Programmeur> afficherUnProgrammeur(@PathVariable("idProgrammeur") Integer idProg) {
        return programmeurService.getUnProgrammeur(idProg);
    }

    @DeleteMapping("/supprimerProgrammeur/{idProgrammeur}")
//    @GetMapping("/supprimerProgrammeur/{idProgrammeur}")    @GetMapping fonctionne aussi :-)
    public void deleteProgrammeur(@PathVariable("idProgrammeur") Integer idProg) {
        programmeurService.supprimerProgrammeur(idProg);
    }

    @PostMapping("/ajouterProgrammeur")
    public void creerProgrammeur(@RequestBody Programmeur programmeur){
        programmeurService.ajouterProgrammeur(programmeur);
    }

    @PutMapping("modifier/{idProgrammeur}")
    public void modifierProgrammeur(@PathVariable Integer idProgrammeur,@RequestBody Programmeur programmeurModified ){
        programmeurService.modifierProgrammeur(idProgrammeur,programmeurModified);
    }
}
