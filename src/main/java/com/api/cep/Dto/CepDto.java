package com.api.cep.Dto;
       /*
               "cep": "01001-000",
               "logradouro": "Praça da Sé",
               "bairro": "Sé",
               "localidade": "São Paulo",
               "uf": "SP",
               "ddd": "11",
        */
public class CepDto {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;

           public CepDto() {
           }

           public CepDto(String cep, String logradouro, String bairro, String localidade, String uf, String ddd) {
               this.cep = cep;
               this.logradouro = logradouro;
               this.bairro = bairro;
               this.localidade = localidade;
               this.uf = uf;
               this.ddd = ddd;
           }

           public String getCep() {
               return cep;
           }

           public void setCep(String cep) {
               this.cep = cep;
           }

           public String getLogradouro() {
               return logradouro;
           }

           public void setLogradouro(String logradouro) {
               this.logradouro = logradouro;
           }

           public String getBairro() {
               return bairro;
           }

           public void setBairro(String bairro) {
               this.bairro = bairro;
           }

           public String getLocalidade() {
               return localidade;
           }

           public void setLocalidade(String localidade) {
               this.localidade = localidade;
           }

           public String getUf() {
               return uf;
           }

           public void setUf(String uf) {
               this.uf = uf;
           }

           public String getDdd() {
               return ddd;
           }

           public void setDdd(String ddd) {
               this.ddd = ddd;
           }
       }
