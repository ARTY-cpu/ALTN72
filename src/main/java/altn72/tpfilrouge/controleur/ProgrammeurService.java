package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Programmeur;
import altn72.tpfilrouge.modele.ProgrammeurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammeurService {

    //@Autowired
    private final ProgrammeurRepository programmeurRepository;

    public ProgrammeurService(ProgrammeurRepository programmeurRepository) {
        this.programmeurRepository = programmeurRepository;
    }

    public List<Programmeur> getProgrammeurs(){
        return programmeurRepository.findAll();
    }

    public Optional<Programmeur> getunProgrammeur(Integer idProgrammeur){
        return programmeurRepository.findById(idProgrammeur);
    }

    public String deleteProgrammeur(Integer idProgrammeur){
        try {
            programmeurRepository.deleteById(idProgrammeur);
            return ("Programmeur supprimé avec succès");
        }
        catch (Exception e){
            throw new RuntimeException("Programmeur inexistant");
        }
    }

    public Programmeur saveProgrammeur(Programmeur programmeur){
        return programmeurRepository.save(programmeur);
    }

    public Programmeur updateProgrammeur(Integer idProgrammeur, Programmeur programmeur){
        if (programmeurRepository.existsById(idProgrammeur)){
            deleteProgrammeur(idProgrammeur);
            return saveProgrammeur(programmeur);
        }
        throw new RuntimeException("Programmeur inexistant");
    }
}
