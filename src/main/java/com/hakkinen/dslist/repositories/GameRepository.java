package com.hakkinen.dslist.repositories;

import com.hakkinen.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
