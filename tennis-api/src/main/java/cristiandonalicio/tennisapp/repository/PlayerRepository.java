package cristiandonalicio.tennisapp.repository;

import cristiandonalicio.tennisapp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
  List<Player> findAllByOrderByNameAsc();
}
