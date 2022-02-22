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
    
}
