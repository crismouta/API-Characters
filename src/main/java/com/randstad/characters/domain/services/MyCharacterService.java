package com.randstad.characters.domain.services;
import com.randstad.characters.domain.models.MyCharacter;
import com.randstad.characters.infra.repositories.ICharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MyCharacterService {
    private final ICharacterRepository characterRepository;

    public MyCharacterService(ICharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<MyCharacter> findAll() {
        return this.characterRepository.findAll();
    }

    public MyCharacter findById(Long id) {
        var optionalCharacter = this.characterRepository.findById(id);
        if(optionalCharacter.isEmpty()) throw new RuntimeException("El character con id: " + id + " no existe");
        return optionalCharacter.get();
    }

    public MyCharacter create(MyCharacter character) {
        return this.characterRepository.save(character);
    }

    public void deleteCharacter(Long id) {
        this.characterRepository.deleteById(id);
    }

    public MyCharacter update(MyCharacter character) {
        return characterRepository.save(character);
    }
}
