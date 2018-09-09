package huseyin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

class ElementTest {

    @Before
    private void setUpElementList(){
        Element elementHuseyin = new Element(1, "huseyin", 33);
        Element elementAida = new Element(2, "aida", 31);
        Element elementDuygu = new Element(3, "duygu", 31);
        Element elementYigit = new Element(4, "yigit", 2);
        Element elementMert = new Element(5, "mert", 2);
        Element elementMertWith20Age = new Element(6, "mert", 20);
        Element duplicateElementHuseyin = new Element(7, "huseyin", 33);

        List<Element> elementList = new ArrayList<>();
        elementList.add(elementHuseyin);
        elementList.add(elementAida);
        elementList.add(elementDuygu);
        elementList.add(elementYigit);
        elementList.add(elementMert);
        elementList.add(elementMertWith20Age);
        elementList.add(duplicateElementHuseyin);
    }

    @Test
    private void testNullList() {

    }

}
