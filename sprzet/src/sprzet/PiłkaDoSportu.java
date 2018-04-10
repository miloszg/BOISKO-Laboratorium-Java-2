/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprzet;

import sport.Boisko;
import sport.Boisko.materialy;
        
public class PiłkaDoSportu extends Piłka {

    public float wspOdbicia;
    private Boisko.materialy materialy;
    
    public void setPromien(int promien){
        this.promien=promien;
    }
    public PiłkaDoSportu(int p,Boisko.materialy materialy, float wspOdbicia )
    {
        super(p);
        this.materialy=materialy;
        this.wspOdbicia=wspOdbicia;
    }
   
    public float wysokoscOdbicia(float wysokoscPoczatkowa)
    {
        return wysokoscPoczatkowa*this.promien*this.wspOdbicia;
    }

    public void powiekszPromien(int n)
    {
        promien+=n;
    }
    
    
}
