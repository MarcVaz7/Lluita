/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_1;
import java.util.Scanner;
/**
 *
 * @author Xavier
 */
//2000

public class Practica_1{
public static void main (String[] args){
        int[] num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            String[] personatge = new String[]{"Son Goku", "Vegetta", "Broly Supersaiyan 3 Legendario", "Son Gohan", "Gogeta", "Cell forma perfecta", "Saibaman", "Kid Buu", "Freezer 3ª forma", "Piccolo"};
            String[] PJoriginal = new String[personatge.length]; //Array copia de "personatge" amb la longitud de l'orignal, per si en un futur s'afegissin personatges
        int[] vida = new int[]{3000, 2500, 9000, 1500, 6050, 3500, 50, 2250, 2000, 2100};
        int[] atac = new int[]{100, 110, 1000, 75, 450, 250, 5, 500, 165, 70};
            String[] nom_atac = new String[]{"Kaio-ken", "Cañón Galik", "Cañón Borrador", "Ataque Explosivo", "Kamehameha", "Fuego Rápido", "Ácido", "Rayo de Desaparición", "Golpe del Torbellino", "Kaikosen"};
        int[] atacsp = new int[]{600, 500, 2500, 350, 1600, 800, 300, 1200, 700, 325};
            String[] nom_atacsp = new String[]{"Genki-dama", "Big Bang", "Omega Gigantesco", "Kamehameha", "Big Bang Kamehameha", "Super Kamehameha", "Bomba Saibaman", "Explosión Planetaria", "Rayo de Dedo Loco", "Hiper Onda de Demonio Explosiva"};
        int[] def = new int[]{200, 100, 1000, 80, 400, 350, 20, 300, 300, 70};
            Scanner esc = new Scanner(System.in);
    String reset = "\u001B[0m"; //Aquesta variable torna el text d'un print al seu color per defecte.
    String groc = "\u001B[33m"; //Aquesta variable otorga el color groc a un print.
    String vermell = "\u001B[31m"; //Aquesta variable otorga el color vermell a un print.
    String blanc = "\u001B[37m"; //Aquesta variable otorga el color blanc a un print.
    String Bmagenta = "\u001B[45m"; //Aquesta variable otorga el color magenta al fons del text a un print.
    String Bverd = "\u001B[42m"; //Aquesta variable otorga el color verd al fons del text a un print.
    int escull, escullp, escullp2,escullA1, escullA2,atac1, atac2, atacsp1, atacsp2, stat1, stat2, count; //Diverses variables per a escollir les diferents opcions del programa.    
    boolean exit0, exit1, exit2, exit3; //Les variables boolean són per a sortir del loop//
    exit1 = true; //Per sortir del loop de l'opció 1 "Veure un personatge"
    exit0 = true; //Per sortr del loop del "menu principal"
    exit2 = true; //Per sortir del loop de l'opció 2 "Lluita de personatges"
    exit3 = true;
    count = 3;
    String cons,cons0,cons2, resp;
while (exit0 == true){    
    do{
            System.out.println("Benvingut al programa de " + groc + " Dragon " + reset + vermell + " Ball" + reset);
            System.out.println("A continuació digues el que deistjes fer:");
            System.out.println("1 - Veure un personatge.");
            System.out.println("2 - Lluita de personatges."); //Aquests cinc sout són per a que l'usuari sàpiga quines opcions té dins el programa// 
            System.out.println("3 - Encerta el personatge.");
        while (!esc.hasNextInt()) { //Amb aquest while i el corresponent HasNextInt() establim que si l'usuari introdueix alguna cosa que no és un número la build es podra seguir comletant, només s'escriurà un missatge d'error
                System.out.println(vermell + "Introdueix un número vàlid." + reset);
                esc.nextLine(); //Netejem el buffer amb el valor incorrecte
                }    
    escull = esc.nextInt(); //Aquest int serveix per a que l'usuari decideixi l'opció que vol utilitzar//
switch (escull){
    case 1:
            System.out.println("Benvingut a la visualització de personatges.");
            System.out.println("A continuació veuràs els personatges disponibles:");
            for (int i = 0; i < personatge.length; i++){
                System.out.println(num[i] + " - " + personatge[i]);} //Aquest for serveix per a ensenyar els noms dels personatges els quals pot escollir l'usuari//
            while (exit1 == true){//Aquest while serveix per a permetre tornar a fer una seleció diferent de personatge. Mentres el boolean sigui true es podran fer més consultes//
            do{
            System.out.println("Escull el personatge del que vulguis veure les estadísitques: ");
              
            while (!esc.hasNextInt()){//while que serveix per a evitar la parada del programa en cas que l'usuari no escrigui un número
                    System.out.println(vermell + "Introdueix un número vàlid." + reset);
                    esc.nextLine();}//Netejem el buffer en el cas que l'usuari escrigui una lletra o paraula, sino el while de sota es faria dues vegades  
                escullp = esc.nextInt(); //CORREGIR A LES VOLTES POSTERIORS QUE SI S'ESCRIU UNA LLETRA NO DIU QUE ESTIGUI MALAMENT                
                if (escullp >= 0 && escullp <= 9){ //Amb aquest if diem que si el valor introduït està entre 0 i 9, ensenyi els valors corresponenets al número de les arrays fetes//
                System.out.println("*************************************************************************************");
                    System.out.println("Nom: " + personatge[escullp]);
                    System.out.println("Vida: " + vida[escullp]);
                    System.out.println(nom_atac[escullp] + ": " + atac[escullp]);
                    System.out.println(nom_atacsp[escullp] + ": " + atacsp[escullp]);
                    System.out.println("Defensa: " + def[escullp]);
                System.out.println("*************************************************************************************");}
                else if (escullp < 0 || escullp > 9)
                {System.out.println(vermell + "El número de personatge introduït no és correcte." + reset);
                    System.out.println("=============================================================");} //En cas contrari i que el valor introduït no estigui dins el varem establert abans, doncs donarà l'opció de tornar a introduïr el número//
            }while(escullp < 0 || escullp > 9);// do-while que permet tornar a seleccionar un personatge en cas que no s'escrigui un valor entre 0 i 9
                esc.nextLine();//Important netejar el buffer quan es passa de numero a lletra amb un Scanner//
        do{ System.out.println("Vols fer una altre consulta de personatge?");
                cons = esc.nextLine();
                 if(!cons.equalsIgnoreCase("si") && !cons.equalsIgnoreCase("no")){
                    System.out.println(vermell + "Resposta incorrecta. Respon amb si o no." + reset);
                     System.out.println("==========================================");}
            } while (!cons.equalsIgnoreCase("si") && !cons.equalsIgnoreCase("no"));
        //En aquest cas fem servir un "do-while" per a fer un loop amb els continguts de "l'exit". Dintre del "do" establim que sempre s'imprimirà la 
        //pregunta per fer una altre consulta, posteriorment es demana a l'usuari una resposta, si aquesta és diferent a si o no s'imprimeix un missatge
        //on diu que esta mal fet; posteriorment es torna a fer el "do", ja que en el "while" hem determinat que si l'string es diferent a si o no es torna a fer el "do" 
                if(cons.equalsIgnoreCase("No")){
                exit1 = false;//En el cas que es digui que no, el valor boolean d'exit canviarà per a que no entri més al while//
                }
            }
            exit1 = true;
            escullp = 0; //En aquest cas netejem les dos variables, tant "exit1" com "escullp" per a que funcioni les posteriors voltes del loop.
            break;
    case 2:
        while (exit2 == true){ //Loop per a sortir del case 2   
            System.out.println("Benvingut a la lluita de personatges.");
            System.out.println("A continuació veuràs els personatges disponibles:");
             for (int i = 0; i < personatge.length; i++){
                System.out.println(num[i] + " - " + personatge[i]);} //Loop for per a veure tots els valors de l'array personatge segons la variable i        
        do{
            System.out.println("Escull el primer personatge amb el que lluitaràs: ");
                while (!esc.hasNextInt()){
                    System.out.println(vermell + "Introdueix un número vàlid." + reset);
                    esc.nextLine();} //while que permet al programa no parar el seu funcionament en cas que s'escrigui una lletra en un nextInt();
                escullp = esc.nextInt(); //Variable on l'usuari determina quina posició de l'array voldra fer servir
            if (escullp >= 0 && escullp <= 9){ //Bifurcació per a definir que si el valor està entre 0 i 9, aquests inclosso, ens doni el nom del personatge en la posició "escullp"
                    System.out.println("Personatge seleccionat: ");
                System.out.println("*************************************************************************************");
                    System.out.println("P1: " + personatge[escullp]);
                System.out.println("*************************************************************************************");}            
            else if (escullp < 0 || escullp > 9){ //Segona part de la bifurcació on diem que si l'usuari ha donat un número que no es troba entre 0 i 9 digui que el personatge no està disponible
                System.out.println(vermell + "El personatge introduït no esta disponible." + reset);
            System.out.println("=============================================================");}
        }while(escullp < 0 || escullp > 9); //do-while que serveix per a, que en cas de que l'usuari hagi introduït un número que no està entre 0 i 9, aquest pugui escriure un de nou
            do{
                System.out.println("Escolleix un atac dels dos disponibles d'en " + personatge[escullp]);
                    System.out.println("1 - " + nom_atac[escullp] + ": " + atac[escullp]);
                    System.out.println("2 - " + nom_atacsp[escullp] + ": " + atacsp[escullp]);//Souts que serveixen per a indicar els atacs que corresponen al valor "escullp"
                    while (!esc.hasNextInt()) {
                    System.out.println(vermell + "Introdueix un número vàlid." + reset);
                    esc.nextLine(); // Consume the invalid input
                    }
                escullA1 = esc.nextInt(); //Variable on l'usuari pot donar un valor que equival a un dels dos atacs
            if (escullA1 == 1){ //Com que hi ha diferents tipus d'atac, aquest if el que fa és que si l'usuari ha escrit el úmero 1 l'equivalencia a l'array és la de l'atac 
                System.out.println("Atac seleccionat: ");
            System.out.println("*************************************************************************************");    
                System.out.println(nom_atac[escullp] + ": " + atac[escullp]);
            System.out.println("*************************************************************************************");}   
            else if (escullA1 == 2){//Com que hi ha diferents tipus d'atac, aquest else if el que fa és que si l'usuari ha escrit el úmero 1 l'equivalencia a l'array és la de l'atacsp
                System.out.println("Atac seleccionat: ");
            System.out.println("*************************************************************************************");    
                System.out.println(nom_atacsp[escullp] + ": " + atacsp[escullp]);
            System.out.println("*************************************************************************************");}
            else if (escullA1 != 1 || escullA1 != 2){ //En el cas que l'usuari no escrigui un valor entre 1 i 2 s'entrarà en aquest else if i es dirà que l'atac és incorrecte.
                System.out.println(vermell + "Valor de l'atac incorrecte" + reset);
            System.out.println("=============================================================");}
            }while(escullA1 != 1 && escullA1 != 2); //Aquest do-while el que fa es permetre a l'usuari escriure un altre valor referent a 'atac disponible, en cas que s'escrigui un numero erroni.
            atac1 = atac[escullp];
            atacsp1 = atacsp[escullp]; //Treiem les variables finals dels atacs, per a fer-les srvir posteriorment
            System.out.println("Personatges disponibles: ");
            for (int i = 0; i < personatge.length; i++){
                System.out.println(num[i] + " - " + personatge[i]);} //For utilitzat per a mostrar els personatges amb el número corresponent
        do{
                do{
            System.out.println("Escull el segon personatge amb el que lluitaràs: ");
                while (!esc.hasNextInt()) {
                    System.out.println(vermell + "Introdueix un número vàlid." + reset);
                    esc.nextLine(); // Consume the invalid input
                }
            escullp2 = esc.nextInt(); //Variable per a que l'usuari escolleixi el personatge. Aquest serà el valor de l'array utilitzat per aquesta part del programa.
            if (escullp2 == escullp){ //Bifurcació per a definir que si el valor introduït prèviament a "escullp2" ja ha sigut seleccionat per "escullp" digui que no es possible.
                System.out.println(vermell + "El personatge escollit ja està en ús." + reset);
                System.out.println("=============================================================");}
                }while(escullp2 == escullp); //do-while que serveix per a que en cas que es seleccioni el mateix valor de l'array en "escullp2" que en "escullp" es pugui tornar a escriure un valor diferent
            if (escullp2 >= 0 && escullp2 <= 9){//Bifurcació per a definir que si el valor  0 i 9, aquests inclosso, ens doni el nom del personatge en la posició "escullp2"
                System.out.println("Personatge seleccionat: ");
            System.out.println("*************************************************************************************");    
                System.out.println("P2: " + personatge[escullp2]);
            System.out.println("*************************************************************************************");}
            else if (escullp2 < 0 || escullp2 > 9){//Segona part de la bifurcació on diem que si l'usuari ha donat un número que no es troba entre 0 i 9 digui que el personatge no està disponible
                System.out.println(vermell + "El personatge introduït no esta disponible." + reset);
            System.out.println("=============================================================");}
        }while(escullp2 < 0 || escullp2 > 9);//do-while que serveix per a, que en cas de que l'usuari hagi introduït un número que no està entre 0 i 9, aquest pugui escriure un de nou
            do{
                System.out.println("Escolleix un atac dels dos disponibles d'en " + personatge[escullp2]);
                    System.out.println("1 - " + nom_atac[escullp2] + ": " + atac[escullp2]);
                    System.out.println("2 - " + nom_atacsp[escullp2] + ": " + atacsp[escullp2]);//Souts que serveixen per a indicar els atacs que corresponen al valor "escullp2"
                    while (!esc.hasNextInt()) {
                    System.out.println(vermell + "Introdueix un número vàlid." + reset);
                    esc.nextLine(); // Consume the invalid input
                    }
                    escullA2 = esc.nextInt(); //Variable on l'usuari pot donar un valor que equival a un dels dos atacs
            if (escullA2 == 1){ //Com que hi ha diferents tipus d'atac, aquest if el que fa és que si l'usuari ha escrit el úmero 1 l'equivalencia a l'array és la de l'atac 
                System.out.println("Atac seleccionat: ");
            System.out.println("*************************************************************************************");    
                System.out.println(nom_atac[escullp2] + ": " + atac[escullp2]);
            System.out.println("*************************************************************************************");}
            else if (escullA2 == 2){ //Com que hi ha diferents tipus d'atac, aquest else if el que fa és que si l'usuari ha escrit el úmero 1 l'equivalencia a l'array és la de l'atacsp
                System.out.println("Atac seleccionat: ");
            System.out.println("*************************************************************************************");    
                System.out.println(nom_atacsp[escullp2] + ": " + atacsp[escullp2]);
            System.out.println("*************************************************************************************");}
            else if (escullA2 != 1 || escullA2 != 2){ //En el cas que l'usuari no escrigui un valor entre 1 i 2 s'entrarà en aquest else if i es dirà que l'atac és incorrecte.
                System.out.println(vermell + "Valor de l'atac incorrecte" + reset);
            System.out.println("=============================================================");}
            }while(escullA2 != 1 && escullA2 != 2); //Aquest do-while el que fa es permetre a l'usuari escriure un altre valor referent a 'atac disponible, en cas que s'escrigui un numero erroni.          
            atac2 = atac[escullp2];
            atacsp2 = atacsp[escullp2]; //Treie les variables equivalents a l'atac i l'atacsp amb el valor de l'array assignat a "escullp2"
            System.out.println(blanc + Bmagenta + "COMENÇA EL COMBAT" + reset);
        if (escullA1 == 1 && escullA2 == 1){ //Bifurcació que serveix per a determinar que si el valor d'escullA1 és 1 i el valor d'esculA2 és 1 es faci el contingut d'aquest
            stat1 = vida[escullp] + def[escullp] - atac2;
            stat2 = vida[escullp2] + def[escullp2] - atac1; //Dos variables que serveixen per a determinar els punts finals dels dos presonatges seleccionats amb les equivalencies de les arrays.
                if (stat1 > stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si el primer valor és més gran que el segon, el guanyador és el primer lluitador
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "P1: " + personatge[escullp] + reset);
                    System.out.println("*************************************************************************************");}
                else if (stat1 < stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si el segon valor és més gran que el primer, el guanyador és el segon lluitador
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "P2:" + personatge[escullp2] + reset);
                    System.out.println("*************************************************************************************");}
                else if (stat1 == stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si els dos números són iguals, és empat.
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "EMPAT" + reset);
                    System.out.println("*************************************************************************************");}
        }
        else if (escullA1 == 2 && escullA2 == 1){ //Bifurcació que serveix per a determinar que si el valor d'escullA1 és 2 i el valor d'esculA2 és 1 es faci el contingut d'aquest
            stat1 = vida[escullp] + def[escullp] - atac2;
            stat2 = vida[escullp2] + def[escullp2] - atacsp1; 
                if (stat1 > stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si el primer valor és més gran que el segon, el guanyador és el primer lluitador
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "P1: " + personatge[escullp] + reset);
                    System.out.println("*************************************************************************************");}
                else if (stat1 < stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si el segon valor és més gran que el primer, el guanyador és el segon lluitador
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "P2:" + personatge[escullp2] + reset);
                    System.out.println("*************************************************************************************");}
                else if (stat1 == stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si els dos números són iguals, és empat.
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "EMPAT" + reset);
                    System.out.println("*************************************************************************************");}
        }
        else if (escullA1 == 1 && escullA2 == 2){ //Bifurcació que serveix per a determinar que si el valor d'escullA1 és 1 i el valor d'esculA2 és 2 es faci el contingut d'aquest
            stat1 = vida[escullp] + def[escullp] - atacsp2;
            stat2 = vida[escullp2] + def[escullp2] - atac1;
                if (stat1 > stat2){System.out.println("El guanyador del combat és...");
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "P1: " + personatge[escullp] + reset); //Bifurcació que serveix per a dir que si el primer valor és més gran que el segon, el guanyador és el primer lluitador
                    System.out.println("*************************************************************************************");}
                else if (stat1 < stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si el segon valor és més gran que el primer, el guanyador és el segon lluitador
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "P2:" + personatge[escullp2] + reset);
                    System.out.println("*************************************************************************************");}
                else if (stat1 == stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si els dos números són iguals, és empat.
                    System.out.println("*************************************************************************************");
                        System.out.println(Bverd + "EMPAT" + reset);
                    System.out.println("*************************************************************************************");}
        }
        else if (escullA1 == 2 && escullA2 == 2){ //Bifurcació que serveix per a determinar que si el valor d'escullA1 és 2 i el valor d'esculA2 és 2 es faci el contingut d'aquest
            stat1 = vida[escullp] + def[escullp] - atacsp2;
            stat2 = vida[escullp2] + def[escullp2] - atacsp1;
                if (stat1 > stat2){System.out.println("El guanyador del combat és...");
                System.out.println("*************************************************************************************");
                    System.out.println(Bverd + "P1: " + personatge[escullp] + reset); //Bifurcació que serveix per a dir que si el primer valor és més gran que el segon, el guanyador és el primer lluitador
                System.out.println("*************************************************************************************");}
                else if (stat1 < stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si el segon valor és més gran que el primer, el guanyador és el segon lluitador
                System.out.println("*************************************************************************************");
                    System.out.println(Bverd + "P2:" + personatge[escullp2] + reset);
                System.out.println("*************************************************************************************");}
                else if (stat1 == stat2){System.out.println("El guanyador del combat és..."); //Bifurcació que serveix per a dir que si els dos números són iguals, és empat.
                System.out.println("*************************************************************************************");
                    System.out.println(Bverd + "EMPAT" + reset);
                System.out.println("*************************************************************************************");}
        }
        esc.nextLine(); //Neteja de buffer pel pas de int a string.
            do{System.out.println("Vols fer una altre lluita de personatges?");
                cons2 = esc.nextLine();
                 if(!cons2.equalsIgnoreCase("si") && !cons2.equalsIgnoreCase("no")){
                    System.out.println(vermell + "Resposta incorrecta. Respon amb si o no." + reset);
                    System.out.println("==========================================");}
            }while (!cons2.equalsIgnoreCase("si") && !cons2.equalsIgnoreCase("no")); //do-while que serveix per a tornar a escriure si o no en cas que l'usuari hagi escrit algo que no és ni si ni no.
                if(cons2.equalsIgnoreCase("No")){
                exit2 = false;//En el cas que es digui que no, el valor boolean d'exit canviarà per a que no entri més al while//
                    System.out.println("Gràcies per jugar al combat de personatges de " + groc + " Dragon " + reset + vermell + " Ball!" + reset);
                }       
        }
        escullp = 0;
        escullp2 = 0;
        exit2 = true; //Varibles que serveixen per a netexar els valors d'aquestes
         break;
    case 3:        
        esc.nextLine(); //Com es passa de int a String, s'ha de netejar el buffer
        while(exit3 == true){
            //En primer lloc copiarem el contingut de l'array "personatge" en un array per a posteriorment poder tornar l'array "personatge" al seu estat original i així poder fer tantes voltes com vulguem al programa
        for (int i = 0; i < PJoriginal.length; i++) {
            PJoriginal[i] = personatge[i];          
        }
            System.out.println("********************************************");
        System.out.println("Endevina de quin personatge es tracta: ");
        System.out.println("Intents: " + count);
            System.out.println("********************************************");
        int rdmIndex = (int) (Math.random() * num.length); //Amb aquesta variable el que aconseguim es que un valor de l'array "num" es transformi en un altre numero; aixo s'aconsegueix generant un numero aleatori entre 0.0 i 1.0 i multiplicant aquest per la longitud de l'array "num". Una vegada fet aixó treiem els deimals amb "(int)".
        int rdmNum = num[rdmIndex]; //Declarem que aquesta variable és el valor de l'array "num" en la posició que hem aconseguit amb la variable anterior.
        String nordm = personatge[rdmNum]; //Variable que serveix per escollir una paraula aleatoria de l'array "personatge"
        
        //Alterem l'ordre de les lletres que componen l'array "personatge"
        for (int i = 0; i < personatge.length; i++){
            char[] pj = personatge[i].toCharArray(); //Amb aixo fem que l'array "personatge" passi a ser un char i per tant, sigui modificable.
            for (int j = 0; j < pj.length -1; j++){
                int index = (int) (Math.random() * (pj.length)); //Aquesta variable serveix per a aconseguir un valor aleatori; exactament igual que en la variable anterior
                char rdm = pj[j]; //Variable a la que posteriorment se li donarà el valor de l'array amb lletres alterades; 
                pj[j] = pj[index];
                pj[index] = rdm; //Canvis que serveixen per a randomitzar l'ordre de les lletres.
            }
            personatge[i] = new String(pj); // Declarem el nou contingut randomitzat de l'array "personatge"
        }
        System.out.println(personatge[rdmNum]); //Print del nom del personatge alterat        
        do{ resp = esc.nextLine(); //Per a que escrigui la resposta l'usuari
        if (!resp.equalsIgnoreCase(nordm)){ //Bifurcació on si la resposta donada per l'usuari no és correcta es farà tot el que hi ha dins el "if"            
            count--; //Si s'entra en aquest "if" es resta 1 al valor de "count"
            if(count == 0){System.out.println("==========================================");
            System.out.println(vermell + "Ja no et queden intents." + reset); //Si el valor de count arriba a 0, s'imprimirà el missatge i "exit3" passarà a ser false per a sortir del loop
                System.out.println("El personatge era " + Bverd + PJoriginal[rdmNum] + reset);
            System.out.println("==========================================");
            exit3 = false;}
            if(count >= 1 && count <=3){//Mentres el valor de count sigui entre 1 i 3 es realitzara el contingut d'aquest  "if"
                    System.out.println("==========================================");
                System.out.println(vermell + "Error, torna a pensar quin personatge és." + reset);
                System.out.println("Et queden " + vermell + count + reset + " intents.");
                    System.out.println("==========================================");}            
        }else{System.out.println("********************************************");
            System.out.println(Bverd + "Enhorabona, has endevinat el personatge!" + reset);
        exit3 = false;}
        }while(!resp.equalsIgnoreCase(nordm) && count >= 1 && count <=3); // Bucle "do-while" per a que si l'usuari s'equivoca pugui torar a escriure una respossta
}
        exit3 = true; //Retornem el valor de "exit3" a true per poder fer voltes al bucle
        for (int i = 0; i < personatge.length; i++) {
            personatge[i] = PJoriginal[i];} //Cal des aleatoritzar l'array "personatge" per a poder fer infinites voltes al loop.
        count = 3; //Tornem el valor de "count" al seu original per a que el contador funcioni en futures voltes del bucle
        break; 
}
    
     if (escull < 1 || escull > 3){System.out.println(vermell + "L'opció introduïda no existeix, introdueix un valor entre 1 i 3." + reset);
        System.out.println("==========================================");}
    }while(escull < 1 || escull > 3); //Amb aquest do-while que engloba tot el codi del programa, permetem, que si l'usuari introdueix un numro que no estigui entre 1 i 3, el propi programa avisarà de que aquell número està malament i donarà l'opció d'escriure'n un de nou.
   
    do{System.out.println("Vols fer servir un altre opció del programa?");
    cons0 = esc.nextLine();
    if (!cons0.equalsIgnoreCase("si") && !cons0.equalsIgnoreCase("no")){
        System.out.println(vermell + "Resposta incorrecta. Respon si o no." + reset);
        System.out.println("==========================================");}
    }while(!cons0.equalsIgnoreCase("si") && !cons0.equalsIgnoreCase("no"));//Amb aquesta variable do-while permetem que a l'usuari //Amb aquesta variable do-while permetem que a l'usuari se li pregunti si vol utilitzar una altre funcionalitat del programa. En el cas que no contesti si o no es donara un missatge d'error
    if (cons0.equalsIgnoreCase("no")){
        System.out.println("Gràcies per fer servir el programa de " + groc + " Dragon " + reset + vermell + " Ball!" + reset);
        exit0 = false;}//Amb aquest if s'indica al programa que ha de "sortir" d'aquest mateix.
}
}
}