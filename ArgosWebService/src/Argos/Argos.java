package Argos;

/**
 * Created by Matheus on 02/05/2015.
 * SIB (Service Implementation Bean) Argos
 */
import java.time.LocalDate;
import javax.jws.WebService;

@WebService(endpointInterface = "Argos.ArgosServer")
public class Argos implements ArgosServer {
    @Override
    public String autenticar(String usuario, String senha){
        if(!usuario.isEmpty() && !senha.isEmpty()){
            User user = new User( usuario, senha);
            if(user.isAutenticado()){
                return Mensagem.statusAtenticada;
            }
        }
        return Mensagem.erroNaoAutenticada;
    }

    @Override
    public boolean verificaPorta(Porta porta) {
        return false;
    }

    @Override
    public boolean alteraPorta(Porta porta) {
        return false;
    }

    @Override
    public boolean verificaJanela(Porta porta) {
        return false;
    }

    @Override
    public boolean alteraJanela(Porta porta) {
        return false;
    }

    @Override
    public boolean verificaLampada(Porta porta) {
        return false;
    }

    @Override
    public boolean alteraLampada(Porta porta) {
        return false;
    }

    @Override
    public boolean mandaAlerta(Mensagem mensagem) {
        return false;
    }
}
