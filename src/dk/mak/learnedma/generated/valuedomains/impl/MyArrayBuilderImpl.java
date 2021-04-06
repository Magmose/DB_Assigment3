package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.MyArray;
import dk.mak.learnedma.generated.valuedomains.MyArray.MyArrayBuilder;
import dk.mak.learnedma.generated.valuedomains.MyObject;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class MyArrayBuilderImpl implements MyArrayBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public MyArrayBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param myObject  The element to be added to the list
     * @return          An interface to the builder for chaining method calls
     */
    public MyArrayBuilder add(MyObject myObject)
    {
        if(myObject == null) throw new NullPointerException();
        valueList.add(((IValueInstance) myObject).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public MyArray end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new MyArrayImpl(MyArrayImpl.edma_create(res));
    }
}
