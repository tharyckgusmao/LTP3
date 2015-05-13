package dados;

import java.util.GregorianCalendar;

public class Cliente {
	private int codigo = 0;
	private String nome;
	private String telefone;
	private String email;
	private GregorianCalendar dataInclusao = new GregorianCalendar();
	private GregorianCalendar dataUltAlteracao = new GregorianCalendar();
	public Cliente(String nome, String telefone, String email,
			GregorianCalendar dataInclusao, GregorianCalendar dataUltAlteracao) {
		
		codigo++;
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public GregorianCalendar getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(GregorianCalendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public GregorianCalendar getDataUltAlteracao() {
		return dataUltAlteracao;
	}
	public void setDataUltAlteracao(GregorianCalendar dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + ", dataInclusao="
				+ dataInclusao + ", dataUltAlteracao=" + dataUltAlteracao + "]";
	}
	
	

	
}
