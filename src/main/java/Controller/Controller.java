
package Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Slf4j
@RequestMapping("/inicio")
public class Controller {
    
     @GetMapping("/principal")
    public String index() {
        return "index";
    }
    
     @GetMapping("/panel")
    public String mostrarPanel() {
        return "panel"; 
    }
}
