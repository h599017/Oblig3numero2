package no.hvl.Obligatorisk4.deltakerliste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeltakerService {

	@Autowired
	private DeltakerRepo deltakerrepo;

	public List<Deltaker> finnAlleDeltakere() {
		return deltakerrepo.findAll();
	}

	public Deltaker finnMobil(String tlf) {
		return deltakerrepo.findByTlf(tlf);
	}
	
	public Deltaker finnFornavn(String fornavn) {
		return deltakerrepo.findByFornavn(fornavn);
	}
}