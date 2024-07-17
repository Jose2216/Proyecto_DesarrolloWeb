package com.proyecto.dao;

import com.proyecto.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDao extends JpaRepository<Usuario, Long>{
    
}
