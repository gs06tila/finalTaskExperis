package se.experis.hibernateTask20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.experis.hibernateTask20.model.Characters;
import se.experis.hibernateTask20.repository.CharactersRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class CharactersController {

    @Autowired
    private final CharactersRepository charactersRepository;

    public CharactersController(CharactersRepository charactersRepository) {
        this.charactersRepository = charactersRepository;
    }

    @GetMapping("/addcharacter")
    public String addCharacter() {
        Characters aCharacter = new Characters(7, "Tim", 4, 2);
        charactersRepository.save(aCharacter);

        return "200";
    }

    @GetMapping("/characters")
    public List<Characters> getAll() {
        return charactersRepository.findAll();
    }


    @PostMapping("/character")
    public Characters createCharacter(@RequestBody Characters characters) {
        return charactersRepository.save(characters);
    }

    @GetMapping("/character/{characterId}")
    public Optional<Characters> getUser(@PathVariable int characterId) {
        return charactersRepository.findById(characterId);
    }
}
