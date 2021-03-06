package br.edu.devmedia.jdbc.bo;

import br.edu.devmedia.jdbc.dao.PessoaDAO;
import br.edu.devmedia.jdbc.dto.Endereco;
import br.edu.devmedia.jdbc.dto.Pessoa;
import br.edu.devmedia.jdbc.exception.NegocioException;
import br.edu.devmedia.jdbc.exception.ValidacaoException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class PessoaBO {

    private final DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    public void Cadastrar(Pessoa pessoa) throws NegocioException {
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.adicionar(pessoa);

        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
    }

    public String[][] listar(List listaIds) throws NegocioException {
        int numeroColunas = 10;
        String[][] listaRetorno = null;
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            List<Pessoa> lista = pessoaDAO.listarTodos();

            listaRetorno = new String[lista.size()][numeroColunas];

            for (int i = 0; i < lista.size(); i++) {

                Pessoa pessoa = lista.get(i);
                Endereco endereco = pessoa.getEnderecoDTO();
                
                listaRetorno[i][0] = pessoa.getId().toString();
                listaIds.add(pessoa.getId());
                listaRetorno[i][1] = pessoa.getNome();
                listaRetorno[i][2] = pessoa.getCfp().toString();
                listaRetorno[i][3] = pessoa.getSexo() == 'M' ? "Masculino" : "Feminino";
                listaRetorno[i][4] = formatador.format(pessoa.getDtNascimento());
                listaRetorno[i][5] = endereco.getLogradouro();
                listaRetorno[i][6] = endereco.getCep().toString();
                listaRetorno[i][7] = endereco.getUf().getDescricao();
                listaRetorno[i][8] = "Editar";
                listaRetorno[i][9] = "Deletar";
            
            
            }

        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
        return listaRetorno;
    }
    
    public void deletarPessoa(Integer id) throws NegocioException{
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.delete(id);
            
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
    }
    
    public void removeAll() throws NegocioException{
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.deleteAll();
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
    }

    public boolean validaNome(String nome) throws ValidacaoException {
        boolean ehValido = true;

        if (nome == null || nome.equals("")) {
            ehValido = false;
            throw new ValidacaoException("Nome é obrigatório!");
        } else if (nome.length() > 30) {
            ehValido = false;
            throw new ValidacaoException("Campo de nome comporta 30 carateres!");
        }
        return ehValido;
    }

    public boolean validaCPF(String CPF) throws ValidacaoException {
        boolean ehValido = true;

        if (CPF == null || CPF.equals("")) {
            ehValido = false;
            throw new ValidacaoException("CPF é obrigatório!");
        } else if (CPF.length() != 11) {
            ehValido = false;
            throw new ValidacaoException("CPF deve ter 11 digitos!");
        } else {
            char[] digitos = CPF.toCharArray();
            for (char digito : digitos) {
                if (!Character.isDigit(digito)) {
                    ehValido = false;
                    throw new ValidacaoException("CPF deve ser composto por apenas numeros!");
                }
            }

        }
        return ehValido;
    }

    public boolean validaEndereco(Endereco endereco) throws ValidacaoException {
        boolean ehValido = true;

        if (endereco.getLogradouro() == null || endereco.getLogradouro().equals("")) {
            ehValido = false;
            throw new ValidacaoException("Logradouro é obrigatório!");
        } else if (endereco.getBairro() == null || endereco.getBairro().equals("")) {
            ehValido = false;
            throw new ValidacaoException("Bairro é obrigatório!");
        }else if (endereco.getCidade()== null || endereco.getCidade().equals("")) {
            ehValido = false;
            throw new ValidacaoException("Cidade é obrigatório!");
        }else if (endereco.getNumero() == null || endereco.getNumero().equals("")) {
            ehValido = false;
            throw new ValidacaoException("Numero é obrigatório!");
        }else if (endereco.getCep() == null || endereco.getCep().equals("")) {
            ehValido = false;
            throw new ValidacaoException("CEP é obrigatório!");
        }
        return ehValido;
    }

    public boolean validaDataNascimento(String dataNascimento) throws ValidacaoException {
        boolean ehValido = true;

        if (dataNascimento == null || dataNascimento.equals("")) {
            ehValido = false;
            throw new ValidacaoException("Data de nascimento é obrigatória!");
        } else {
            try {
                formatador.parse(dataNascimento);
            } catch (ParseException ex) {
                ehValido = false;
                throw new ValidacaoException("Data informada é inválida!");
            }
        }
        return ehValido;
    }
     public String[][] listaConsulta(String nome, Long cpf, char sexo, String ordem) throws NegocioException {
        int numeroColunas = 6;
         String[][] listaRetorno = null;
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            List<Pessoa> lista = pessoaDAO.filtraPessoa(nome, cpf, String.valueOf(sexo), ordem);

            listaRetorno = new String[lista.size()][numeroColunas];

            for (int i = 0; i < lista.size(); i++) {

                Pessoa pessoa = lista.get(i);
                listaRetorno[i][0] = pessoa.getId().toString();
                listaRetorno[i][1] = pessoa.getNome();
                listaRetorno[i][2] = pessoa.getCfp().toString();
                listaRetorno[i][3] = pessoa.getEndereco();
                listaRetorno[i][4] = pessoa.getSexo() == 'M' ? "Masculino" : "Feminino";
                listaRetorno[i][5] = formatador.format(pessoa.getDtNascimento());
            }
            
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
       return listaRetorno;
    }
     
     public Pessoa buscaPorId(Integer id) throws NegocioException{
       Pessoa pessoa = new Pessoa();
         try {
             pessoa = new PessoaDAO().buscaPorId(id);
         } catch (Exception e) {
             throw new NegocioException(e.getMessage());
         }
         return pessoa;
     }
     
     public void atualizar(Pessoa pessoa) throws NegocioException{
         try {
             PessoaDAO pessoaDAO = new PessoaDAO();
             pessoaDAO.atualizar(pessoa);
         } catch (Exception e) {
             throw new NegocioException(e.getMessage());
         }
     }

}
