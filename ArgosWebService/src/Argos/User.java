package Argos;

import java.time.LocalDate;

/**
 * Created by Matheus on 02/05/2015.
 */
public class User {
    private LocalDate autenticacao;
    private LocalDate acesso;
    private String usuario;
    private String senha;
    private boolean autenticado;

    public User ( String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public boolean isAutenticado()
    {
        this.autenticado = true;
        this.autenticacao = LocalDate.now();
        this.acesso = LocalDate.now();
        return this.autenticado;
    }
}
