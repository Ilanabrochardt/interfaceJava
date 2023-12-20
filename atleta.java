package InterfaceJava;

//OBSERVE QUE NAO E PUBLIC CLASS MAS, SIM, PUBLIC INTERFACE
//E ABSTRACT PA E CLASS NAO E NAO VAI INSTANCIAR OBJETO
public interface atleta {
	//não tem o metodo construtor pq interface nao implementa nenhum metodo
	public String nome = " ";
	public String idade = " ";
	
	public void setNome(String nome); 
}
