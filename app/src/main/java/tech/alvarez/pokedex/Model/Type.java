package tech.alvarez.pokedex.Model;

public class Type {
    private int slot;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public TypeX getType() {
        return types;
    }

    public void setType(TypeX type) {
        this.types = type;
    }

    private TypeX types;
}
