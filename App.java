package unicesumar.segundoBimestre;

public class App {
	public static void main(String[] args) {
		Doutor paula = new Doutor("paula", "1334789-1");
		
		Cliente claudio = new Cliente("claudio", "133456-9");
		Cliente fernanda = new Cliente("fernanda", "233456-4");

		Pet rex = new Pet("rex", 3);
		Pet marrom = new Pet("marrom", 4);
        //0..1 para 0..1 bidirecional
		rex.setDono(fernanda);
		rex.setDono(claudio);
		claudio.setPet(rex);
		//1 para 0..1 unidirecional
		rex.setDoutor(paula);
		rex.setDoutor(paula);
		marrom.setDoutor(paula);
		//1 para muitos
		Procedimento banho = new Procedimento("banho e tosa",rex);
		Procedimento vacina = new Procedimento("vacina pulga",rex);
	    
	    
	
	}
}
