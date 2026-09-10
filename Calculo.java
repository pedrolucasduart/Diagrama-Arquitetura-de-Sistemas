import java.time.LocalDateTime;

public class Calculo implements ICalculoTarifa {

    @Override
    public long calcularTempoPermanencia(LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
        return 0;
    }

    @Override
    public double calcularValor(long tempoPermanencia, double valorBase) {
        return 0;
    }
}
