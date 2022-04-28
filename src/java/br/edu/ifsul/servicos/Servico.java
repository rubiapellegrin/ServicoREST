/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.servicos;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author rubia
 */
@Stateless
@Path("remover")
public class Servico {
    
    @GET
    @Path("strings/{palavra}/{caractereRemover}")
    @Produces("application/json")
    public String RemoveString(@PathParam("palavra")  String palavra, @PathParam("caractereRemover")  String remover){
       palavra = palavra.replace(remover, "");
       return " A palavra com remoção: "+ palavra;
    }
    
}
