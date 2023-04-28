public class Funcionario {
    IEmprego funcao;
    FuncaoAdapter repositor;

    public Funcionario() {
        funcao = new EmpregoFuncao();
        repositor = new FuncaoAdapter(funcao);
    }
    
    public String getFuncao() {
        return repositor.valorFuncao();
    }

    public float getPreco() {
        return repositor.getPreco();
    }

    public void setFuncao(String engenheiro) {
    }
}
