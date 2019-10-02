package se.experis.hibernateTask20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.experis.hibernateTask20.model.Characters;
import se.experis.hibernateTask20.repository.CharactersRepository;

import java.util.List;

@RestController
public class CharactersController {

    @Autowired
    private final CharactersRepository charactersRepository;

    public CharactersController(CharactersRepository charactersRepository) {
        this.charactersRepository = charactersRepository;
    }

    @GetMapping("/addcharacter")
    public String addCharacter() {
        Characters aCharacter = new Characters();
        charactersRepository.save(aCharacter);

        return "200";
    }

    @GetMapping("/character")
    public List<Characters> getAll() {
        return charactersRepository.findAll();
    }
}
