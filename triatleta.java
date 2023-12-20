package InterfaceJava;

public class triatleta implements nadador, corredor, ciclista{

	//override é polimorfismo de subescrita (reescreve um metodo ja existente, nesse caso herdado)
	

	 @Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public String pedalar() {
		// TODO Auto-generated method stub
		return "Estou pedalando";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "Estou correndo";
	}

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Estou nadando";
	}

}
