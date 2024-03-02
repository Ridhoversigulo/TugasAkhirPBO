/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphismmakanan;

/**
 *
 * @author user
 */
public class PolimorphismMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu MN = new Menu();
        AyamGoreng AG = new AyamGoreng();
        AyamPenyet AP = new AyamPenyet ();
        Lele L = new Lele ();
        MieGoreng MG = new MieGoreng ();
        
        MN.tampiltharga();
        AG.tampiltharga();
        AP.tampiltharga();
        L.tampiltharga();
        MG.tampiltharga();
    }
    
}
