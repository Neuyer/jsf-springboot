package services;

import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorys.GuestRepository;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository repo;

    public List<Guest>getAll(){
        return repo.findAll();
    }

    public Guest create(Guest guest){
        return repo.save(guest);
    }

    public void delete(long id){
        Guest guest = repo.findById(id).orElseThrow(RuntimeException::new);
        repo.delete(guest);
    }
}
