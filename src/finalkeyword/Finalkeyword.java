/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalkeyword;

import java.util.Date;

public class Finalkeyword {

    public static void main(String[] args) {
        final double PI = 3.14;
        
        Pracownik p = new Pracownik();
        
        System.out.println(p.dataZatrudnienia);
    }
    
}

abstract class Osoba
{
    
}

class Pracownik extends Osoba
{
    Pracownik()
    {
        this.dataZatrudnienia = new Date();
    }
    
    Pracownik(Date data)
    {
        this.dataZatrudnienia = data;
    }
    
    final Date getDataZatrunienia()
    {
        return this.dataZatrudnienia;
    }
    
    final Date dataZatrudnienia;
}

class Programista extends Pracownik
{
    
}