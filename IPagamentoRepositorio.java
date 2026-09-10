import java.time.LocalDateTime;
import java.util.List;

public interface IPagamentoRepositorio {
    List<Pagamento> buscarPorPeriodo(LocalDateTime inicio, LocalDateTime fim);

    void salvar(Pagamento pagamento);
}
