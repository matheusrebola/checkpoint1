package br.com.fiap.checkpoint1.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.checkpoint1.model.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository <Empregado, Long> {
	
}
