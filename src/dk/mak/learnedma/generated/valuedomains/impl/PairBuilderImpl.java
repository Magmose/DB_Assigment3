package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.MyString;
import dk.mak.learnedma.generated.valuedomains.MyValue;
import dk.mak.learnedma.generated.valuedomains.Pair;
import dk.mak.learnedma.generated.valuedomains.Pair.PairBuilderKey;
import dk.mak.learnedma.generated.valuedomains.Pair.PairBuilderValue;
import dk.mak.learnedma.generated.valuedomains.impl.MyStringImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class PairBuilderImpl implements PairBuilderKey, PairBuilderValue
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public PairBuilderImpl()
    {
        edma_value = new Object[2];
    }

    /**
     * sets the key field.
     * @param key  The value to assign to the key field
     * @return     Builder interface for setting the value field
     */
    public PairBuilderValue key(MyString key)
    {
        if(key == null) throw new NullPointerException("The field key in Pair may not be null");
        edma_value[0] = ((IValueInstance) key).edma_getValue();
        return this;
    }

    /**
     * sets the key field.
     * @param key  The value to assign to the key field
     * @return     Builder interface for setting the value field
     */
    public PairBuilderValue key(String key) throws InvalidValueException
    {
        if(key != null) MyStringImpl.edma_validate(key);
        if(key == null) throw new NullPointerException();
        edma_value[0] = MyStringImpl.edma_create(key);
        return this;
    }

    /**
     * sets the value field.
     * @param value  The value to assign to the value field
     * @return       The created Pair value
     */
    public Pair value(MyValue value)
    {
        if(value == null) throw new NullPointerException("The field value in Pair may not be null");
        edma_value[1] = ((IValueInstance) value).edma_getValue();
        return new PairImpl(PairImpl.edma_create(edma_value));
    }
}
