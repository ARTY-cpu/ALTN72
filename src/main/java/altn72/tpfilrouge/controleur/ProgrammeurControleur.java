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
    public Optional<Programmeur> afficherUnProgrammeur(@PathVariable Integer idProgrammeur){
        return programmeurService.getunProgrammeur(idProgrammeur);
    }

    @DeleteMapping("/suppression/{idProgrammeur}")
    public String suppression(@PathVariable Integer idProgrammeur){
        return programmeurService.deleteProgrammeur(idProgrammeur);
    }

    @PostMapping("/ajout/")
    public Programmeur ajouter(@RequestBody Programmeur programmeur){
        return  programmeurService.saveProgrammeur(programmeur);
    }

    @PutMapping("/modification/{idProgrammeur}")
    public Programmeur modifier(@PathVariable Integer idProgrammeur, @RequestBody Programmeur programmeur){
        return programmeurService.updateProgrammeur(idProgrammeur, programmeur);
    }
}
