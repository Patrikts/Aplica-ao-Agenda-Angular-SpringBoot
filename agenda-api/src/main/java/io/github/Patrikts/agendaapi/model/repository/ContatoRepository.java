package io.github.Patrikts.agendaapi.model.repository;

import io.github.Patrikts.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
