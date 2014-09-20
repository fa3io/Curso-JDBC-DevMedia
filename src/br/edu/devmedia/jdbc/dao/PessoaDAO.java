package br.edu.devmedia.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.devmedia.jdbc.ConexaoUtil;
import br.edu.devmedia.jdbc.dto.Pessoa;
import br.edu.devmedia.jdbc.exception.PersistenciaException;

public class PessoaDAO implements GenericoDAO<Pessoa> {

    @Override
    public void adicionar(Pessoa pessoa) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "INSERT INTO tb_pessoa (NOME, CPF, Endereco, SEXO, DT_NASCIMENTO) values (?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, pessoa.getNome());
            statement.setLong(2, pessoa.getCfp());
            statement.setString(3, pessoa.getEndereco());
            statement.setString(4, String.valueOf(pessoa.getSexo()));
            statement.setDate(5, new Date(pessoa.getDtNascimento().getTime()));

            statement.execute();

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public void atualizar(Pessoa pessoa) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "UPDATE TB_PESSOA SET NOME = ?, CPF = ?, ENDERECO = ?, SEXO = ?, DT_NASCIMENTO = ? WHERE ID_PESSOA = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pessoa.getNome());
            statement.setLong(2, pessoa.getCfp());
            statement.setString(3, pessoa.getEndereco());
            statement.setString(4, String.valueOf(pessoa.getSexo()));
            statement.setDate(5, new Date(pessoa.getDtNascimento().getTime()));
            statement.setInt(6, pessoa.getId());

            statement.execute();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public void delete(Integer idPessoa) throws PersistenciaException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "DELETE FROM TB_PESSOA WHERE ID_PESSOA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idPessoa);
            statement.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    public void deleteAll() throws PersistenciaException {
        try {

            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "DELETE  FROM TB_PESSOA ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public List<Pessoa> listarTodos() throws PersistenciaException {
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "SELECT * FROM TB_PESSOA";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pessoa pessoa = new Pessoa();

                pessoa.setId(resultSet.getInt("ID_PESSOA"));
                pessoa.setNome(resultSet.getString("NOME"));
                pessoa.setCfp(resultSet.getLong("CPF"));
                pessoa.setEndereco(resultSet.getString("ENDERECO"));
                pessoa.setSexo(resultSet.getString("SEXO").charAt(0));
                pessoa.setDtNascimento(resultSet.getDate("DT_NASCIMENTO"));

                listaPessoa.add(pessoa);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
        return listaPessoa;
    }

    public List<Pessoa> filtraPessoa(String nome, Long cpf, String sexo, String ordem) throws PersistenciaException {
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "SELECT * FROM TB_PESSOA";
            boolean ultimo = false;
            if (nome != null && !nome.equals("")) {
                sql += " WHERE NOME LIKE ?";
                ultimo = true;
            }
            if (cpf != null && !cpf.equals("")) {
                if (ultimo) {
                    sql += " AND";
                } else {
                    sql += " WHERE";
                }
                sql += "CPF LIKE ?";
            }
            if (sexo != null && !sexo.equals("")) {
                if (ultimo) {
                    sql += " AND";
                } else {
                    sql += " WHERE";
                    ultimo = true;
                }
                sql += " SEXO = ?";
            }
            sql += "ORDER BY " + ordem;
            PreparedStatement statement = connection.prepareStatement(sql);
            int contador = 0;
            if (nome != null && !nome.equals("")) {
                statement.setString(++contador, "%" + nome + "%");
            }
            if (cpf != null && !cpf.equals("")) {
                statement.setString(++contador, "%" + cpf + "%");
            }
            if (sexo != null && !sexo.equals("")) {
                statement.setString(++contador, sexo);
            }
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pessoa pessoa = new Pessoa();

                pessoa.setId(resultSet.getInt("ID_PESSOA"));
                pessoa.setNome(resultSet.getString("NOME"));
                pessoa.setCfp(resultSet.getLong("CPF"));
                pessoa.setEndereco(resultSet.getString("ENDERECO"));
                pessoa.setSexo(resultSet.getString("SEXO").charAt(0));
                pessoa.setDtNascimento(resultSet.getDate("DT_NASCIMENTO"));

                listaPessoa.add(pessoa);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);

        }
        return listaPessoa;

    }

    @Override
    public Pessoa buscaPorId(Integer id) throws PersistenciaException {
        Pessoa pessoa = null;
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();
            String sql = "SELECT * FROM TB_PESSOA WHERE ID_PESSOA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                pessoa = new Pessoa();
                pessoa.setId(resultSet.getInt("ID_PESSOA"));
                pessoa.setNome(resultSet.getString("NOME"));
                pessoa.setCfp(resultSet.getLong("CPF"));
                pessoa.setEndereco(resultSet.getString("ENDERECO"));
                pessoa.setSexo(resultSet.getString("SEXO").charAt(0));
                pessoa.setDtNascimento(resultSet.getDate("DT_NASCIMENTO"));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
        return pessoa;
    }

}
