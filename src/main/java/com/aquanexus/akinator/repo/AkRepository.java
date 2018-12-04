package com.aquanexus.akinator.repo;


import com.aquanexus.akinator.api.RequestDTO.CustomerDetailsDTO;
import com.aquanexus.akinator.api.RequestDTO.InputDTOModel;
import org.springframework.data.repository.CrudRepository;

public interface AkRepository extends CrudRepository <InputDTOModel, CustomerDetailsDTO> {

}
