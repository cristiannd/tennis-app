package cristiandonalicio.tennisapp.mapper;

import cristiandonalicio.tennisapp.dto.GameDTO;
import cristiandonalicio.tennisapp.model.Game;

public interface GameMapper {
  GameDTO toDTO(Game game);
  Game fromDTO(GameDTO gameDTO);
}
