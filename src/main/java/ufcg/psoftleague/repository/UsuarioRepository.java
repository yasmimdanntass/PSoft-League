package ufcg.psoftleague.repository;

import ufcg.psoftleague.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository {

    Usuario salvar(Usuario usuario);

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email);
}
