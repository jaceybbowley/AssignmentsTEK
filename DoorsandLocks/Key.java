package DoorsandLocks;

import java.util.UUID;

public class Key implements Cloneable, Comparable <Key> {

    public UUID key;
    private Keyshape shape = Keyshape.Unknown;


    // default constructor
    public Key(Key key2) {
        key = UUID.randomUUID();
        }

    public Key(Keyshape shape) {
        this(); // invokes default constructor
        this.shape = shape; 
        }

    // copy constructor
    public Key (original) {
        key = original.key;
        shape = original.shape;
         }

    public Keyshape shape() {
         return shape;
        }
        
    // original is *this*
    @Override
    public Object clone() {
        return new Key(this);
    }

    @Override
    public String toString() {
        return  Key [key=" + key + "]"; "
    }

    @Override
    public boolean equals(Object obj) {
        if (!getClass().isInstance(obj)) return false; 
     Key other =  (Key)obj;
        return key.equals(other.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public int compareTo Key o) {
        return key.compareTo(o.key);
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compareTo(Key o) {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
