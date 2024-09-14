package com.pulcini.proposta_app.repository;

import com.pulcini.proposta_app.entity.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {


}
