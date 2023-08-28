package pokemonGo.Ramos.junior.Model;

import java.security.PrivateKey;

public class Ability {
    private Abilityx abilityx ;
    private Boolean is_hidden;

    public Abilityx getAbilityx() {
        return abilityx;
    }

    public void setAbilityx(Abilityx abilityx) {
        this.abilityx = abilityx;
    }

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    private int slot;
}
