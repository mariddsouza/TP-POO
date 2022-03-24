package DAO;
import model.ModelAdmin;
import util.ConexaoSQLite;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOAdmin extends ConexaoSQLite {
    public boolean salvarAdminDAO(ModelAdmin pModelAdmin){
        conectar();
        String sql= "INSERT INTO tbl_admin (" + "nome, " + "login, "+"email, " + "senha) " + "VALUES  (?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelAdmin.getAdmNome());
            preparedStatement.setString(2, pModelAdmin.getAdmLogin());
            preparedStatement.setString(3, pModelAdmin.getAdmEmail());
            preparedStatement.setString(4, pModelAdmin.getAdmSenha());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return true;
    }
    public List<ModelAdmin> getListaAdminDao(){
        List<ModelAdmin> listaAluno = new ArrayList<>();
        ModelAdmin modelAdmin = new ModelAdmin();
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " + "nome, " + "login, "+ "email, "+ "senha " + "FROM tbl_admin";
        preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try{
        
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            modelAdmin = new ModelAdmin();
            modelAdmin.setAdmNome(resultSet.getString(1));
            modelAdmin.setAdmLogin(resultSet.getString(2));
            modelAdmin.setAdmEmail(resultSet.getString(3));
            modelAdmin.setAdmSenha(resultSet.getString(4));
            listaAluno.add(modelAdmin);
        }
        }
        catch(Exception e){
            System.err.println(e);
        
        }
        desconectar();
        return listaAluno;
    }
    public boolean validarAdmin(ModelAdmin modelAdmin){
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " 
                + "pk_id, "
                + "nome, " 
                + "login, "
                +"email, "
                + "senha " 
                + "FROM tbl_admin "
                + "WHERE login = '"+ modelAdmin.getAdmLogin()+ "' AND "
                +"senha = '"+modelAdmin.getAdmSenha()+"'";
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
    public boolean verificaAdmin(ModelAdmin modelAdmin){
        conectar();
        ResultSet resultSet=null;
        PreparedStatement preparedStatement = null;
        String sql= "SELECT " 
                + "pk_id, "
                + "nome, " 
                + "login, "
                +"email, "
                + "senha " 
                + "FROM tbl_admin "
                + "WHERE login = '"+ modelAdmin.getAdmLogin()+ "' OR "
                + "email = '"+ modelAdmin.getAdmEmail()+ "' OR "
                +"nome = '"+modelAdmin.getAdmNome()+"'";
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
