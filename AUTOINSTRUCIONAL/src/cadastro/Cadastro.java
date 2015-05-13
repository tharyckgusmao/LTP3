package cadastro;

import java.util.ArrayList;

import dados.Cliente;
import dados.Produto;
import dados.Venda;
import erros.SisVendasException;

class Cadastro {

	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public static ArrayList<Produto> produto = new ArrayList<Produto>();
	public static ArrayList<Venda> venda = new ArrayList<Venda>();
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

		
		public void incluirCliente (Cliente objCliente) {
			
			clientes.add(objCliente);
		}
		
		
		public void excluirCliente (Cliente objCliente) {
			
			clientes.remove(objCliente);
		}
		
		
		public Cliente buscarClienteCod (String cod) throws SisVendasException {
			
			for(Cliente objCliente : clientes){
				
				if(clientes.equals(cod)){
					return objCliente;
				}
				
				new SisVendasException("Não existe cliente para o código informado!")
				
			}
			
			return null;
		}
}
