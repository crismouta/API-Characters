package com.randstad.characters.infra.repositories;

import com.randstad.characters.domain.models.MyCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICharacterRepository extends JpaRepository<MyCharacter, Long> {
}
