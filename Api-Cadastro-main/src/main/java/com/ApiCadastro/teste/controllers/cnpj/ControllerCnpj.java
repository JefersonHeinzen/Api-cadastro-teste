/*package com.ApiCadastro.teste.controllers.cnpj;

import com.ApiCadastro.teste.dto.UserDTO;
import com.ApiCadastro.teste.dto.cnpj.Cnpj;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class ControllerCnpj {

    public ControllerCnpj<Cnpj> insert(@RequestBody UserDTO Cnpj) {
        try {
            ControllerCnpj obj = Cnpj.insert(Cnpj);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{Cnpj}")
                    .buildAndExpand(obj.getCnpj()).toUri();
            return ControllerCnpj.created(uri).body(obj);
        }
    }

 */