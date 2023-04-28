public class FuncaoAdapter extends FuncaoPreco {
    private IEmprego funcaoFuncao;

    public FuncaoAdapter(IEmprego funcaoFuncao) {
        this.funcaoFuncao = funcaoFuncao;
    }

    public String valorFuncao() {
        if (this.getPreco() >= 1000.0f)
            funcaoFuncao.setFuncao("Estagiário");
        else
        if (this.getPreco() >= 1100.0f)
            funcaoFuncao.setFuncao("Engenheiro");
        else
        if (this.getPreco() >= 1200.0f)
            funcaoFuncao.setFuncao("Presidente");
        else
            funcaoFuncao.setFuncao("Sem Função");
        return funcaoFuncao.getFuncao();
    }
}
