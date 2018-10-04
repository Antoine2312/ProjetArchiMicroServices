package MSAOperation.operation;

import MSAOperation.operation.dao.OperationChangeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperationChangeController {

    @Autowired
    private OperationChangeDAO ocDao;

    @GetMapping(value="OperationChanges")
    public List<OperationChange> listeOCs(){
        return ocDao.findAll();
    }

    @GetMapping(value="OperationChangeID/{id}")
    public OperationChange afficherParSourceEtDest(@PathVariable("id") int id){
        return ocDao.findByID(id);
    }

    @PostMapping(value="CreerOC")
    public void creerTC(@RequestBody OperationChange oc){
        OperationChange tc1 = ocDao.save(oc);
    }

    @DeleteMapping(value="SupprimerOC/{id}")
    public void supprimerTC(@PathVariable("id") int id){
        ocDao.delete(ocDao.findByID(id));
    }

    //operation CRUD de update se fait automatiquement via h2

}
