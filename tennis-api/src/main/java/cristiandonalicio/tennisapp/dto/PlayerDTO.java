package cristiandonalicio.tennisapp.dto;

public class PlayerDTO {
  private Long id;
  private String name;
  private Integer score;

  public PlayerDTO() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }
}
