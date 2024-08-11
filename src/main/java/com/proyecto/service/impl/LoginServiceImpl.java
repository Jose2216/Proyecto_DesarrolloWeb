package com.proyecto.service.impl;

import com.proyecto.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.proyecto.dao.UsuarioDao;

@Service
public class LoginServiceImpl implements LoginService{
    
    //@Autowired
    private UsuarioDao loginDao;
    
    @Override
    //@Transactional(readOnly=true)
    public void iniciarSesion(String username, String password) {
        
    }
}
