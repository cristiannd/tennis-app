package cristiandonalicio.tennisapp.mapper;

import cristiandonalicio.tennisapp.dto.PlayerDTO;
import cristiandonalicio.tennisapp.model.Player;

public class PlayerMapperImpl implements PlayerMapper {
  @Override
  public Player fromDTO(PlayerDTO playerDTO) {
    Player player = new Player();

    player.setId(playerDTO.getId());
    player.setName(playerDTO.getName());
    player.setScore(playerDTO.getScore());

    return player;
  }

  @Override
  public PlayerDTO toDTO(Player player) {
    PlayerDTO playerDTO = new PlayerDTO();

    playerDTO.setId(player.getId());
    playerDTO.setName(player.getName());
    playerDTO.setScore(player.getScore());

    return playerDTO;
  }
}
