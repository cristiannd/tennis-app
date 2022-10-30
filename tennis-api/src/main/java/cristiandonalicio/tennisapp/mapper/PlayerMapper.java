package cristiandonalicio.tennisapp.mapper;

import cristiandonalicio.tennisapp.dto.PlayerDTO;
import cristiandonalicio.tennisapp.model.Player;

public interface PlayerMapper {
  Player fromDTO(PlayerDTO playerDTO);
  PlayerDTO toDTO(Player player);
}
