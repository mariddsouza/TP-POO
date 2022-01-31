package DAO;
import model.ModelProfessor;
import util.ConexaoSQLite;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
}
