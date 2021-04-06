package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.Bird;
import dk.mak.learnedma.generated.valuedomains.Cat;
import dk.mak.learnedma.generated.valuedomains.Dog;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.AnimalImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Animal
 */
public abstract class Animal implements Comparable<Animal>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(36);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Animal from the terminal
     */
    public static Animal fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new AnimalImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Animal from the string representation
     */
    public static Animal fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new AnimalImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Animal read from the stream
     */
    public static Animal fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new AnimalImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Animal read from the stream
     */
    public static Animal fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new AnimalImpl(res);
    }

    /**
     * Creates a new Animal with the internal value domain Dog
     * @param dog  The internal value that this Animal will get
     * @return     The created value
     */
    public static Animal create(Dog dog)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 0;
        edma_pair[1] = ((IValueInstance) dog).edma_getValue();
        return new AnimalImpl(edma_pair);
    }

    /**
     * Creates a new Animal with the internal value domain Cat
     * @param cat  The internal value that this Animal will get
     * @return     The created value
     */
    public static Animal create(Cat cat)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 1;
        edma_pair[1] = ((IValueInstance) cat).edma_getValue();
        return new AnimalImpl(edma_pair);
    }

    /**
     * Creates a new Animal with the internal value domain Bird
     * @param bird  The internal value that this Animal will get
     * @return      The created value
     */
    public static Animal create(Bird bird)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 2;
        edma_pair[1] = ((IValueInstance) bird).edma_getValue();
        return new AnimalImpl(edma_pair);
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain Dog
     * @return  <tt>true</tt> if this value is a value from the value domain Dog
     */
    public abstract boolean isDog();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain Cat
     * @return  <tt>true</tt> if this value is a value from the value domain Cat
     */
    public abstract boolean isCat();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain Bird
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          Bird
     */
    public abstract boolean isBird();

    /**
     * Returns this value as a value from the value domain Dog or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Dog
     * @return  This value as a value from the value domain Dog
     */
    public abstract Dog asDog();

    /**
     * Returns this value as a value from the value domain Cat or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Cat
     * @return  This value as a value from the value domain Cat
     */
    public abstract Cat asCat();

    /**
     * Returns this value as a value from the value domain Bird or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Bird
     * @return  This value as a value from the value domain Bird
     */
    public abstract Bird asBird();
}
