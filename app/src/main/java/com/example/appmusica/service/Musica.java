package com.example.appmusica.service;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "MUSICAS")
public class Musica {
    @ColumnInfo(name = "id_musica")
    @PrimaryKey(autoGenerate = true)
    private  int idMusica;
    @ColumnInfo(name = "nome_musica")
    private String nome;
    @ColumnInfo(name = "artista_musica")
    private String artista;
    @ColumnInfo(name = "album_musica" )
    private String album;
    @ColumnInfo(name = "duracao_musica")
    private String duracao;

    public Musica(String nome, String artista, String album, String duracao) {
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    @Override
    public String  toString() {
        return nome + "-" +  artista + "-" + album + "-" + duracao;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
