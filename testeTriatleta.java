package InterfaceJava;

public class testeTriatleta {
	public static void main(String[] args) {
		triatleta john = new triatleta();
		john.setNome("john");
		john.correr();
		john.nadar();
		john.pedalar();
		
		System.out.printf("Eu sou John, tritatleta. %s, %s e %s", john.correr(), john.nadar(), john.pedalar());
	}
	
}
