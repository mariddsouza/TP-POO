package controller;

import DAO.DAOAluno;
import java.util.List;
import model.ModelAluno;

public class ControlAluno {
DAOAluno dAOAluno = new DAOAluno();
 
    public List<ModelAluno> getListaAlunoControl() {
        return this.dAOAluno.getListaUsuarioDao();
    }

    public boolean validarAlunoControl(ModelAluno modelAluno) {
       return this.dAOAluno.validarAluno(modelAluno);
    }
    public boolean salvarAlunoControl(ModelAluno modelAluno) {
       return this.dAOAluno.salvarAlunoDAO(modelAluno);
    }
    public boolean verificaAlunoControl(ModelAluno modelAluno) {
       return this.dAOAluno.verificaAluno(modelAluno);
    }
    
}
