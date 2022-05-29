public class numeroReverso {


    public static void numeroReverso (){
    Scanner scan = new Scanner(System.in);
  do {  // Recibi o num atraves do tc  atraves do scn e transformei numa string

   System.out.println("Irforme um valor inteiro e positivo (esse número deverá conter 4 dígitos): ");
 int numeroInformado = scan.nextInt(); 
String numeroInformadoString  = String.valueOf(numeroInformado); // para poder colocar esse nm em reverso é necessario fazer essa string
if(numeroInformado >= 1000 && numeroInformado <= 9999) {
StringBuilder StringBuilder = new StringBuilder(numeroInformadoString);
System.out.println(StringBuilder.reverse());


  }
   }  while(True);
  }
}

//StringBuilder.reverse é o transforma o nm
