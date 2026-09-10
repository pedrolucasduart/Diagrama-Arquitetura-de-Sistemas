public class ServicoAutenticacao implements IAutenticador {
    private int idFuncionario;

    @Override
    public boolean autenticar(Funcionario funcionario, String credencial) {
        return false;
    }
}
