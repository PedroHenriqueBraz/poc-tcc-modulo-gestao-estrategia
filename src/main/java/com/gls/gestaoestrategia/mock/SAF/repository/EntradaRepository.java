package com.gls.gestaoestrategia.mock.SAF.repository;

import com.gls.gestaoestrategia.mock.SAF.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EntradaRepository extends JpaRepository<Entrada, Long> {
}
