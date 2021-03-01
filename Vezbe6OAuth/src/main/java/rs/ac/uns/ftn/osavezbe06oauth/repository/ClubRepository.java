package rs.ac.uns.ftn.osavezbe06oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.osavezbe06oauth.model.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
}
