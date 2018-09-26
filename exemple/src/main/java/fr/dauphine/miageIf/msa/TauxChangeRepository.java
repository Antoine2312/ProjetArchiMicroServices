package fr.dauphine.miageIf.msa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TauxChangeRepository {
    TauxChange findBySourceAndDest(String source, String dest);
}
