/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textovesoubory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Stanislav Vyhlídal
 */
public class TextoveSoubory {

  
    public static void main(String[] args) {
        //zapis do souboru
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt")))
        {
            bw.write("První řádek");
            bw.newLine();
            bw.write("Tento text je na druhém řádku");
            bw.newLine();
            bw.write("A do třetice.");
            bw.newLine();
            bw.flush();
            System.out.println("Do souboru bylo zapsáno");
            
        }
        catch(Exception e)
                {
                System.err.println("Do souboru se nepovedlo zapsat"); //err by měl vypsat červený text 
                }
        //zapis do existujícího souboru
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt",true)))
        {
           bw.write("Připsaný řádek");
           bw.newLine();
           bw.flush();
           System.out.println("Do souboru bylo připsáno");
            
        }
        catch(Exception e)
                {
                System.err.println("Do souboru se nepovedlo zapsat"); //err by měl vypsat červený text 
                }
        //vypsani souboru
        System.out.println("vypisuji celý soubor");
        try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt")))
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
    
    

