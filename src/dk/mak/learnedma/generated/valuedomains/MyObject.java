package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.MyObjectBuilderImpl;
import dk.mak.learnedma.generated.valuedomains.impl.MyObjectImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: MyObject
 */
public abstract class MyObject implements Comparable<MyObject>, Iterable<Pair> {
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(4);


    /**
     * Get a value from a terminal
     *
     * @param terminal The terminal to get the value from
     * @return The MyObject from the terminal
     */
    public static MyObject fromTerminal(ITerminal terminal) {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new MyObjectImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     *
     * @param s The String to parse
     * @return The MyObject from the string representation
     */
    public static MyObject fromString(String s) throws InvalidValueException {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new MyObjectImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     *
     * @param in A data input interface for the stream to read from
     * @return The MyObject read from the stream
     */
    public static MyObject fromStream(DataInput in) throws IOException, InvalidValueException {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new MyObjectImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     *
     * @param in A data input interface for the stream to read from
     * @return The MyObject read from the stream
     */
    public static MyObject fromStreamNoValidate(DataInput in) throws IOException {
        Object res = edma_domain.readValueNoValidate(in);
        return new MyObjectImpl(res);
    }

    /**
     * Starts creation of a new MyObject
     *
     * @return Builder interface to build the list
     */
    public static MyObjectBuilder begin() {
        return new MyObjectBuilderImpl();
    }


    /**
     * Writes this value to a stream
     *
     * @param out Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns the size of this list
     *
     * @return the size of this list
     */
    public abstract int size();

    /**
     * Returns the element on a given index in this list
     *
     * @param index The index of the element to be returned
     * @return the element on the given index in this list
     */
    public abstract Pair get(int index);


    /**
     * Interface to create a list
     */
    public interface MyObjectBuilder {

        /**
         * Adds an element to the list
         *
         * @param pair The element to be added to the list
         * @return An interface to the builder for chaining method calls
         */
        public MyObjectBuilder add(Pair pair);

        /**
         * Builds the list with the added elements
         *
         * @return The builded list
         */
        public MyObject end();

    }

    public String toJson() {
        StringBuilder strB = new StringBuilder();
        strB.append("{");
        this.forEach(pair -> {
            strB.append(pair.toJson()+",\n");
        });
        strB.append("}");
        return strB.toString();
    }

}
