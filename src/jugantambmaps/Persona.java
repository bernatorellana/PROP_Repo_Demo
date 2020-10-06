
package jugantambmaps;

/**
 * La classe persona representa una persona.
 * @author bernat
 */
public class Persona implements Comparable<Persona> {

    private int id;
    private String nom;

    public Persona(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
/*
    @Override
    public int compareTo(Object unAltre) {
        // + si jo sóc el gran
        // 0 si jo sóc igual a Altre
        // - si jo sóc el petit
        return this.id - ((Persona)unAltre).id;
    }*/

    /**
     * ORDRE NATURAL de les persones
     * @param unAltre
     * @return 
     */
    @Override
    public int compareTo(Persona unAltre) {
        //return this.id - unAltre.id;        
        return this.nom.compareTo(unAltre.nom);
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + '}';
    }

    public void provaB(){
        
    }
    
}
