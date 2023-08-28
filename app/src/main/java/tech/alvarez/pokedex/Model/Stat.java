package tech.alvarez.pokedex.Model;

public class Stat {
    private int base_stat;
    private int effort;

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public StartX getStat() {
        return stat;
    }

    public void setStat(StartX stat) {
        this.stat = stat;
    }

    private StartX stat;
}
