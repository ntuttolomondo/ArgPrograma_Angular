package com.portfolio.nat.Repository;

import com.portfolio.nat.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> { // aplica métodos JpaRepository

}
