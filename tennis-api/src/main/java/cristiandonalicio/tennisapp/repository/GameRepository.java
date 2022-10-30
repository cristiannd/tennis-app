package cristiandonalicio.tennisapp.repository;

import cristiandonalicio.tennisapp.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
