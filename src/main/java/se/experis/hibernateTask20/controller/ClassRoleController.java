package se.experis.hibernateTask20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.experis.hibernateTask20.model.ClassRole;
import se.experis.hibernateTask20.repository.ClassRoleRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class ClassRoleController {

    @Autowired
    private final ClassRoleRepository classRoleRepository;

    public ClassRoleController(ClassRoleRepository classRoleRepository){
        this.classRoleRepository = classRoleRepository;
    }

    @GetMapping("/addClassRole")
    public String addClassRole() {
        ClassRole aClassRole = new ClassRole();
        classRoleRepository.save(aClassRole);

        return "200";
    }

    @GetMapping("/classRole")
    public List<ClassRole> getAll() {
        return classRoleRepository.findAll();
    }

    @GetMapping("/classRole/{className}")
    public ClassRole getClassRole(@PathVariable String className) {
        return classRoleRepository.findClassRolesByClassName(className);
    }

}
