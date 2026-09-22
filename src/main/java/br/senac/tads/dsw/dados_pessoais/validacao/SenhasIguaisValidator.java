package br.senac.tads.dsw.dados_pessoais.validacao;

import br.senac.tads.dsw.dados_pessoais.PessoaDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;


@Component
public class SenhasIguaisValidator
	implements ConstraintValidator<SenhasIguais, PessoaDto> {

	private String mensagem;

	@Override
	public void initialize(SenhasIguais annotation){
		this.mensagem = annotation.message();
	}

	@Override
	public boolean isValid(PessoaDto pessoaDto, ConstraintValidatorContext context){
		boolean resultado = pessoaDto.getSenha() != null && pessoaDto.getSenha().equals(pessoaDto.getSenhaRepeticao());

		if(!resultado){
			context.disableDefaultConstraintViolation();

			context.buildConstraintViolationWithTemplate(mensagem).addPropertyNode("senha").addConstraintViolation();
		}

		return resultado;
	}
}
