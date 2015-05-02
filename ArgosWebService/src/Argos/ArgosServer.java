package Argos;

/**
 * Created by Matheus on 02/05/2015.
 * SEI (Service Endpoint Interface) Argos
 */

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ArgosServer{
    @WebMethod String autenticar( String usuario, String senha) throws Mensagem;
    @WebMethod boolean verificaPorta(Porta porta);
    @WebMethod boolean alteraPorta(Porta porta);
    @WebMethod boolean verificaJanela(Porta porta);
    @WebMethod boolean alteraJanela(Porta porta);
    @WebMethod boolean verificaLampada(Porta porta);
    @WebMethod boolean alteraLampada(Porta porta);
    @WebMethod boolean mandaAlerta(Mensagem mensagem);
}
