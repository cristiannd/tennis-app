package cristiandonalicio.tennisapp.controller;

import cristiandonalicio.tennisapp.dto.PlayerDTO;
import cristiandonalicio.tennisapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/players")
public class PlayerController {
  @Autowired
  PlayerService playerService;

  @GetMapping
  public ResponseEntity<List<PlayerDTO>> listAllPlayer() {
    List<PlayerDTO> playerList = playerService.listAllOrderByNameAsc();
    return ResponseEntity.ok(playerList);
  }

  @PostMapping
  public ResponseEntity<PlayerDTO> savePlayer(@RequestBody PlayerDTO playerDTO) {
    PlayerDTO savedPlayer = playerService.create(playerDTO);
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(savedPlayer);
  }

  @PutMapping
  public ResponseEntity<PlayerDTO> updatePlayer(@RequestBody PlayerDTO playerDTO) {
    PlayerDTO updatedPlayer = playerService.update(playerDTO);
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(updatedPlayer);
  }
}
