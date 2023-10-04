/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_olutchi;

/**
 *
 * @author PC
 */
public class TP1_guessMyNumber_OLUTCHI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random(); 
      
      for (int i = 0; i < 5; i++ )
      {
          int n = generateurAleat.nextInt(101);
          System.out.println(n);
      }
      
      
      int n = generateurAleat.nextInt(101);
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("saisissez un nombre");
      int entier;
      entier = sc.nextInt();
      int compteur = 0;
      
      while (entier != n)
      {
      compteur++;
      System.out.println("tentatives :" + compteur);
      if (n > entier)
      {
          System.out.println("trop petit");
      }
      else {
          System.out.println("trop grand");
      }
      System.out.println("saisissez un nombre");
      entier = sc.nextInt();
      }

    }
    
}
