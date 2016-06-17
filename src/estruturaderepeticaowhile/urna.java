
package estruturaderepeticaowhile;

import java.util.Scanner;


public class urna {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            
            System.out.println("Urna Eletronica.");
            
            System.out.println("Candidato Trump - 1\nCandidato Hillary - 2\nCandidato Bernie - 3\nBranco - 0\nObs. Digite S p/ Sair.");
            
            int trump = 0, hillary = 0, bernie = 0, branco =0, nulo =0;
            char voto = 'z'; 
            
            while (voto !='s'){
            
                System.out.print("Qual candidato? ");
                voto = input.next().charAt(0);
                if (voto == '1'){
                trump++;
                }
                else if (voto == '2'){
                hillary++;
                }
                else if (voto == '3'){
                bernie++;
                }
                else if (voto == '0'){
                branco++;
                }
                else{
                nulo++;}
            }
            System.out.println("Quantidade de votos por candidato:\n"+
                    "\nTrump: "+trump+
                    "\nHillary: "+hillary+
                    "\nBernie: "+bernie+
                    "\nBrancos: "+branco+
                    "\nNulos: "+ (nulo-1));
    }
    
            
    
}
