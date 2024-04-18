package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.Notification;

@Repository

public interface INotificationRepository extends JpaRepository<Notification,Integer> {
}
