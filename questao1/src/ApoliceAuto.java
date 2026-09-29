import java.util.Arrays;
import java.util.List;

public class ApoliceAuto extends Apolice {

    private double CRLV;
    private int CNH;
    private boolean possuiDocumento;

    public ApoliceAuto(String numero, String segurado, double CRLV, int CNH, boolean possuiDocumento){
        super(numero, segurado);
        this.CRLV = CRLV;
        this.CNH = CNH;
        this.possuiDocumento = possuiDocumento;
    }

    @Override
    public double calcularPremio(){
        double premioMensal = CRLV * 0.08;
        return premioMensal / 12;
    }

    @Override
    public boolean validarCobertura() {
        return possuiDocumento;
    }



    @Override
    public List<String> listarDocumentos(){
        return Arrays.asList("CNH", "CRLV");
    }
}
