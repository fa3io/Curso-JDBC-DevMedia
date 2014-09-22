/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.devmedia.jdbc.bo;

import br.edu.devmedia.jdbc.dao.UfDAO;
import br.edu.devmedia.jdbc.dto.Uf;
import br.edu.devmedia.jdbc.exception.NegocioException;
import java.util.List;

/**
 *
 * @author Fábio
 */
public class UfBO {

    public List<Uf> listaEstados() throws NegocioException{
        List<Uf> estados = null;
        try{
            
            UfDAO  ufDAO = new UfDAO();
            estados = ufDAO.listaEstados();
        }catch(Exception e){
            e.printStackTrace();
            throw new NegocioException(e.getMessage(),e);
        }
        return estados;
    }
}
