package com.aquanexus.akinator;
import com.aquanexus.akinator.api.RequestDTO.InputDTOModel;
import com.aquanexus.akinator.api.UrlConstants;
import com.aquanexus.akinator.model.IAkinator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AkinatorApplication {
    @Autowired
    IAkinator akinatorCRUDModel;


    public static void main(String[] args) {
        SpringApplication.run(AkinatorApplication.class,args);
    }


    @PostMapping(UrlConstants.ADDINGDATA)
    public Object addInputDataObject(@RequestBody InputDTOModel object){
        return akinatorCRUDModel.addInputData(object);
    }
}
