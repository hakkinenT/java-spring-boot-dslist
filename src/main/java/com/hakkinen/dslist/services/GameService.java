package com.hakkinen.dslist.services;

import com.hakkinen.dslist.dto.GameMinDTO;
import com.hakkinen.dslist.entities.Game;
import com.hakkinen.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> games = result.stream().map(g -> new GameMinDTO(g)).toList();
        return games;
    }
}
