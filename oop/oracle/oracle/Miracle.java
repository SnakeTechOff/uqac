package oracle;

public class Miracle extends Parent implements MiracleInterface {

	// Vue
	 public void soin() {
		 Oracle.getInstance().print("Une gu�rison miraculeuse viens � vous !");
	 }
	 
	 public void charitable() {
		 Oracle.getInstance().getCouncil().charity();
	 }

	 
	 
	// Cach�
	 
	 public void retour() {
		 Oracle.getInstance().print("Retour � la vie de votre enfant");
	 }
	 
	 public void disparition() {
		 Oracle.getInstance().print("Disparition de vos bien !!");
	 }
	 

}
