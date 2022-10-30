package cristiandonalicio.tennisapp.mapper;

import cristiandonalicio.tennisapp.dto.GameDTO;
import cristiandonalicio.tennisapp.enums.GameState;
import cristiandonalicio.tennisapp.model.Game;


public class GameMapperImpl implements GameMapper {
  PlayerMapper playerMapper = new PlayerMapperImpl();

  @Override
  public GameDTO toDTO(Game game) {
    GameDTO gameDTO = new GameDTO();

    gameDTO.setId(game.getId());
    gameDTO.setDate(game.getDate());
    gameDTO.setGameState(game.getGameState());
    gameDTO.setLocalPlayerDTO(playerMapper.toDTO(game.getLocalPlayer()));
    gameDTO.setAwayPlayerDTO(playerMapper.toDTO(game.getAwayPlayer()));
    gameDTO.setLocalPlayerScore(game.getLocalPlayerScore());
    gameDTO.setAwayPlayerScore(game.getAwayPlayerScore());
    gameDTO.setLocalPlayerSet(game.getLocalPlayerSet());
    gameDTO.setAwayPlayerSet(game.getAwayPlayerSet());
    gameDTO.setLocalPlayerMatch(game.getLocalPlayerMatch());
    gameDTO.setAwayPlayerMatch(game.getAwayPlayerMatch());

    return gameDTO;
  }

  @Override
  public Game fromDTO(GameDTO gameDTO) {
    Game game = new Game();

    game.setId(gameDTO.getId());
    game.setDate(gameDTO.getDate());
    game.setGameState(gameDTO.getGameState());
    game.setLocalPlayer(playerMapper.fromDTO(gameDTO.getLocalPlayerDTO()));
    game.setAwayPlayer(playerMapper.fromDTO(gameDTO.getAwayPlayerDTO()));
    game.setLocalPlayerScore(gameDTO.getLocalPlayerScore());
    game.setAwayPlayerScore(gameDTO.getAwayPlayerScore());
    game.setLocalPlayerSet(gameDTO.getLocalPlayerSet());
    game.setAwayPlayerSet(gameDTO.getAwayPlayerSet());
    game.setLocalPlayerMatch(gameDTO.getLocalPlayerMatch());
    game.setAwayPlayerMatch(gameDTO.getAwayPlayerMatch());

    return game;
  }
}
