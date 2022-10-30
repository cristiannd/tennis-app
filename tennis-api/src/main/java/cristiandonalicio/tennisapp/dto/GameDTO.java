package cristiandonalicio.tennisapp.dto;

import cristiandonalicio.tennisapp.enums.GameState;
import cristiandonalicio.tennisapp.enums.ScoreState;

import java.util.Date;

public class GameDTO {
  private Long id;
  private Date date;
  private GameState gameState;
  private PlayerDTO localPlayerDTO;
  private PlayerDTO awayPlayerDTO;
  private ScoreState localPlayerScore;
  private ScoreState awayPlayerScore;
  private Integer localPlayerMatch;
  private Integer awayPlayerMatch;
  private Integer localPlayerSet;
  private Integer awayPlayerSet;

  public GameDTO() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public GameState getGameState() {
    return gameState;
  }

  public void setGameState(GameState gameState) {
    this.gameState = gameState;
  }

  public PlayerDTO getLocalPlayerDTO() {
    return localPlayerDTO;
  }

  public void setLocalPlayerDTO(PlayerDTO localPlayerDTO) {
    this.localPlayerDTO = localPlayerDTO;
  }

  public PlayerDTO getAwayPlayerDTO() {
    return awayPlayerDTO;
  }

  public void setAwayPlayerDTO(PlayerDTO awayPlayerDTO) {
    this.awayPlayerDTO = awayPlayerDTO;
  }

  public ScoreState getLocalPlayerScore() {
    return localPlayerScore;
  }

  public void setLocalPlayerScore(ScoreState localPlayerScore) {
    this.localPlayerScore = localPlayerScore;
  }

  public ScoreState getAwayPlayerScore() {
    return awayPlayerScore;
  }

  public void setAwayPlayerScore(ScoreState awayPlayerScore) {
    this.awayPlayerScore = awayPlayerScore;
  }

  public Integer getLocalPlayerMatch() {
    return localPlayerMatch;
  }

  public void setLocalPlayerMatch(Integer localPlayerMatch) {
    this.localPlayerMatch = localPlayerMatch;
  }

  public Integer getAwayPlayerMatch() {
    return awayPlayerMatch;
  }

  public void setAwayPlayerMatch(Integer awayPlayerMatch) {
    this.awayPlayerMatch = awayPlayerMatch;
  }

  public Integer getLocalPlayerSet() {
    return localPlayerSet;
  }

  public void setLocalPlayerSet(Integer localPlayerSet) {
    this.localPlayerSet = localPlayerSet;
  }

  public Integer getAwayPlayerSet() {
    return awayPlayerSet;
  }

  public void setAwayPlayerSet(Integer awayPlayerSet) {
    this.awayPlayerSet = awayPlayerSet;
  }
}
