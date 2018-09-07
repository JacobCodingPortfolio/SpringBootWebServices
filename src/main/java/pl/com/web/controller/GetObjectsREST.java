package pl.com.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class GetObjectsREST {

    private static final Logger logger = LoggerFactory.getLogger(GetObjectsREST.class);

    @PostMapping("/getFirst")
    public String getParam(String message){
        logger.info("Działanie");
        return "To jes twoja wiadomość z powiększonymi literarmi: " + message.toUpperCase();
    }



}
