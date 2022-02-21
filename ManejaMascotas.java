package MiCodigo;

public class ManejaMascotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota miLindoGatito;
		MascotaConCuidados miLindaTortuga;
		miLindoGatito=new Mascota("gato", "Silvestre",1);
		miLindaTortuga=new MascotaConCuidados("tortuga", "Eustaquia",16); 
		System.out.println("Uy, Uy, mi "+ miLindoGatito.getEspecie()+ " hace Uy,Uy");
		System.out.println(" y se llama "+miLindoGatito.getNombre());
		miLindaTortuga.setCuidados("No estresarla");
		System.out.println("Mi "+miLindaTortuga.getEspecie());
		System.out.println(" se llama "+ miLindaTortuga.getNombre());
		System.out.println(" y conviene "+miLindaTortuga.getCuidados());
	}

}
