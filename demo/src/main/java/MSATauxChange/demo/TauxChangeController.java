package MSATauxChange.demo;

import MSATauxChange.demo.dao.TauxChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TauxChangeController {

    @Autowired
    private Environment environment;
    @Autowired
    private TauxChangeRepository tcRep;

    @GetMapping(value="/devise-change/source/{source}/dest/{dest}")
    public TauxChange afficherParSourceEtDest(@PathVariable String source, @PathVariable String dest){
        TauxChange tc =tcRep.findByDeviseSAndDeviseD(source,dest);
        return tc;
    }

    @PostMapping(value="/devise-change/creerTC")
    public void creerTC(@RequestBody TauxChange tc){
        tcRep.save(tc);
    }

    @DeleteMapping(value="/devise-change/supprimerTC/source/{source}/dest/{dest}")
    public void supprimerTC(@PathVariable("source") String source, @PathVariable("dest") String dest){
        tcRep.delete(tcRep.findByDeviseSAndDeviseD(source, dest));
    }

    //operation CRUD de update se fait automatiquement via h2

}
