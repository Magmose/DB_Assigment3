package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.Bird;
import dk.mak.learnedma.generated.valuedomains.Bird.BirdBuilderName;
import dk.mak.learnedma.generated.valuedomains.Bird.BirdBuilderNumberOfWings;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.PosInt;
import dk.mak.learnedma.generated.valuedomains.impl.NameImpl;
import dk.mak.learnedma.generated.valuedomains.impl.PosIntImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class BirdBuilderImpl implements BirdBuilderName, BirdBuilderNumberOfWings
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public BirdBuilderImpl()
    {
        edma_value = new Object[2];
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the numberOfWings field
     */
    public BirdBuilderNumberOfWings name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in Bird may not be null");
        edma_value[0] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the numberOfWings field
     */
    public BirdBuilderNumberOfWings name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the numberOfWings field.
     * @param numberOfWings  The value to assign to the numberOfWings field
     * @return               The created Bird value
     */
    public Bird numberOfWings(PosInt numberOfWings)
    {
        if(numberOfWings == null) throw new NullPointerException("The field numberOfWings in Bird may not be null");
        edma_value[1] = ((IValueInstance) numberOfWings).edma_getValue();
        return new BirdImpl(BirdImpl.edma_create(edma_value));
    }

    /**
     * sets the numberOfWings field.
     * @param numberOfWings  The value to assign to the numberOfWings field
     * @return               The created Bird value
     */
    public Bird numberOfWings(Integer numberOfWings) throws InvalidValueException
    {
        if(numberOfWings != null) PosIntImpl.edma_validate(numberOfWings);
        if(numberOfWings == null) throw new NullPointerException();
        edma_value[1] = PosIntImpl.edma_create(numberOfWings);
        return new BirdImpl(BirdImpl.edma_create(edma_value));
    }
}
