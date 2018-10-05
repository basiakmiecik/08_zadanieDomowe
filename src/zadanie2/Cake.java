package zadanie2;

public class Cake {
    private String name;
   private boolean cream;
    private int count;

    public Cake(String name, boolean cream, int count) {
        this.name = name;
        this.cream = cream;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Cake))
            return false;
        Cake other = (Cake) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (cream != other.cream)
            return false;
        if (count != other.count)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ciastko: {name= " + getName() + ", cream= " + isCream() + ", count= " + getCount() + "}";
    }
}
