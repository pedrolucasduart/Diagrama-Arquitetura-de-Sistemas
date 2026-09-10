import java.time.LocalDateTime;
import java.util.List;

public interface IRegistroMovimentacaoRepositorio {
    List<RegistroMovimentacao> buscarPorPeriodo(LocalDateTime inicio, LocalDateTime fim);

    void salvar(RegistroMovimentacao registro);
}
