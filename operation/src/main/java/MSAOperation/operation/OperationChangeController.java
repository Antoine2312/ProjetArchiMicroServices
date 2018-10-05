package MSAOperation.operation;

import MSAOperation.operation.dao.OperationChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class OperationChangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private OperationChangeRepository ocRep;

    @GetMapping(value="/operation-change/id/{id}")
    public OperationChange afficherParSourceEtDest(@PathVariable("id") int id){
        return ocRep.findById(id);
    }

    @PostMapping(value="/operation-change/creerOC")
    public void creerTC(@RequestBody OperationChange oc){
        ocRep.save(oc);
    }

    @DeleteMapping(value="/operation-change/SupprimerOC/id/{id}")
    public void supprimerTC(@PathVariable("id") int id){
        ocRep.delete(ocRep.findById(id));
    }

    //operation CRUD de update se fait automatiquement via h2

}
