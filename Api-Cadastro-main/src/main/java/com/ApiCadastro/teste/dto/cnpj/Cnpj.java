/*
package com.ApiCadastro.teste.dto.cnpj;

import java.util.Map;

public class Cnpj {

    private String Cnpj;

    public Cnpj(){

    }

    private boolean isCnpj(String cnpj) {
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("-", "");
        cnpj = cnpj.replace("/", "");
        {

        }


        try {
            Long.parseLong(cnpj);
        } catch (NumberFormatException e) {
            return false;
        }
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111")
                || cnpj.equals("22222222222222") || cnpj.equals("33333333333333")
                || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
                || cnpj.equals("66666666666666") || cnpj.equals("77777777777777")
                || cnpj.equals("88888888888888") || cnpj.equals("99999999999999") || (cnpj.length() != 14))
            return (false);
        return false;
    }


        return null;
    }
}


 */