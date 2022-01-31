package model;
public class ModelProfessor {
    private int profId;
    private String profNome;
    private String profLogin;
    private String profSenha;
    public int getProfId() {
        return profId;
    }
    public void setProfId(int profId) {
        this.profId = profId;
    }
    public String getProfNome() {
        return profNome;
    }
    public void setProfNome(String profNome) {
        this.profNome = profNome;
    }

    public String getProfLogin() {
        return profLogin;
    }

    public void setProfLogin(String profLogin) {
        this.profLogin = profLogin;
    }

    public String getProfSenha() {
        return profSenha;
    }

    public void setProfSenha(String profSenha) {
        this.profSenha = profSenha;
    }
    
}
