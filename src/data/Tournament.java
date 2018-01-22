/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.TreeSet;

/**
 *
 * @author schueler
 */
public class Tournament {
    private String location;
    private double price;
    TreeSet<Player> participants = new TreeSet<Player>();
    TreeSet<Match> schedule = new TreeSet<Match>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TreeSet<Player> getParticipants() {
        return participants;
    }

    public TreeSet<Match> getSchedule() {
        return schedule;
    }

    public void setSchedule(TreeSet<Match> schedule) {
        this.schedule = schedule;
    }

    

    @Override
    public String toString() {
        return "Tournament{" + "location=" + location + ", price=" + price + ", participants=" + participants + '}';
    }
    
    
    
}
