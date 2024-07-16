/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author fabio
 */
public class Controller {
    
     @GetMapping("/inicio")
    public String index() {
        return "index";
    }
    
}
