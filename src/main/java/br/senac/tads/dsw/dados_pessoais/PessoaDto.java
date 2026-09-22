package br.senac.tads.dsw.dados_pessoais;


import br.senac.tads.dsw.dados_pessoais.validacao.SenhasIguais;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;



@SenhasIguais
public class PessoaDto {
	private Integer id;

	@NotBlank(message = "O username é obrigatório")
	@Size(max = 64)
	private String username;

	@NotBlank(message = "O nome completo é obrigatório")
	@Size(max = 100)
	private String nome;

	@NotBlank
	@Size(max = 100)
	@Email
	private String email;

	@Size(max = 20)
	private String telefone;

	@NotNull
	@PastOrPresent
	private LocalDate dataNascimento;


	private String senha;

	private String senhaRepeticao;

	private List<String> conhecimentos;

	public PessoaDto() {
	}

	public PessoaDto(Integer id, String username, String nome, String email, String telefone, LocalDate dataNascimento) {
		this.id = id;
		this.username = username;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSenhaRepeticao(String senhaRepeticao) {
		this.senhaRepeticao = senhaRepeticao;
	}

	public void setConhecimentos(List<String> conhecimentos) {
		this.conhecimentos = conhecimentos;
	}
}
