package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.Food;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.DogBuilderImpl;
import dk.mak.learnedma.generated.valuedomains.impl.DogImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Dog
 */
public abstract class Dog implements Comparable<Dog>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(33);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Dog from the terminal
     */
    public static Dog fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new DogImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Dog from the string representation
     */
    public static Dog fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new DogImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Dog read from the stream
     */
    public static Dog fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new DogImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Dog read from the stream
     */
    public static Dog fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new DogImpl(res);
    }

    /**
     * Starts creation of a new Dog
     * @return  Builder interface to set the name field
     */
    public static DogBuilderName create()
    {
        return new DogBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field name
     * @return  The value of the field name
     */
    public abstract Name name();

    /**
     * returns the value of the field food
     * @return  The value of the field food
     */
    public abstract Food food();


    /**
     * Builder interface for setting the name field of Dog
     */
    public interface DogBuilderName
    {

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the food field
         */
        public DogBuilderFood name(Name name);

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the food field
         */
        public DogBuilderFood name(String name) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the food field of Dog
     */
    public interface DogBuilderFood
    {

        /**
         * sets the food field.
         * @param food  The value to assign to the food field
         * @return      The created Dog value
         */
        public Dog food(Food food);

        /**
         * sets the food field.
         * @param food  The value to assign to the food field
         * @return      The created Dog value
         */
        public Dog food(String food) throws InvalidValueException;

    }

}
