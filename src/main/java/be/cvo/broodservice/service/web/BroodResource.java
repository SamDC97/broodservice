package be.cvo.broodservice.service.web;

import be.cvo.broodservice.service.BroodService;
import be.cvo.broodservice.service.dto.Brood;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BroodResource {

    private BroodService broodService;

    public BroodResource(BroodService broodService){

        this.broodService = broodService;

    }

    @PostMapping("/add-brood")
    public void createBrood(@RequestBody Brood brood){
        broodService.addBrood(brood);
    }

    @GetMapping("/brood")
    public ResponseEntity<List<Brood>> getAll(){
        List<Brood> broodList = broodService.getAll();
        return new ResponseEntity<>(broodList, HttpStatus.OK);
    }

    @GetMapping("/brood/{id}")
    public ResponseEntity<Brood> getById(@PathVariable String id){
        Brood brood = broodService.getById(id);
        return new ResponseEntity<>(brood, HttpStatus.OK);
    }
}
