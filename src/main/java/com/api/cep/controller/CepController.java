package com.api.cep.controller;

import com.api.cep.Dto.CepDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep")
public class CepController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("{cep}")
    public CepDto consultaCep(@PathVariable("cep") String cep){

        String url = "https://viacep.com.br/ws/%s/json/".formatted(cep);
        ResponseEntity<CepDto> res = restTemplate.getForEntity(url, CepDto.class);

        CepDto newCep = new CepDto();
        if(res.getStatusCode() == HttpStatus.OK){
            newCep.setCep(res.getBody().getCep());
            newCep.setLogradouro(res.getBody().getLogradouro());
            newCep.setBairro(res.getBody().getBairro());
            newCep.setDdd(res.getBody().getDdd());
            newCep.setUf(res.getBody().getUf());
            newCep.setLocalidade(res.getBody().getLocalidade());
        }
        System.out.print("Cep : " + newCep.getBairro());
        return newCep;
    }
}
