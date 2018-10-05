package MSAOperation.operation.dao;

import MSAOperation.operation.OperationChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationChangeRepository extends JpaRepository<OperationChange, Integer> {
    OperationChange findById(int i);
}
