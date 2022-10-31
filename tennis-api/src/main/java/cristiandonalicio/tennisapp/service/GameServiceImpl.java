package cristiandonalicio.tennisapp.service;

import cristiandonalicio.tennisapp.dto.GameDTO;
import cristiandonalicio.tennisapp.mapper.GameMapper;
import cristiandonalicio.tennisapp.mapper.GameMapperImpl;
import cristiandonalicio.tennisapp.model.Game;
import cristiandonalicio.tennisapp.model.Player;
import cristiandonalicio.tennisapp.repository.GameRepository;
import cristiandonalicio.tennisapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService {
  @Autowired
  GameRepository gameRepository;

  @Autowired
  PlayerRepository playerRepository;

  GameMapper gameMapper = new GameMapperImpl();

  @Override
  public List<GameDTO> listAll() {
    List<Game> gameList = gameRepository.findAll();

    return gameList
            .stream()
            .map(game -> gameMapper.toDTO(game))
            .collect(Collectors.toList());
  }

  @Override
  public GameDTO getById(Long id) {
    Optional<Game> game = gameRepository.findById(id);

    if (game.isEmpty()) {
      throw new NoSuchElementException("The game with id: " + id + " does not exists.");
    }

    return gameMapper.toDTO(game.get());
  }

  @Override
  public GameDTO create(GameDTO gameDTO) {
    Game newGame = gameMapper.fromDTO(gameDTO);

    Optional<Player> localPlayer = playerRepository.findById(newGame.getLocalPlayer().getId());
    Optional<Player> awayPlayer = playerRepository.findById(newGame.getAwayPlayer().getId());

    if (localPlayer.isPresent() && awayPlayer.isPresent()) {
      Game gameToSave = new Game(localPlayer.get(), awayPlayer.get());
      Game savedGame = gameRepository.save(gameToSave);
      return gameMapper.toDTO(savedGame);
    }

    throw new NoSuchElementException("Both players must be present.");
  }

  @Override
  public GameDTO update(GameDTO gameDTO) {
    Game updateGame = gameMapper.fromDTO(gameDTO);
    Game updatedGame = gameRepository.save(updateGame);

    return gameMapper.toDTO(updatedGame);
  }

  @Override
  public void delete(Long id) {
    boolean game = gameRepository.existsById(id);

    if(!game) {
      throw new NoSuchElementException("The game with id: " + id + " does not exist.");
    }

    gameRepository.deleteById(id);
  }

  @Override
  public void play(Long id) {

  }
}
