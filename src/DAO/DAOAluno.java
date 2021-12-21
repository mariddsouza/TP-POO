package DAO;
import model.ModelAluno;
import util.ConexaoSQLite;
public class DAOAluno extends ConexaoSQLite {
    public boolean salvarAlunoDAO(ModelAluno pModelAluno){
        conectar();
        
        desconectar();
        return true;
    }
}
