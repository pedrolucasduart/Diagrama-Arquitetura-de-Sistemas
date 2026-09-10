import java.time.LocalDateTime;
import java.util.List;

public class RegistroMovimentacaoRepositorio implements IRegistroMovimentacaoRepositorio {

    public void salvar() {
    }

    @Override
    public List<RegistroMovimentacao> buscarPorPeriodo(LocalDateTime inicio, LocalDateTime fim) {
        return null;
    }

    @Override
    public void salvar(RegistroMovimentacao registro) {
    }
}
