package MSATauxChange.demo.dao;

import MSATauxChange.demo.TauxChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxChangeDAO extends JpaRepository<TauxChange, Integer> {

    @Query("SELECT devise_source, devise_destination, taux, date FROM TauxChange t WHERE t.devise_source = :ds AND t.devise_destination = :dd")
    TauxChange findByDevise_sourceAndDevise_destination(@Param("ds") String ds,@Param("dd") String dd);

}
