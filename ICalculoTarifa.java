import java.time.LocalDateTime;

public interface ICalculoTarifa {
    long calcularTempoPermanencia(LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida);

    double calcularValor(long tempoPermanencia, double valorBase);
}
