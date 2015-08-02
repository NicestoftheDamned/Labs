package keypair;

public class KeyValuePair<K, V> {

	private K key;
	private V value;

	public KeyValuePair(K key, V value)
	{
	this.key = key;
	this.value = value;
	}

	public K getKey()
	{
	return key;
	}

	public void setKey(K key)
	{
	this.key = key;
	}

	public V getValue()
	{
	return value;
	}

	public void setValue(V value)
	{
	this.value = value;
	}


	public int hashCode()
	{
	final int prime = 31;
	int result = 1;
	result = prime * result + ((key == null) ? 0 : key.hashCode());
	return result;
	}


	public boolean equals(Object obj)
	{
	if(this == obj)
	return true;
	if(obj == null)
	return false;
	if(getClass() != obj.getClass())
	return false;
	KeyValuePair<K, V> other = (KeyValuePair<K, V>) obj;
	if(value == null)
	{
	if(other.value != null)
	return false;
	}
	else if(!value.equals(other.value))
	return false;
	return true;
	}


	public String toString()
	{
	return "(" + key + ", " + value + ")";
	} 
	}


