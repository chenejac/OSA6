package rs.ac.uns.ftn.osavezbe06oauth.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.osavezbe06oauth.model.Club;
import rs.ac.uns.ftn.osavezbe06oauth.repository.ClubRepository;
import rs.ac.uns.ftn.osavezbe06oauth.service.ClubService;

import java.util.List;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    ClubRepository clubRepository;

    @Override
    public List<Club> getAll() {
        return clubRepository.findAll();
    }

}
