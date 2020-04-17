package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicosRepository;

public class AtualizacaoTopicoForm {

    @NotNull
    @NotEmpty
    @Size(min = 5)
    private String titulo;
    @NotNull
    @NotEmpty
    @Size(min = 10)
    private String mensagem;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicosRepository topicosRepository) {
        Topico topico = topicosRepository.getOne(id);

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);
        
        return topico;
    }

}