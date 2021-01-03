package be.cvo.broodservice.domain.repository;

import be.cvo.broodservice.domain.BroodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BroodRepository extends JpaRepository<BroodEntity, Integer> {
}
