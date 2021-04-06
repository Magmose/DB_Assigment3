package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.MyArray;
import dk.mak.learnedma.generated.valuedomains.MyBoolean;
import dk.mak.learnedma.generated.valuedomains.MyInteger;
import dk.mak.learnedma.generated.valuedomains.MyObject;
import dk.mak.learnedma.generated.valuedomains.MyString;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.MyValueImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: MyValue
 */
public abstract class MyValue implements Comparable<MyValue>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(3);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The MyValue from the terminal
     */
    public static MyValue fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new MyValueImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The MyValue from the string representation
     */
    public static MyValue fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new MyValueImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The MyValue read from the stream
     */
    public static MyValue fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new MyValueImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The MyValue read from the stream
     */
    public static MyValue fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new MyValueImpl(res);
    }

    /**
     * Creates a new MyValue with the internal value domain MyString
     * @param myString  The internal value that this MyValue will get
     * @return          The created value
     */
    public static MyValue create(MyString myString)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 0;
        edma_pair[1] = ((IValueInstance) myString).edma_getValue();
        return new MyValueImpl(edma_pair);
    }

    /**
     * Creates a new MyValue with the internal value domain MyInteger
     * @param myInteger  The internal value that this MyValue will get
     * @return           The created value
     */
    public static MyValue create(MyInteger myInteger)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 1;
        edma_pair[1] = ((IValueInstance) myInteger).edma_getValue();
        return new MyValueImpl(edma_pair);
    }

    /**
     * Creates a new MyValue with the internal value domain MyBoolean
     * @param myBoolean  The internal value that this MyValue will get
     * @return           The created value
     */
    public static MyValue create(MyBoolean myBoolean)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 2;
        edma_pair[1] = ((IValueInstance) myBoolean).edma_getValue();
        return new MyValueImpl(edma_pair);
    }

    /**
     * Creates a new MyValue with the internal value domain MyArray
     * @param myArray  The internal value that this MyValue will get
     * @return         The created value
     */
    public static MyValue create(MyArray myArray)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 3;
        edma_pair[1] = ((IValueInstance) myArray).edma_getValue();
        return new MyValueImpl(edma_pair);
    }

    /**
     * Creates a new MyValue with the internal value domain MyObject
     * @param myObject  The internal value that this MyValue will get
     * @return          The created value
     */
    public static MyValue create(MyObject myObject)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 4;
        edma_pair[1] = ((IValueInstance) myObject).edma_getValue();
        return new MyValueImpl(edma_pair);
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyString
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyString
     */
    public abstract boolean isMyString();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyInteger
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyInteger
     */
    public abstract boolean isMyInteger();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyBoolean
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyBoolean
     */
    public abstract boolean isMyBoolean();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyArray
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyArray
     */
    public abstract boolean isMyArray();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * MyObject
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          MyObject
     */
    public abstract boolean isMyObject();

    /**
     * Returns this value as a value from the value domain MyString or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyString
     * @return  This value as a value from the value domain MyString
     */
    public abstract MyString asMyString();

    /**
     * Returns this value as a value from the value domain MyInteger or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyInteger
     * @return  This value as a value from the value domain MyInteger
     */
    public abstract MyInteger asMyInteger();

    /**
     * Returns this value as a value from the value domain MyBoolean or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyBoolean
     * @return  This value as a value from the value domain MyBoolean
     */
    public abstract MyBoolean asMyBoolean();

    /**
     * Returns this value as a value from the value domain MyArray or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * MyArray
     * @return  This value as a value from the value domain MyArray
     */
    public abstract MyArray asMyArray();

    /**
     * Returns this value as a value from the value domain MyObject or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain MyObject
     * @return  This value as a value from the value domain MyObject
     */
    public abstract MyObject asMyObject();

    public String toJson() {
        if(isMyBoolean()) return asMyBoolean().toJson();
        if(isMyArray()) return asMyArray().toJson();
        if(isMyInteger()) return asMyInteger().toJson();
        if(isMyString()) return asMyString().value();
        if(isMyObject()) return asMyObject().toJson();
        return "";
    }
}
