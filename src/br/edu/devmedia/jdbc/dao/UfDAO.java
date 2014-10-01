
package br.edu.devmedia.jdbc.dao;

import br.edu.devmedia.jdbc.ConexaoUtil;
import br.edu.devmedia.jdbc.dto.Uf;
import br.edu.devmedia.jdbc.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UfDAO {
    public List<Uf> listaEstados() throws PersistenciaException{
        List<Uf> estados = new ArrayList<>();
        try{
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "SELECT * FROM TB_UF";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                Uf uf = new Uf();
                uf.setIdUf(resultSet.getInt("ID_UF"));
                uf.setSiglaUf(resultSet.getString("SIGLA_UF"));
                uf.setDescricao(resultSet.getString("DESCRICAO"));   
                
                estados.add(uf);
            }
            connection.close();
        }catch(Exception e){
            
            e.printStackTrace();
            throw  new PersistenciaException(e.getMessage());
        }
        return estados;
    }
    
}
