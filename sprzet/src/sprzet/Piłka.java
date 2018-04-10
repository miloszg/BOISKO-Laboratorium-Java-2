/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprzet;

public abstract class Piłka {
    protected int  promien;
    private static int liczbaUtworzonychPilek=0;
    
    public void setPromien(int promien){
        this.promien=promien;
    }
     
    Piłka(int p)
    {
        this.promien=p;
        liczbaUtworzonychPilek++;
    }
    
    public abstract float wysokoscOdbicia(float wysokoscPoczatkowa);
    
    public static int getliczbaUtworzonychPilek(){return liczbaUtworzonychPilek;}
    
}
