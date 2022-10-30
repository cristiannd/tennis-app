package cristiandonalicio.tennisapp.service;

import cristiandonalicio.tennisapp.dto.GameDTO;

import java.util.List;

public interface GameService {
  List<GameDTO> listAll();
  GameDTO getById(Long id);
  GameDTO create(GameDTO gameDTO);
  GameDTO update(GameDTO gameDTO);
  void delete(Long id);
  void play(Long id);
}
