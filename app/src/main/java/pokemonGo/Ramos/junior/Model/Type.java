package pokemonGo.Ramos.junior.Model;

public class Type {
    private int slot;
    public TypeX type;

    public TypeX getTypes() {
        return type;
    }

    public void setTypes(TypeX types) {
        this.type = types;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "Types [slot=" + slot + ", types=" + type + "]";
    }
}
