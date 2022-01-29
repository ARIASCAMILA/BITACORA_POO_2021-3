package edificio;

public class Ascensor {
	
	int pisos = 10;
	int sotanos = 3;
	int piso;
	int actual = sotanos;
	String total[] = new String[pisos+sotanos];
	void Edificio() {
		for(int s = sotanos-1; s>=0;s--) {
			total[sotanos-s-1]="S"+(s+1);
		}
		for(int p = sotanos; p<total.length;p++) {
			total[p]=String.valueOf(p-sotanos+1);
		}
		
//		//Imprimir orden del edificio
//		for(int i = 0; i<total.length;i++) {
//			System.out.println(total[i]);
//		}
		
	}
	
	
	
	void mover(String _piso) {
		piso=-1;
		for(int i = 0;i<total.length;i++) {
			if(total[i].equalsIgnoreCase(_piso)) {
				piso = i;
			}
		}
		if(piso==-1) {
			System.out.println("Fin del recorrido (Piso no valido)");
		}else
//		System.out.println(total[actual]);
//		System.out.println(total[piso]);
		if(piso==actual) {
			System.out.println("Estoy en su piso");
		}else if(actual>piso) {
			for(int i = actual; i>=piso;i-- ) {
				
				if(i==piso) {
					System.out.println("Estoy en su piso "+total[i]);
				}else {
					System.out.println("Piso "+total[i]+" --- Bajando");
				}
			}
			
		}else{
			for(int i = actual; i<=piso;i++ ) {
				if(i==piso) {
					System.out.println("Estoy en su piso "+total[i]);
				}else {
					System.out.println("Piso "+total[i]+" --- Subiendo");
				}
			}
			
		}
		
		
	}
	
	void activar() {
		while(piso!=-1){
			System.out.println();
			System.out.println("-------------------ASCENSOR------------------------");
			System.out.println();
			Edificio();
			System.out.println("El Ascensor esta en el piso "+total[actual]);
			Persona Pe = new Persona();
			String _piso = Pe.llamar();
			mover(_piso);
			actual = piso;
		}
	}

}
