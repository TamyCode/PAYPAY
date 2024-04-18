package pe.edu.upc.demotf.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.Voucher;

@Repository
public interface IVoucherRepository extends JpaRepository<Voucher,Integer> {

}