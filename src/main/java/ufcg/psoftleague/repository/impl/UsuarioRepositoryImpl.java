package ufcg.psoftleague.repository.impl;

import ufcg.psoftleague.model.Usuario;
import ufcg.psoftleague.repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final List<Usuario> banco = new ArrayList<>();
    private Long idAtual = 1L;

    @Override
    public Usuario salvar(Usuario usuario) {
        usuario.setId(idAtual++);
        banco.add(usuario);
        return usuario;
    }

    @Override
    public boolean existsByEmail(String email) {
        return banco.stream()
                .anyMatch(u -> u.getEmail().equals(email));
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return banco.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst();
    }
}