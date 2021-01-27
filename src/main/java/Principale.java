import com.google.gson.Gson;

/**
 * Description de la classe Principale
 * @author ACAR
 * @author Auteur
 *
 */
public class Principale {

	/**
	 * Description de la fonction main
	 * @param args : décrire l'argument de la fonction
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		System.out.println(gson.toJson("Hello World !"));
		
		test("Java", 2);
		
		Article unArticle = new Article();
		unArticle.setNom("Pomme");
		unArticle.setReference("150D");
		unArticle.setPrix(1);
		unArticle.setStock(30);
		
		unArticle.approvisionnerArticle(3);
		
	}
	
	public static String test(String a, int b)
	{
		System.out.println(a + b);
		return a+b;
	}
	
	
	
	

}
