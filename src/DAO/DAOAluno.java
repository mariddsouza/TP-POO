package DAO;
import model.ModelAluno;
import util.ConexaoSQLite;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
public class DAOAluno extends ConexaoSQLite {
    public boolean salvarAlunoDAO(ModelAluno pModelAluno){
        conectar();
        String sql= "INSERT INTO tbl_aluno (" 
                + "nome, " 
                + "login, " 
                + "senha, " 
                + "email) " 
                + "VALUES  (?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelAluno.getAlunoNome());
            preparedStatement.setString(2, pModelAluno.getAlunoLogin());
            preparedStatement.setString(3, pModelAluno.getAlunoSenha());
            preparedStatement.setString(4, pModelAluno.getAlunoEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return true;
    }
    public List<ModelAluno> getListaUsuarioDao(){
        List<ModelAluno> listaAluno = new ArrayList<>();
        ModelAluno modelAluno = new ModelAluno();
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " + "nome, " + "login, "+"email, "+ "senha " + "FROM tbl_aluno";
        preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try{
        
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            modelAluno = new ModelAluno();
            modelAluno.setAlunoNome(resultSet.getString(1));
            modelAluno.setAlunoLogin(resultSet.getString(2));
            modelAluno.setAlunoEmail(resultSet.getString(3));
            modelAluno.setAlunoSenha(resultSet.getString(4));
            listaAluno.add(modelAluno);
        }
        }
        catch(Exception e){
            System.err.println(e);
        
        }
        desconectar();
        return listaAluno;
    }
    public boolean validarAluno(ModelAluno modelAluno){
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " 
                + "pk_id, "
                + "nome, " 
                + "login, "
                +"email, "
                + "senha " 
                + "FROM tbl_aluno "
                + "WHERE login = '"+ modelAluno.getAlunoLogin() + "' AND "
                +"senha = '"+modelAluno.getAlunoSenha()+"'";
        preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
       try{
           
        resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
        if(resultSet.next()){
            System.out.println(sql);
            return true;
        }else{
            return false;
        }
       }
       catch(SQLException e){
           e.printStackTrace();
           return false;
           
       }finally{
           try{
            resultSet.close();
            preparedStatement.close();
            desconectar();
           }catch(SQLException ex){
               ex.printStackTrace();
               
           }
         }
       
       }
     public boolean verificaAluno(ModelAluno modelAluno){
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " 
                + "pk_id, "
                + "nome, " 
                + "login, "
                +"email, "
                + "senha " 
                + "FROM tbl_aluno "
                + "WHERE login = '"+ modelAluno.getAlunoLogin() + "' OR "
                +"email = '"+modelAluno.getAlunoEmail()+"' OR "
                +"nome = '"+modelAluno.getAlunoNome()+"'";
        preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
       try{
           
        resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
        if(resultSet.next()){
            System.out.println(sql);
            return true;
        }else{
            return false;
        }
       }
       catch(SQLException e){
           e.printStackTrace();
           return false;
           
       }finally{
           try{
            resultSet.close();
            preparedStatement.close();
            desconectar();
           }catch(SQLException ex){
               ex.printStackTrace();
               
           }
         }
       
       }
       
    }

