package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.Dog;
import dk.mak.learnedma.generated.valuedomains.Dog.DogBuilderFood;
import dk.mak.learnedma.generated.valuedomains.Dog.DogBuilderName;
import dk.mak.learnedma.generated.valuedomains.Food;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.impl.FoodImpl;
import dk.mak.learnedma.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class DogBuilderImpl implements DogBuilderFood, DogBuilderName
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public DogBuilderImpl()
    {
        edma_value = new Object[2];
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the food field
     */
    public DogBuilderFood name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in Dog may not be null");
        edma_value[0] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the food field
     */
    public DogBuilderFood name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the food field.
     * @param food  The value to assign to the food field
     * @return      The created Dog value
     */
    public Dog food(Food food)
    {
        if(food == null) throw new NullPointerException("The field food in Dog may not be null");
        edma_value[1] = ((IValueInstance) food).edma_getValue();
        return new DogImpl(DogImpl.edma_create(edma_value));
    }

    /**
     * sets the food field.
     * @param food  The value to assign to the food field
     * @return      The created Dog value
     */
    public Dog food(String food) throws InvalidValueException
    {
        if(food != null) FoodImpl.edma_validate(food);
        if(food == null) throw new NullPointerException();
        edma_value[1] = FoodImpl.edma_create(food);
        return new DogImpl(DogImpl.edma_create(edma_value));
    }
}
