package Atividade10; // Define o pacote da classe

import java.time.LocalDateTime; // Importa a classe LocalDateTime para manipulação de data e hora

// Classe que representa um log de auditoria
public class LogAuditoria {
    private Long id; // Identificador único do log de auditoria
    private Usuario usuario; // Usuário associado ao log
    private LocalDateTime dataHora; // Data e hora em que a ação foi registrada
    private String acao; // Ação realizada pelo usuário

    // Construtor da classe que inicializa os atributos
    public LogAuditoria(Long id, Usuario usuario, LocalDateTime dataHora, String acao) {
        this.id = id; // Atribui o id fornecido ao atributo id
        this.usuario = usuario; // Atribui o usuário fornecido ao atributo usuario
        this.dataHora = dataHora; // Atribui a data e hora fornecidas ao atributo dataHora
        this.acao = acao; // Atribui a ação fornecida ao atributo acao
    }

    // Método que retorna uma representação em String do objeto
    @Override
    public String toString() {
        return "LogAuditoria{" + // Início da representação
                "id=" + id + // Inclui o id na representação
                ", usuario=" + usuario.getNome() + // Inclui o nome do usuário na representação
                ", dataHora=" + dataHora + // Inclui a data e hora na representação
                ", acao='" + acao + '\'' + // Inclui a ação na representação
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

    // Getter para obter a data e hora
    public LocalDateTime getDataHora() {
        return dataHora; // Retorna a data e hora
    }

    // Setter para definir a data e hora
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora; // Atualiza a data e hora com o valor fornecido
    }

    // Getter para obter a ação
    public String getAcao() {
        return acao; // Retorna a ação
    }

    // Setter para definir a ação
    public void setAcao(String acao) {
        this.acao = acao; // Atualiza a ação com o valor fornecido
    }
}