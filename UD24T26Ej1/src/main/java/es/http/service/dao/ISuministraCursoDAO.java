package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Suministra;

/**
 * @author Jose
 *
 */
public interface ISuministraCursoDAO extends JpaRepository<Suministra, Integer>{
	
}
