package Atividade10; // Define o pacote da classe

// Classe que representa uma sessão de usuário
public class Sessao {
    private Long id; // Identificador único da sessão
    private Usuario usuario; // Usuário associado à sessão
    private String token; // Token de autenticação da sessão

    // Construtor da classe que inicializa os atributos
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id; // Atribui o id fornecido ao atributo id
        this.usuario = usuario; // Atribui o usuário fornecido ao atributo usuario
        this.token = token; // Atribui o token fornecido ao atributo token
    }

    // Método que retorna uma representação em String do objeto
    @Override
    public String toString() {
        return "Sessao{" + // Início da representação
                "id=" + id + // Inclui o id na representação
                ", usuario=" + usuario.getNome() + // Inclui o nome do usuário na representação
                ", token='" + token + '\'' + // Inclui o token na representação
                '}'; // Finaliza a representação
    }

    // Getter para obter o id
    public Long getId() {
        return id; // Retorna o id
    }

    // Setter para definir o id
    public void setId(Long id) {
        this.id = id; // Atualiza o id com o valor fornecido
    }

    // Getter para obter o usuário
    public Usuario getUsuario() {
        return usuario; // Retorna o usuário
    }

    // Setter para definir o usuário
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; // Atualiza o usuário com o valor fornecido
    }

    // Getter para obter o token
    public String getToken() {
        return token; // Retorna o token
    }

    // Setter para definir o token
    public void setToken(String token) {
        this.token = token; // Atualiza o token com o valor fornecido
    }
}