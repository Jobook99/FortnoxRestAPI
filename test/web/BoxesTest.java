/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoxesTest {
    
    public Boxes box = new Boxes(0, "Johan", 11, 44, 250, 100);
    
    public BoxesTest() {
        
    }

    @Test
    public void testBoxes() {
        List<Boxes> boxList = new ArrayList<Boxes>();
        boxList.add(new Boxes(0, "Johan", 11, 44, 250, 100));
        boxList.add(new Boxes(1, "My", 10, 40, 50, 250));
        assertEquals(boxList.size(), 2);
        assertEquals(boxList.get(1), new Boxes(1, "My", 10, 40, 50, 250));

    }

    @Test
    public void testGetAndSetId() {
        Integer expected = 1;
        box.setId(expected);
        assertEquals(box.getId(), expected);
    }

    @Test
    public void testGetAndSetReceiver() {
        String expected = "Johannes";
        box.setReceiver(expected);
        assertEquals(box.getReceiver(), expected);
    }

    @Test
    public void testGetAndSetWeight() {
        float expected = 20;
        box.setWeight(expected);
        assertEquals(box.getWeight(), expected, 2);
    }

    @Test
    public void testGetAndSetShippingcost() {
        float expected = 80;
        box.setShippingcost(expected);
        assertEquals(box.getShippingcost(), expected, 2);
    }

    @Test
    public void testGetAndSetRed() {
        int expected = 150;
        box.setRed(expected);
        assertEquals(box.getRed(), expected);
    }

    @Test
    public void testGetAndSetGreen() {
        int expected = 250;
        box.setGreen(expected);
        assertEquals(box.getGreen(), expected);
    }

    @Test
    public void testToString() {
        assertEquals(box.toString(), "web.Boxes[ id=" + box.getId() + " ]");
    }
    
}
