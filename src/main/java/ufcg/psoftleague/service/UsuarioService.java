package ufcg.psoftleague.service;

import ufcg.psoftleague.dto.UsuarioDTO;
import ufcg.psoftleague.model.Usuario;
import ufcg.psoftleague.model.perfil.PerfilPadrao;
import ufcg.psoftleague.repository.UsuarioRepository;

public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario cadastrarUsuario(UsuarioDTO dto) {

        if (repository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        if (!dto.getCodigoAcesso().matches("\\d{6}")) {
            throw new IllegalArgumentException("Código deve ter 6 dígitos");
        }

        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setUsername(dto.getUsername());
        usuario.setCodigoAcesso(dto.getCodigoAcesso());

        usuario.setPerfil(new PerfilPadrao());

        return repository.salvar(usuario);
    }
}