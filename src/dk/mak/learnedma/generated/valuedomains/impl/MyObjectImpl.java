package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.MyObject;
import dk.mak.learnedma.generated.valuedomains.Pair;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of MyObject
 */
public class MyObjectImpl extends MyObject implements IValueInstance
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
     * @param o  The Object that represents this list value
     */
    public MyObjectImpl(Object o)
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
        if(4 != inst.edma_getDomain().getIndex()) return false;
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
     * Compare this MyObject to another MyObject
     * @param myObject  The MyObject to compare with
     * @return          A negative integer, zero, or a positive integer as this
     *                  MyObject is less than, equal to, or greater than the
     *                  specified MyObject
     */
    public int compareTo(MyObject myObject)
    {
        return edma_domain.valueCompare(value, ((MyObjectImpl) myObject).value);
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
     * Returns an iterator for this list
     * @return  an iterator for this list
     */
    public Iterator<Pair> iterator()
    {
        return new MyObjectIterator();
    }

    /**
     * Returns the size of this list
     * @return  the size of this list
     */
    public int size()
    {
        return value.length;
    }

    /**
     * Returns the element on a given index in this list
     * @param index  The index of the element to be returned
     * @return       the element on the given index in this list
     */
    public Pair get(int index)
    {
        return new PairImpl(value[index]);
    }


    /**
     * 
     */
    public class MyObjectIterator implements Iterator<Pair>
    {
        private int pos;



        /**
         * Constructor
         */
        public MyObjectIterator()
        {
            pos = 0;
        }

        /**
         * Returns true if there are more elements in this iterator
         * @return  true if there are more elements in this iterator
         */
        public boolean hasNext()
        {
            return pos < value.length;
        }

        /**
         * returns the next element from this iterator
         * @return  the next element in this iterator
         */
        public Pair next()
        {
            return new PairImpl(value[pos++]);
        }

        /**
         * This operation is not supported, because the list is immutable
         */
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }

}
