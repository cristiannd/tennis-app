package cristiandonalicio.tennisapp.controller;

import cristiandonalicio.tennisapp.dto.GameDTO;
import cristiandonalicio.tennisapp.service.GameService;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/games")
public class GameController {
  @Autowired
  GameService gameService;

  @GetMapping
  public ResponseEntity<List<GameDTO>> listAll() {
    List<GameDTO> gameDTOList = gameService.listAll();
    return ResponseEntity.ok(gameDTOList);
  }

  @PostMapping
  public ResponseEntity<GameDTO> saveGame(@RequestBody GameDTO gameDTO) {
    GameDTO savedGame = gameService.create(gameDTO);
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(savedGame);
  }

  @PutMapping
  public ResponseEntity<GameDTO> updateGame(@RequestBody GameDTO gameDTO) {
    GameDTO updatedGame = gameService.update(gameDTO);
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(updatedGame);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteGame(@PathVariable Long id) {
    gameService.delete(id);

    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
