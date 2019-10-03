package se.experis.hibernateTask20.repository;

import se.experis.hibernateTask20.model.ClassRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoleRepository extends JpaRepository<ClassRole, Integer>{

    ClassRole findClassRoleById(int class_id);
}
