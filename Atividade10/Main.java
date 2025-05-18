package Atividade10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando perfis de usuário
        PerfilUsuario admin = new PerfilUsuario(1L, "Admin", Arrays.asList("CRUD", "READ", "WRITE"));
        PerfilUsuario usuarioComum = new PerfilUsuario(2L, "Usuario Comum", Arrays.asList("READ"));

        // Criando usuários
        Usuario usuario1 = new Usuario(1L, "João", "senha123", admin);
        Usuario usuario2 = new Usuario(2L, "Maria", "senha456", usuarioComum);

        // Testando login
        usuario1.logar("senha123");
        Sessao sessao1 = usuario1.criarSessao();
        System.out.println(sessao1);

        // Testando log de auditoria
        LogAuditoria log1 = new LogAuditoria(1L, usuario1, LocalDateTime.now(), "Login realizado");
        System.out.println(log1);
    }
}