/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author Utsav Chadha
 */
public class Victim {
     String victimName;
    Integer victimAge;
      ArrayList <Victim> victims= new ArrayList<Victim>();

    public ArrayList<Victim> getVictims() {
        return victims;
    }

    public void setVictim(ArrayList<Victim> victims) {
        this.victims = victims;
    }
    public void addVictim(Victim c)
    {
        victims.add(c);
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public Integer getVictimAge() {
        return victimAge;
    }

    public void setVictimAge(Integer childAge) {
        this.victimAge = victimAge;
    }
}
