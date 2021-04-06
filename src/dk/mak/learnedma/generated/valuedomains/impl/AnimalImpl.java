package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.Animal;
import dk.mak.learnedma.generated.valuedomains.Bird;
import dk.mak.learnedma.generated.valuedomains.Cat;
import dk.mak.learnedma.generated.valuedomains.Dog;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.BirdImpl;
import dk.mak.learnedma.generated.valuedomains.impl.CatImpl;
import dk.mak.learnedma.generated.valuedomains.impl.DogImpl;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of Animal
 */
public class AnimalImpl extends Animal implements IValueInstance
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
    public AnimalImpl(Object o)
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
        if(36 != inst.edma_getDomain().getIndex()) return false;
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
     * Compare this Animal to another Animal
     * @param animal  The Animal to compare with
     * @return        A negative integer, zero, or a positive integer as this
     *                Animal is less than, equal to, or greater than the
     *                specified Animal
     */
    public int compareTo(Animal animal)
    {
        return edma_domain.valueCompare(value, ((AnimalImpl) animal).value);
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
     * Returns <tt>true</tt> if this value is a value from the value domain Dog
     * @return  <tt>true</tt> if this value is a value from the value domain Dog
     */
    public boolean isDog()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 0);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain Cat
     * @return  <tt>true</tt> if this value is a value from the value domain Cat
     */
    public boolean isCat()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 1);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain Bird
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          Bird
     */
    public boolean isBird()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 2);
    }

    /**
     * Returns this value as a value from the value domain Dog or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Dog
     * @return  This value as a value from the value domain Dog
     */
    public Dog asDog()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 0) throw new UnsupportedOperationException();
        return new DogImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain Cat or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Cat
     * @return  This value as a value from the value domain Cat
     */
    public Cat asCat()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 1) throw new UnsupportedOperationException();
        return new CatImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain Bird or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Bird
     * @return  This value as a value from the value domain Bird
     */
    public Bird asBird()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 2) throw new UnsupportedOperationException();
        return new BirdImpl(value[1]);
    }
}
