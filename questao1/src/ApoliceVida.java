import java.util.Arrays;
import java.util.List;

public class ApoliceVida extends Apolice{

    private double capitalSegurado;
    private boolean possuiAtestado;

    public ApoliceVida(String numero, String segurado, double capitalSegurado, boolean possuiAtestado){
            super(numero, segurado);
            this.capitalSegurado = capitalSegurado;
            this.possuiAtestado = possuiAtestado;
    }


    @Override
    public double calcularPremio() {
        double premio = (capitalSegurado * 0.03);
        return premio;
    }

    @Override
    public boolean validarCobertura() {
        if (capitalSegurado > 500000) {
            return possuiAtestado;
        }

        return true;
    }

    @Override
    public List<String> listarDocumentos() {
        if (capitalSegurado > 500000) {
            return Arrays.asList("Identidade", "CPF", "Atestado médico");
        }
        return Arrays.asList("Identidade", "CPF");
    }
}
