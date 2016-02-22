
package appka;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Stanislav Vyhlídal
 */
public class Appka {

  
 public static void main(String[] args)  {
     int cislo1=0;
     try (BufferedReader cteni = new BufferedReader(new FileReader("hry.txt")))
     {
     }
   catch(Exception e) {
       cislo1=-1;
     System.err.println("Soubor je prázdný");
   }
     
     
     if (cislo1 == -1) {
     System.out.println("Zadej pocet her, které chceš zapsat");
     Scanner ml = new Scanner(System.in);
     Scanner sc = new Scanner(System.in);
     int cislo=1;
     cislo=sc.nextInt();
     
     String []pole = new String[cislo];
     
     try (BufferedWriter zapis = new BufferedWriter(new FileWriter("hry.txt",true)))
     {
         for (int i=0;i<pole.length;i++) 
         {
             System.out.println("Zadej nazev " + (i+1) +". hry" );
             pole[i]=ml.nextLine();
             zapis.write(pole[i]);
             zapis.newLine();
             zapis.flush();
         }  
     }
   catch(Exception e) {
     System.err.println("Do souboru se nepovedlo zapsat");
   }
     }
     try (BufferedReader br = new BufferedReader(new FileReader("hry.txt")))
        {
            String s;
            while((s=br.readLine()) != null)
            {
                System.out.println(s);
            }
        }
        catch (Exception e)
        {
            System.err.println("Chyba při čtení souboru");
        }
 }
    
    
    
        }
    
    
    
    
    
        
    
    
