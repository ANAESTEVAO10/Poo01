package Atividade10; // Define o pacote da classe

import java.time.LocalDateTime; // Importa a classe LocalDateTime para manipulação de data e hora

// Classe que representa um usuário do sistema
public class Usuario {
    private Long id; // Identificador único do usuário
    private String nome; // Nome do usuário
    private String senha; // Senha do usuário
    private PerfilUsuario perfilUsuario; // Perfil associado ao usuário
    private LocalDateTime ultimoLogin; // Data e hora do último login
    private boolean ativo; // Status que indica se o usuário está ativo

    // Construtor da classe que inicializa os atributos
    public Usuario(Long id, String nome, String senha, PerfilUsuario perfilUsuario) {
        this.id = id; // Atribui o id fornecido ao atributo id
        this.nome = nome; // Atribui o nome fornecido ao atributo nome
        this.senha = senha; // Atribui a senha fornecida ao atributo senha
        this.perfilUsuario = perfilUsuario; // Atribui o perfil fornecido ao atributo perfilUsuario
        this.ativo = true; // Usuário ativo por padrão
    }

    // Método que permite ao usuário fazer login
    public void logar(String senha) {
        if (!this.ativo) { // Verifica se o usuário está ativo
            System.out.println("Usuário não está ativo!"); // Mensagem de erro se o usuário não estiver ativo
            return; // Sai do método
        }
        if (this.senha.equals(senha)) { // Verifica se a senha fornecida é igual à senha armazenada
            this.ultimoLogin = LocalDateTime.now(); // Atualiza o último login para o momento atual
            new LogAuditoria(1L, this, ultimoLogin, "Login realizado"); // Cria um log de auditoria para o login
        } else {
            System.out.println("Senha incorreta!"); // Mensagem de erro para senha incorreta
        }
    }

    // Método que cria uma nova sessão para o usuário
    public Sessao criarSessao() {
        String token = "token-" + this.id; // Gera um token simples baseado no id do usuário
        return new Sessao(1L, this, token); // Retorna uma nova instância de Sessao
    }

    // Método que retorna uma representação em String do objeto
    @Override
    public String toString() {
        return "Usuario{" + // Início da representação
                "id=" + id + // Inclui o id na representação
                ", nome='" + nome + '\'' + // Inclui o nome na representação
                ", perfilUsuario=" + perfilUsuario.getDescricao() + // Inclui a descrição do perfil na representação
                '}'; // Finaliza a representação
    }

    // Getters e Setters
    public Long getId() { return id; } // Retorna o id
    public void setId(Long id) { this.id = id; } // Atualiza o id
    public String getNome() { return nome; } // Retorna o nome
    public void setNome(String nome) { this.nome = nome; } // Atualiza o nome
    public String getSenha() { return senha; } // Retorna a senha
    public void setSenha(String senha) { this.senha = senha; } // Atualiza a senha
    public PerfilUsuario getPerfilUsuario() { return perfilUsuario; } // Retorna o perfil do usuário
    public void setPerfilUsuario(PerfilUsuario perfilUsuario) { this.perfilUsuario = perfilUsuario; } // Atualiza o perfil do usuário
    public boolean isAtivo() { return ativo; } // Retorna o status de ativo
    public void setAtivo(boolean ativo) { this.ativo = ativo; } // Atualiza o status de ativo
}