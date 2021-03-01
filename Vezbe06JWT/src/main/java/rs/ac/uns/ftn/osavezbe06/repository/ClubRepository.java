package rs.ac.uns.ftn.osavezbe06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.osavezbe06.model.entity.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
}
