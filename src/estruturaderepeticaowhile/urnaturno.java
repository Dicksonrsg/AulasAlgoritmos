
package estruturaderepeticaowhile;

import java.util.Scanner;

public class urnaturno {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int a=0, b=0, c=0, x=0, y=0, v=0;
String sair = "nao";
do {
System.out.print(
"----Votação----\n"
+ "1 - Candidato 1\n"
+ "2 - Candidato 2\n"
+ "3 - Candidato 3\n"
+ "0 - Branco\n"
+ "---------------\n"
+ "Voto: ");
v = entrada.nextInt();
switch(v) {
case 1:
a++;
break;
case 2:
b++;
break;
case 3:
c++;
break;
case 0:
x++;
break;
default:
y++;
}
System.out.print(
"---------------\n"
+ "SAIR? ");
sair = entrada.next();
} while (!sair.equalsIgnoreCase("sim"));
float p = (a/(a+b+c))*100;
System.out.println(p);
System.out.println(b/(a+b+c));
System.out.println(c/(a+b+c));
if ((a/(a+b+c))>0.5 || (b/(a+b+c))>0.5 || (c/(a+b+c))>0.5) {
System.out.println("Eleição decidida em PRIMEIRO TURNO!!!");
if (a>b && a>c) {
System.out.println("Vencedor -> Candidato 1");
} else if (b>a && b>c) {
System.out.println("Vencedor -> Candidato 2");
} else {
System.out.println("Vencedor -> Candidato 3");
}
} else {
System.out.println("Eleição vai para SEGUNDO TURNO!!!");
}
System.out.println(
"---Resultado---\n"
+ a + " - Candidato 1\n"
+ b + " - Candidato 2\n"
+ c + " - Candidato 3\n"
+ x + " - Branco\n"
+ y + " - Nulo\n"
+ "---------------\n");
}
    
}
