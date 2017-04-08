package br.com.toolbox.app;

/**
 * Created by 15251365 on 13/03/2017.
 */

public class Contato {
    private String nome;
    private String status;
    private int imagem;

    //construtor da classe
    public Contato(String nome,String status,int imagem){
        // preenchendo as variáveis
        this.nome = nome;
        this.status = status;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
