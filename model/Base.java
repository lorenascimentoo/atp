package model;

public abstract class Base {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base compara = (Base) obj;

            if (this.id == compara.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "== ID: " + this.id;
    }

}