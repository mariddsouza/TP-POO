package DAO;
import model.ModelProfessor;
import util.ConexaoSQLite;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class DAOProfessor extends ConexaoSQLite {
    public boolean salvarProfessorDAO(ModelProfessor pModelProfessor){
        conectar();
        String sql= "INSERT INTO tbl_aluno (" + "nome, " + "login, " + "senha) " + "VALUES  (?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelProfessor.getProfNome());
            preparedStatement.setString(1, pModelProfessor.getProfLogin());
            preparedStatement.setString(1, pModelProfessor.getProfSenha());
            preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return true;
    }
    public boolean validarProfessor(ModelProfessor modelProfessor){
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " 
                + "pk_id, "
                + "nome, " 
                + "login, "
                +"email, "
                + "senha " 
                + "FROM tbl_professor "
                + "WHERE login = '"+ modelProfessor.getProfLogin()+ "' AND "
                +"senha = '"+modelProfessor.getProfSenha()+"'";
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
