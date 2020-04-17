package br.com.alura.forum.config.validacao;

public class ErrosDeFormulario {

    private String campo;
    private String erro;

    public ErrosDeFormulario(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return this.campo;
    }

    public String getErro() {
        return this.erro;
    }
}