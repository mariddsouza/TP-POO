package model;
public class ModelAluno {
    private int alunoId;
    private String alunoNome;
    private String alunoLogin;
    private String alunoSenha;

    /**
     * @return the alunoId
     */
    public int getAlunoId() {
        return alunoId;
    }

    /**
     * @param alunoId the alunoId to set
     */
    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    /**
     * @return the alunoNome
     */
    public String getAlunoNome() {
        return alunoNome;
    }

    /**
     * @param alunoNome the alunoNome to set
     */
    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    /**
     * @return the alunoLogin
     */
    public String getAlunoLogin() {
        return alunoLogin;
    }

    /**
     * @param alunoLogin the alunoLogin to set
     */
    public void setAlunoLogin(String alunoLogin) {
        this.alunoLogin = alunoLogin;
    }

    /**
     * @return the alunoSenha
     */
    public String getAlunoSenha() {
        return alunoSenha;
    }

    /**
     * @param alunoSenha the alunoSenha to set
     */
    public void setAlunoSenha(String alunoSenha) {
        this.alunoSenha = alunoSenha;
    }
}
