package pe.edu.upc.demotf.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.Services;

import java.util.List;


@Repository
public interface IServiceRepository extends JpaRepository<Services,Integer> {
    public List<Services> findByNameServiceAndDescriptionService(String name, String descrip);
}
