package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.MyArray;
import dk.mak.learnedma.generated.valuedomains.MyBoolean;
import dk.mak.learnedma.generated.valuedomains.MyInteger;
import dk.mak.learnedma.generated.valuedomains.MyObject;
import dk.mak.learnedma.generated.valuedomains.MyString;
import dk.mak.learnedma.generated.valuedomains.MyValue;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.MyArrayImpl;
import dk.mak.learnedma.generated.valuedomains.impl.MyBooleanImpl;
import dk.mak.learnedma.generated.valuedomains.impl.MyIntegerImpl;
import dk.mak.learnedma.generated.valuedomains.impl.MyObjectImpl;
import dk.mak.learnedma.generated.valuedomains.impl.MyStringImpl;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of MyValue
 */
public class MyValueImpl extends MyValue implements IValueInstance
{
    private int edma_hash;
    private Object[] value;



    /**
     * Check if a value is valid
     * @param value  The value to validate
     */
    public static void edma_validate(Object value) throws InvalidValueException
    {
        edma_domain.validate(value, EDMA_ExternalConstraints.instance);
    }

    /**
     * create value without checking
     * @param value  The value to check and create
     * @return       <tt>true</tt> The new created value
     */
    public static Object edma_create(Object value)
    {
        return edma_domain.newValue(value);
    }

    /**
     * Constructor
     * @param o  The Object that represents this OneOf value
     */
    public MyValueImpl(Object o)
    {
        edma_hash = 0;
        value = (Object[]) o;
    }

    /**
     * Gets the value domain for this value instance
     * @return  The value domain for this value instance
     */
    public IMetaValueDomain edma_getDomain()
    {
        return edma_domain;
    }

    /**
     * Access to the general Object value
     * @return  The value as a general Object
     */
    public Object edma_getValue()
    {
        return value;
    }

    /**
     * Returns <tt>true</tt> if this value equals the given value
     * @param o  Object to test equality with
     * @return   <tt>true</tt> if this value equals the given value
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof IValueInstance)) return false;
        IValueInstance inst = (IValueInstance) o;
        if(3 != inst.edma_getDomain().getIndex()) return false;
        return edma_domain.valueEqual(value, inst.edma_getValue());
    }

    /**
     * Gets the value hash for this value instance
     * @return  The hash for this value instance
     */
    public int hashCode()
    {
        if(edma_hash == 0) edma_hash = edma_domain.valueHashCode(value);
        return edma_hash;
    }

    /**
     * Returns this value instance as a string
     * @return  this value instance as a string
     */
    public String toString()
    {
        return edma_domain.valueToString(value);
    }

    /**
     * Compare this MyValue to another MyValue
     * @param myValue  The MyValue to compare with
     * @return         A negative integer, zero, or a positive integer as this
     *                 MyValue is less than, equal to, or greater than the
     *                 specified MyValue
     */
    public int compareTo(MyValue myValue)
    {
        return edma_domain.valueCompare(value, ((MyValueImpl) myValue).value);
    }

    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public void toStream(DataOutput out) throws IOException
    {
        edma_domain.writeValue(((IValueInstance) this).edma_getValue(), out);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyString
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyString
     */
    public boolean isMyString()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 0);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyInteger
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyInteger
     */
    public boolean isMyInteger()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 1);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyBoolean
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyBoolean
     */
    public boolean isMyBoolean()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 2);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyArray
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyArray
     */
    public boolean isMyArray()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 3);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyObject
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyObject
     */
    public boolean isMyObject()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 4);
    }

    /**
     * Returns this value as a value from the value domain MyString or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyString
     * @return  This value as a value from the value domain MyString
     */
    public MyString asMyString()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 0) throw new UnsupportedOperationException();
        return new MyStringImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain MyInteger or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyInteger
     * @return  This value as a value from the value domain MyInteger
     */
    public MyInteger asMyInteger()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 1) throw new UnsupportedOperationException();
        return new MyIntegerImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain MyBoolean or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyBoolean
     * @return  This value as a value from the value domain MyBoolean
     */
    public MyBoolean asMyBoolean()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 2) throw new UnsupportedOperationException();
        return new MyBooleanImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain MyArray or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * MyArray
     * @return  This value as a value from the value domain MyArray
     */
    public MyArray asMyArray()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 3) throw new UnsupportedOperationException();
        return new MyArrayImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain MyObject or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyObject
     * @return  This value as a value from the value domain MyObject
     */
    public MyObject asMyObject()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 4) throw new UnsupportedOperationException();
        return new MyObjectImpl(value[1]);
    }
}
