package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Programmeur;
import altn72.tpfilrouge.modele.ProgrammeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammeurService {

    @Autowired
    ProgrammeurRepository programmeurRepository;

    public List<Programmeur> getProgrammeurs(){
        return programmeurRepository.findAll();
    }
}
