public class EmpregoFuncao implements IEmprego {
    private String funcao;

    @Override
    public String getFuncao() {
        return this.funcao;
    }

    @Override
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
