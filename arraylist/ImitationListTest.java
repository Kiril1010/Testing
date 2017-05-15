package arraylist;

import homework_20_09_16.arraylist.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class ImitationListTest {

    ArrayList list = new ArrayList(5);

    @Test
    public void shouldAddElement() {
        list.addElement(12);

        Assert.assertEquals("should return 12", 12, list.getArray()[0]);
        Assert.assertEquals("should return 5", 5, list.getArray().length);
    }

    @Test
    public void shouldResizeArray() {
        int[] array = new int[1];
        list.setArray(array);
        list.addElement(12);
        list.addElement(17);

        Assert.assertEquals("should return 12", 12, list.getArray()[0]);
        Assert.assertEquals("should return 2", 2, list.getArray().length);
    }
}
