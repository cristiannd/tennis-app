package cristiandonalicio.tennisapp.model;

import cristiandonalicio.tennisapp.enums.GameState;
import cristiandonalicio.tennisapp.enums.ScoreState;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
public class Game {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private Date date;

  @Column
  private GameState gameState;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "id_local_player", nullable = false)
  private Player localPlayer;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "id_away_player", nullable = false)
  private Player awayPlayer;

  @Column
  private ScoreState localPlayerScore;

  @Column
  private ScoreState awayPlayerScore;

  @Column
  private Integer localPlayerMatch;

  @Column
  private Integer awayPlayerMatch;

  @Column
  private Integer localPlayerSet;

  @Column
  private Integer awayPlayerSet;

  public Game() {
  }

  public Game(Player localPlayer, Player awayPlayer) {
    this.date = new Date();
    this.gameState = GameState.NOT_STARTED;
    this.localPlayer = localPlayer;
    this.awayPlayer = awayPlayer;
    this.localPlayerScore = ScoreState.ZERO;
    this.awayPlayerScore = ScoreState.ZERO;
    this.localPlayerMatch = 0;
    this.awayPlayerMatch = 0;
    this.localPlayerSet = 0;
    this.awayPlayerSet = 0;
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

  public Player getLocalPlayer() {
    return localPlayer;
  }

  public void setLocalPlayer(Player localPlayer) {
    this.localPlayer = localPlayer;
  }

  public Player getAwayPlayer() {
    return awayPlayer;
  }

  public void setAwayPlayer(Player awayPlayer) {
    this.awayPlayer = awayPlayer;
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
