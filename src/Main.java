import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		AVLTree tree = new AVLTree();
		Scanner entrada = new Scanner(System.in);
		
		//Insercao
		System.out.print("Numero de elementos para inserir: ");
		int elementos = entrada.nextInt();
		for(int i = 1; i <=elementos;i++){
		  System.out.print(i + "a Chave: ");
		  int chave = entrada.nextInt();
		  tree.insert(chave);
		System.out.println("\nÁrvore montada: \n");		  
		tree.displayTree();
		System.out.print("\n");
		}
		
		//Numero de rotações
		System.out.print("*-------- Número de rotações -------------*");
		System.out.print("\nRemover a chave: ");
		int rotacoes = entrada.nextInt();
		rotacoes = tree.nRotations(tree.root, rotacoes);
		System.out.println(rotacoes);
		
		
		//Busca
		System.out.print("*-------- BUSCA DE CHAVE -------------*");
		System.out.print("\nBuscar a chave: ");
		int buscaChave = entrada.nextInt();
		tree.search(buscaChave);

		System.out.print("\nBuscar a chave: ");
		int buscaChave1 = entrada.nextInt();
		tree.search(buscaChave1);
		System.out.println("\nÁrvore montada: \n");		  
		tree.displayTree();
		
		//Remocao
		System.out.print("\n*-------- REMOÇÃO DE CHAVE ----------*");
		System.out.print("\nRemover a chave: ");
		int removeChave = entrada.nextInt();
		tree.remove(removeChave);
		System.out.println("\nÁrvore montada: \n");
		tree.displayTree();

		//Busca
		System.out.print("\n*-------- BUSCA DE CHAVE -------------*");
		System.out.print("\nBuscar a chave: ");
		int buscaChave2 = entrada.nextInt();
		tree.search(buscaChave2);

		//Inserção
		System.out.print("\n*-------- INSERÇÃO DE CHAVE ----------*");
		System.out.print("\nInserir chave: ");
		int chave1 = entrada.nextInt();
		tree.insert(chave1);
		System.out.println("\nÁrvore montada: \n");		  
		tree.displayTree();
		System.out.print("\n");
		
		//BuscaMaior & BuscaMenor		
		System.out.print("*-------- BUSCA MAIOR E MENOR --------*\n");		  
		tree.getMax(tree.root);
		tree.getMin(tree.root);
		System.out.println("\n");
	
		entrada.close();
	}
}