package MSATauxChange.demo.dao;

import MSATauxChange.demo.TauxChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxChangeRepository extends JpaRepository<TauxChange, Integer> {

    TauxChange findByDeviseSAndDeviseD(String source, String dest);

}
