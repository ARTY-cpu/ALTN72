package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Programmeur;
import altn72.tpfilrouge.modele.ProgrammeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/tpfilrouge")
public class ProgrammeurControleur {
//    Programmeur p1 = new Programmeur(1,"Stroustrup","Bjarne","Laboratoires BELL","C++","The C++ Programming Language",100110.1);
//    Programmeur p2 = new Programmeur(2,"Gosling","James","1 Oak Avenue","Java","The Java Programming Language",101010.1);
    
    @Autowired
    ProgrammeurRepository programmeurRepository;
    
    @GetMapping("/hello")
    public List<Programmeur>afficherProgrammeurs(){
//        List<String> listeMessage = List.of("Hello", "LSI", "I2/2025-26");
//        List<Programmeur> listeProgrammeurs = List.of(p1,p2);
//
//        for (Programmeur programmeur: listeProgrammeurs) {
//            System.out.println(programmeur);
//        }
//
//        return listeProgrammeurs;
        
        return programmeurRepository.findAll();
    }
}
