package com.randstad.characters.apiService.controllers;
import com.randstad.characters.domain.models.MyCharacter;
import com.randstad.characters.domain.services.MyCharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5173")
@RestController
public class MyCharacterController {
    private final MyCharacterService myCharacterService;

    public MyCharacterController(MyCharacterService myCharacterService) {
        this.myCharacterService = myCharacterService;
    }

    @GetMapping("/characters")
    public ResponseEntity<List<MyCharacter>> getAll(){
        return ResponseEntity.ok(this.myCharacterService.findAll());
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<MyCharacter> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.myCharacterService.findById(id));
    }

    @PostMapping("/characters")
    public ResponseEntity<MyCharacter> create(@RequestBody MyCharacter character){
        return ResponseEntity.ok(this.myCharacterService.create(character));
    }

    @DeleteMapping("/characters/{id}")
    public void deleteById(@PathVariable Long id){
        this.myCharacterService.deleteCharacter(id);
    }

}
