package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Programmeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/tpfilrouge")
public class ProgrammeurControleur {
    @Autowired
    ProgrammeurService programmeurService;
    
    @GetMapping("/hello")
    public List<Programmeur>afficherProgrammeurs(){
        return programmeurService.getProgrammeurs();

    }
}
