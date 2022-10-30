package cristiandonalicio.tennisapp.service;

import cristiandonalicio.tennisapp.dto.PlayerDTO;
import cristiandonalicio.tennisapp.mapper.PlayerMapper;
import cristiandonalicio.tennisapp.mapper.PlayerMapperImpl;
import cristiandonalicio.tennisapp.model.Player;
import cristiandonalicio.tennisapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
  @Autowired
  PlayerRepository playerRepository;

  PlayerMapper playerMapper = new PlayerMapperImpl();

  @Override
  public List<PlayerDTO> listAllOrderByNameAsc() {
    List<Player> players = playerRepository.findAllByOrderByNameAsc();
    List<PlayerDTO> response = new ArrayList<>();

    for (Player player : players) {
      response.add(playerMapper.toDTO(player));
    }

    return response;
  }

  @Override
  public PlayerDTO create(PlayerDTO playerDTO) {
    Player player = playerMapper.fromDTO(playerDTO);
    player.setScore(0);

    Player savedPlayer = playerRepository.save(player);

    return playerMapper.toDTO(savedPlayer);
  }

  @Override
  public PlayerDTO update(PlayerDTO playerDTO) {
    Optional<Player> player = playerRepository.findById(playerDTO.getId());

    if (player.isEmpty()) {
      throw new IllegalArgumentException("El jugador con el id: " + playerDTO.getId() + " no existe.");
    }


    Player savedPlayer = playerRepository.save(playerMapper.fromDTO(playerDTO));

    return playerMapper.toDTO(savedPlayer);
  }
}
