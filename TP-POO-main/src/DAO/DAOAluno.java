package DAO;
import model.ModelAluno;
import util.ConexaoSQLite;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DAOAluno extends ConexaoSQLite {
    public boolean salvarAlunoDAO(ModelAluno pModelAluno){
        conectar();
        String sql= "INSERT INTO tbl_aluno (" + "nome, " + "login, " + "senha) " + "VALUES  (?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelAluno.getAlunoNome());
            preparedStatement.setString(1, pModelAluno.getAlunoLogin());
            preparedStatement.setString(1, pModelAluno.getAlunoSenha());
            preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return true;
    }
}
