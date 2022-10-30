package cristiandonalicio.tennisapp.service;

import cristiandonalicio.tennisapp.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {
  List<PlayerDTO> listAllOrderByNameAsc();
  PlayerDTO create(PlayerDTO playerDTO);
  PlayerDTO update(PlayerDTO playerDTO);
}
