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

	//бярюбхрэ б йнмеж сбекхвхбюъ бейрнп
	void add(T _o)
	{
		Object temp[] = _array.clone();
		_array =  new Object[_array.length + 1];
		System.arraycopy(temp, 0, _array, 0, temp.length);
		add(_array.length-1, _o);
	}

	//бярюбхрэ б ъвеийс он хмдейяс
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
	
	//бярюбхрэ бейрнп б йнмеж
	void add(ReVector a)
	{
		Object[] temp = _array.clone();
		_array = new Object[_array.length + a._array.length];
		System.arraycopy(temp, 0, _array, 0, temp.length);
		System.arraycopy(a._array, 0, _array, temp.length , a._array.length);
	}
	
	//бярюбхрэ ян ялеыемхел
	void offsetAdd(int offset, T _o)
	{
		Object[] temp = _array.clone();
		_array = new Object[temp.length + 1];
		System.arraycopy(temp, 0, _array, 0, offset);
		_array[offset] = _o;
		System.arraycopy(temp, offset , _array, offset + 1, temp.length - offset);
	}
	
	//бярюбхрэ бейрнп ян ялеыемхел
	void offsetAdd(int offset, ReVector a)
	{
		Object[] temp = _array.clone();
		_array = new Object[temp.length + a._array.length];
		System.arraycopy(temp, 0, _array, 0, offset);
		System.arraycopy(a._array, 0 , _array, offset, a._array.length);
		System.arraycopy(temp, offset , _array, offset + a._array.length, temp.length - offset);
	}
	
	//днярюрэ назейр он хмдейяс
	Object get(int _index)
	{
		return _array[_index];
	}
	
	//пюглеп йнмреимепю
	int capacity()
	{
		return _array.length;
	}

	//нвхярйю бяецн бейрнпю
	void clear()
	{
		for(int i = 0; i < _array.length; i++)
			_array[i] = null;
	}
	
	//хглемхрэ пюглеп
	void resize(int _size)
	{
		Object[] temp = _array.clone();
		_array = new Object[_size];
		System.arraycopy(temp, 0, _array, 0, temp.length > _size ? _size : temp.length);
	}
	
	

}
