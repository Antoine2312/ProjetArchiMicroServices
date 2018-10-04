package MSAOperation.operation.dao;

import MSAOperation.operation.OperationChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationChangeDAO extends JpaRepository<OperationChange, Integer> {

    @Query("SELECT id, devise_source, devise_destination, montant, date, taux FROM OperationChange o WHERE o.id = :i")
    OperationChange findByID(@Param("i") int i);

}
