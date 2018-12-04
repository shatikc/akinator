package com.aquanexus.akinator.api.ResponseDTO;


import com.aquanexus.akinator.api.RequestDTO.InputDTOModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTOModel {

    private String message;
    private InputDTOModel object;

}
