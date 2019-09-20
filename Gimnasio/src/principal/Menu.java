package principal;

	import java.util.Scanner;
	import metodosusados.MetodosUsados;
	public class Menu {
		public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Escribe el usuario");
	String nombre=scan.next();
	System.out.println("Escribe la contraceña");
	String clave=scan.next();
	if (nombre.equals("ADM")&&clave.equals("ADM123"))
	{System.out.println("Admin bienvenido");
	System.out.println("MENU:\n1. Insertar socio\n2. Consultar datos del socio\n3. Consultar actividades\n4. Consultar horarios");
	char elige;
	do{ 
		System.out.println("Elige una opcion del menu");
	int opcionAdm=scan.nextInt();
		switch (opcionAdm){
	case 1:System.out.println("Escribe la fecha de nacimiento: dd/mm/yyyy");
	String FechaNac=scan.next();
	String DiaNac=FechaNac.charAt(0)+""+FechaNac.charAt(1);
	String MesNac=FechaNac.charAt(3)+""+FechaNac.charAt(4);
	String AnioNac=FechaNac.charAt(6)+""+FechaNac.charAt(7)+""+FechaNac.charAt(8)+""+FechaNac.charAt(9);
	MetodosUsados.InsertarFecha(DiaNac,MesNac,AnioNac);
	String DNI="1";
	while(DNI.length()!=9) {
	System.out.println("Inserta el DNI");
	DNI=scan.next();
	if (DNI.length()!=9) {System.out.println("Datos incorrectos");}
	}
	char letra;
	letra=DNI.charAt(8);
	MetodosUsados.InsertarDNI(DNI,letra);
	System.out.println("Inserta tu cuenta:");
	String Cuenta=scan.next();
	MetodosUsados.InsertarCuenta(Cuenta);break;
	case 2:System.out.println("Escribe ID de socio que quieres consultar los datos");
	int ids=scan.nextInt();
	//id de socio es 12345, se supone que solo hay un socio con este id
	MetodosUsados.Consultar(ids);break;
	case 3:MetodosUsados.Actividades();break;
	case 4:MetodosUsados.Horarios();break;
	}
		System.out.println("Quieres seguir con el menu? Y/N");
		elige=scan.next().charAt(0);}
		 while(Character.toUpperCase(elige)=='Y');
		if(Character.toUpperCase(elige)=='N') { System.out.println("Hemos terminado");}}
	//se supone que todos los socios tienen nombre y contraceña no mas larga que 10 caracteres
	else if((nombre.length()<=10)&&(clave.length()<=10))
	{System.out.println("Socio bienvenido");
	System.out.println("MENU:\n1. Consultar actividades\n2. Consultar horarios");
	int opcion='Y';
	do {
		System.out.println("Elige una opcion del MENU");
		opcion=scan.nextInt();
		switch (opcion) {
		case 1:MetodosUsados.Actividades();break;
		case 2:MetodosUsados.Horarios();break;}
	System.out.println("Quieres seguir con el menu? Y/N");
	opcion=scan.next().charAt(0);}
	while(Character.toUpperCase(opcion)=='Y');
	if(Character.toUpperCase(opcion)=='N') { System.out.println("Hemos terminado");}}
	else{System.out.println("Datos erroneos");}

	scan.close();
		


	}

}
