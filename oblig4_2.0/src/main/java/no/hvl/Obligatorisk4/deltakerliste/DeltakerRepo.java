package no.hvl.Obligatorisk4.deltakerliste;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeltakerRepo extends JpaRepository<Deltaker, Integer> {
	Deltaker findByFornavn(String fornavn);

	Deltaker findByTlf(String tlf);

	boolean existsByTlf(String tlf);

	boolean existsByPassord(String passord);
	
	List<Deltaker> findAllByOrderByFornavnAsc();
}
