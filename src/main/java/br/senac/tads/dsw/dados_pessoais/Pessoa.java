package br.senac.tads.dsw.dados_pessoais;


import java.time.LocalDate;
import java.util.List;


public class Pessoa {
	private int id;
	private String username;
	private String nome;
	private String email;
	private String telefone;
	private LocalDate dataNascimento;
	private String senha;
	private String senhaRepeticao;
	private List<String> conhecimentos;

	public Pessoa() {
	}

	public Pessoa(int id, String username, String nome, String email, String telefone, LocalDate dataNascimento) {
		this.id = id;
		this.username = username;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public String getSenhaRepeticao() {
		return senhaRepeticao;
	}

	public List<String> getConhecimentos() {
		return conhecimentos;
	}
}
