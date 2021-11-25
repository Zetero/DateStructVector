package all;

public class ReVector <T> 
{
	protected int _increment;
	protected Object[] _array;

	ReVector()
	{
		_increment = 10;
		_array = new Object[10];
	}

	ReVector(int size)
	{
		_array = new Object[size];
		_increment = 0;
	}

	ReVector(int size, int inc)
	{
		_array = new Object[size];
		_increment = inc;
	}

	//Add object _o to the end of Vector
	void add(T _o)
	{
		Object temp[] = _array.clone();
		_array =  new Object[_array.length + 1];
		System.arraycopy(temp, 0, _array, 0, temp.length);
		add(_array.length-1, _o);
	}

	//Add object _0 by index to a Vector
	void add(int _index, T _o)
	{
		if(_index < _array.length)
			_array[_index] = _o;
		else
		{
			Object temp[] = _array.clone();
			_array = new Object[_array.length + _increment];
			System.arraycopy(temp, 0, _array, 0, temp.length);
			add(_index, _o);
		}
	}
	
	//Add object Vector a to the end of Vector
	void add(ReVector<T> a)
	{
		Object[] temp = _array.clone();
		_array = new Object[_array.length + a._array.length];
		System.arraycopy(temp, 0, _array, 0, temp.length);
		System.arraycopy(a._array, 0, _array, temp.length , a._array.length);
	}
	
	//Add object with offset to a Vector
	void offsetAdd(int offset, T _o)
	{
		Object[] temp = _array.clone();
		_array = new Object[temp.length + 1];
		System.arraycopy(temp, 0, _array, 0, offset);
		_array[offset] = _o;
		System.arraycopy(temp, offset , _array, offset + 1, temp.length - offset);
	}
	
	//Add Vector with offset to a Vector
	void offsetAdd(int offset, ReVector<T> a)
	{
		Object[] temp = _array.clone();
		_array = new Object[temp.length + a._array.length];
		System.arraycopy(temp, 0, _array, 0, offset);
		System.arraycopy(a._array, 0 , _array, offset, a._array.length);
		System.arraycopy(temp, offset , _array, offset + a._array.length, temp.length - offset);
	}
	
	//Get object from Vector by index
	Object get(int _index)
	{
		return _array[_index];
	}
	
	//Get capacity 
	int capacity()
	{
		return _array.length;
	}

	//Clear Vector cells
	void clear()
	{
		for(int i = 0; i < _array.length; i++)
			_array[i] = null;
	}
	
	//Resize Vector
	void resize(int _size)
	{
		Object[] temp = _array.clone();
		_array = new Object[_size];
		System.arraycopy(temp, 0, _array, 0, temp.length > _size ? _size : temp.length);
	}
	
	

}
