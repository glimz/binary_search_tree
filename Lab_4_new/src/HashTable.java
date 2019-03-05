/*
import java.util.Objects;

public class HashTable<Key, Value> {

	private int M;
	private Value[] values; 
	private Key[] keys;

	public HashTable(int M) {
		// TODO Auto - generated constructor stub
		this.M = M;
		this.values = (Value[]) new Object[this.M];
		this.keys = (Key[]) new Objects[this.M];
	}

	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % this.M;
	}

	public void put(Key key, Value value) {
		int keyHash = key.hashCode();
		this.keys[hash(key)] = key;
		values[hash(key)] = value;
	}

	public Value get(Key key) {
		int KeyHash = key.hashCode();
		return values[hash(key)];
	}

	
	
public boolean isColliding(Key key) {
		
		if (this.keys.equals(key)) {
			return false;
		}
		return true;

	}
}
*/

public class HashTable<Key, Value> {
    private int M ;
    private Value [] values;
    private Key[] keys;
    
    
    public HashTable(int m){
        this.M = m;
        this.values =  (Value[]) new Object [M];
        this.keys =  (Key[]) new Object [M];
    }
    
    private int hash(Key key) {
       
        return (key.hashCode()& 0x7fffffff) % M;
        
    }
    public void put(Key key, Value value){
        keys [hash(key)] = key;
        values [hash(key)] = value;
    
    }
    public Value get(Key key){
        return values[hash(key)];
    }
    
    public boolean isColliding(Key key){
            
            if ((this.keys[hash(key)]==null) || (this.keys[hash(key)].equals(key))){           
                return false;
            }                  
        return true;
    }
}