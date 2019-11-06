package controllers;

import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import services.GuestService;

import java.io.Serializable;
import java.util.List;

@Component
@RequestScope
public class GuestController implements Serializable {
    @Autowired
    private GuestService service;


    public List<Guest> getGuests(){
        return service.getAll();
    }


    public Guest createGuest( Guest guest){
       return service.create(guest);
    }


    public void deleteGuest( Long id){
        service.delete(id);
    }
}
