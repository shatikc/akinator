package com.aquanexus.akinator.model;


import com.aquanexus.akinator.api.RequestDTO.CustomerDetailsDTO;
import com.aquanexus.akinator.api.RequestDTO.InputDTOModel;
import com.aquanexus.akinator.api.ResponseDTO.ResponseDTOModel;
import com.aquanexus.akinator.repo.AkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AkinatorCRUDModel implements IAkinator {

    @Autowired
    AkRepository testdb;

    @Override
    public ResponseDTOModel addInputData(InputDTOModel object) {
        ResponseDTOModel responce = new ResponseDTOModel();
        if(testdb.existsById(object.getCustomerDetails())){
            responce.setMessage("This data already exist!");
            return responce;
        }
        testdb.save(object);
        responce.setMessage("Your data was added!");
        responce.setObject(object);
        return responce ;
    }
}
