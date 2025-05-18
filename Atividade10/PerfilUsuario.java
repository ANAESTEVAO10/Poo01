package Atividade10; // Define o pacote da classe

import java.util.List; // Importa a interface List para uso na classe

// Classe que representa um perfil de usuário
public class PerfilUsuario {
    private Long id; // Identificador único do perfil
    private String descricao; // Descrição do perfil
    private List<String> permissoes; // Lista de permissões associadas ao perfil

    // Construtor da classe que inicializa os atributos
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id; // Atribui o id fornecido ao atributo id
        this.descricao = descricao; // Atribui a descrição fornecida ao atributo descricao
        this.permissoes = permissoes; // Atribui a lista de permissões fornecida ao atributo permissoes
    }

    // Método que retorna uma representação em String do objeto
    @Override
    public String toString() {
        return "PerfilUsuario{" + // Início da representação
                "id=" + id + // Inclui o id na representação
                ", descricao='" + descricao + '\'' + // Inclui a descrição na representação
                ", permissoes=" + permissoes + // Inclui a lista de permissões na representação
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

    // Getter para obter a descrição
    public String getDescricao() {
        return descricao; // Retorna a descrição
    }

    // Setter para definir a descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao; // Atualiza a descrição com o valor fornecido
    }

    // Getter para obter a lista de permissões
    public List<String> getPermissoes() {
        return permissoes; // Retorna a lista de permissões
    }

    // Setter para definir a lista de permissões
    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes; // Atualiza a lista de permissões com o valor fornecido
    }
}