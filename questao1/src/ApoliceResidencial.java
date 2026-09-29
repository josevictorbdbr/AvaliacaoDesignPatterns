import java.util.Arrays;
import java.util.List;

public class ApoliceResidencial extends Apolice {

    private double valorImovel;
    private boolean possuiDocumentoImovel;

    public ApoliceResidencial(String numero, String segurado, double valorImovel, boolean possuiDocumentoImovel){
        super(numero, segurado);
        this.valorImovel = valorImovel;;
        this.possuiDocumentoImovel = possuiDocumentoImovel;
    }

    @Override
    public double calcularPremio(){

        double premioMensal = valorImovel * 0.012;

        return premioMensal / 12;
    }

    @Override
    public boolean validarCobertura() {
        return possuiDocumentoImovel;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList("Escritura ou contrato de locacao", "Comprovante de residencia");
    }
}
