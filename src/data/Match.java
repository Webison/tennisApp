/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.time.LocalDate;

/**
 *
 * @author schueler
 */
public class Match implements Comparable<Match>{
    private Player playerA;
    private Player playerB;
    private LocalDate date;
    private String result;

    public Match(Player playerA, Player playerB, LocalDate date) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.date = date;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match{" + "playerA=" + playerA + ", playerB=" + playerB + ", date=" + date + ", result=" + result + '}';
    }

    @Override
    public int compareTo(Match o) {
        int res = this.getDate().compareTo(o.getDate());
        if (res == 0)
            res = this.getPlayerA().compareTo(o.getPlayerA());
        if (res == 0)
            res = this.getPlayerB().compareTo(o.getPlayerB());
        return res;
    }
    
    
}
