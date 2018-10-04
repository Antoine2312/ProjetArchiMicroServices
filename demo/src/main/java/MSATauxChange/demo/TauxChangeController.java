package MSATauxChange.demo;

import MSATauxChange.demo.dao.TauxChangeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TauxChangeController {

    @Autowired
    private TauxChangeDAO tcDao;

    @GetMapping(value="TauxChanges")
    public List<TauxChange> listeTCs(){
        return tcDao.findAll();
    }

    @GetMapping(value="TauxChangeID/{source}/{dest}")
    public TauxChange afficherParSourceEtDest(@PathVariable("source") String source, @PathVariable("dest") String dest){
        return tcDao.findByDevise_sourceAndDevise_destination(source,dest);
    }

    @PostMapping(value="CreerTC")
    public void creerTC(@RequestBody TauxChange tc){
        TauxChange tc1 = tcDao.save(tc);
    }

    @DeleteMapping(value="SupprimerTC/{source}/{dest}")
    public void supprimerTC(@PathVariable("source") String source, @PathVariable("dest") String dest){
        tcDao.delete(tcDao.findByDevise_sourceAndDevise_destination(source, dest));
    }

    //operation CRUD de update se fait automatiquement via h2

}
