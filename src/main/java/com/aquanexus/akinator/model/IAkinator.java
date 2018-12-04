package com.aquanexus.akinator.model;


import com.aquanexus.akinator.api.RequestDTO.InputDTOModel;
import com.aquanexus.akinator.api.ResponseDTO.ResponseDTOModel;

public interface IAkinator {

    ResponseDTOModel addInputData(InputDTOModel object);

}
