package metodosusados;

public class MetodosUsados {
	public static void InsertarFecha(String DiaNac, String MesNac, String AnioNac) {
		boolean valida=false;
		int anio=Integer.parseInt(AnioNac);
		int mes=Integer.parseInt(MesNac);
		int dia=Integer.parseInt(DiaNac);
		//System.out.println(dia+"/"+mes+"/"+anio);
		if ((2018-anio)<16){System.out.println("Tiene menos de 16 años y no puede usar este servicio");}
		if (anio<=2018&&anio>=0){
			switch (mes){
			case 4:
			case 6:
			case 9:
			case 11:if((dia>0)&&dia<=31) valida=true;break;
			case 2:if((dia>0)&&dia<=28) valida=true;break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:if((dia>0)&&dia<=30) valida=true;break;
			}}
			if (valida) {
			}
			else 
			{System.out.println("Es una fecha incorrecta");}	
			}
	public static void InsertarDNI(String DNI,char letra) {
		if(DNI.length()==9) {
			String dniEntera=DNI.substring(0,8);	
			int DNIEntera=Integer.parseInt(dniEntera)%23;
			char letraDNI='T';
		switch (DNIEntera){
		case 0:letraDNI='T';break;
		case 1:letraDNI='R';break;
		case 2:letraDNI='W';break;
		case 3:letraDNI='A';break;
		case 4:letraDNI='G';break;
		case 5:letraDNI='M';break;
		case 6:letraDNI='Y';break;
		case 7:letraDNI='F';break;
		case 8:letraDNI='P';break;
		case 9:letraDNI='D';break;
		case 10:letraDNI='X';break;
		case 11:letraDNI='B';break;
		case 12:letraDNI='N';break;
		case 13:letraDNI='J';break;
		case 14:letraDNI='Z';break;
		case 15:letraDNI='S';break;
		case 16:letraDNI='Q';break;
		case 17:letraDNI='V';break;
		case 18:letraDNI='H';break;
		case 19:letraDNI='L';break;
		case 20:letraDNI='S';break;
		case 21:letraDNI='K';break;
		case 22:letraDNI='F';break;
	default:System.out.println("ERROR");
		}
		if (letraDNI!=Character.toUpperCase(letra)) {System.out.println("Los datos de DNI son incorrectos");}
		}}
	public static void InsertarCuenta(String Cuenta) {
		if (Cuenta.length()!=23) {System.out.println("Los datos de la cuenta son incorrectos");}
			}
	public static void Consultar(int IdSocio) {
		if (IdSocio==12345) {
		String nombreS="Anna";
		String apellidoS="Savytska";
		String DNI="Y2790136C";
		System.out.println("Nombre\n"+nombreS+"\nApellido\n"+apellidoS+"\nDNI\n"+ DNI);	}
		else {System.out.println("No esxiste ningun socio con estos datos");}
	}
	public static void Actividades() {
		System.out.println("Actividades disponibles");
		System.out.println("Padel");
		System.out.println("Boxeo");
		System.out.println("Spinnig");
		System.out.println("Yoga");
		System.out.println("Pilates");
	}
	public static void Horarios() {
		System.out.print("Horario\t Lunes\t Martes Miercoles Jueves Viernes\n");
		System.out.print("08:00\t Pilates Yoga \t\t\t Boxeo\n");
		System.out.print("10:00\t Yoga \t Boxeo  Spinning\n");
		System.out.print("12:00\t Pilates Yoga   Spinning  Boxeo\n");
		System.out.print("19:00\t Pilates Yoga   Spinning  Padel  Boxeo\n");
		System.out.print("20:00\t Pilates Yoga\t \t \t Boxeo\n");
		System.out.println("*****");
		System.out.print("Horario\t 08:00\t 10:00\t 12:00\t 19:00\t 20:00\n");
		System.out.print("LUNES\t Pilates Yoga\t Pilates Pilates Pilates\n");
		System.out.print("MARTES\t Yoga \t Boxeo\t Yoga\t Yoga\t Yoga\n");
		System.out.print("MIERCOLES\t Spinning Spinning Spinning\n");
		System.out.print("JUEVES\t \t Boxeo\t Padel\n");
		System.out.print("VIERNES\t\t\t Boxeo\t Boxeo\t Boxeo\t \n");
	}
}

