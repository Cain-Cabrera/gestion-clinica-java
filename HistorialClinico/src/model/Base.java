package model;
/**
 *
 * @author Cain
 */
public abstract class Base {
    private boolean eliminado;
    int id;

    public Base(boolean eliminado, int id) {
        this.eliminado = eliminado;
        this.id = id;
    }

    public Base() {
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
