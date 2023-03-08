package kodlama.io.arabaKirala.dataAccess.abstracts;

import kodlama.io.arabaKirala.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
