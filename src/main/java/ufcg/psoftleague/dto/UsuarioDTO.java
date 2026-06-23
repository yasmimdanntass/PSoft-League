package ufcg.psoftleague.dto;

public class UsuarioDTO {

    private String nome;
    private String email;
    private String username;
    private String codigoAcesso;
    
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
    
    public String getCodigoAcesso() {
        return codigoAcesso;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }
}
