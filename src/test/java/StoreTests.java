import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StoreTests {

    Store myStore;

    @BeforeEach
    void setupStore() {
        myStore = new Store();

        Item item1 = new Item("SAND001","Veggie Sandwich",5);
        Item item2 = new Item("TACO001","Ground Beef Taco",2);
        Item item3 = new Item("SALA001","Chicken Salad",2);

        myStore.addItem(item1);
        myStore.addItem(item2);
        myStore.addItem(item3);
    }

    @Test
    void getTheMostExpensiveProductTest() {
        var expectedHighestPricedItem = myStore.getItems().get(2);
        var actualItem = myStore.getTheMostExpensiveItem();

        assertEquals(expectedHighestPricedItem,actualItem);
    }

    @Test
    void getInventoryValueTest() {
        assertEquals(66,myStore.getInventoryValue());
    }

    @Test
    void getTheCheapestProductTest() {
        var expectedCheapestItem = myStore.getItems().get(1);
        var actualItem = myStore.getTheCheapestItem();

        assertEquals(expectedCheapestItem,actualItem);
    }

    @Test
    void getAllPricesTest() {
        var expectedPrices = new Double[]{ 8.0, 4.0, 9.0 };
        var actualPrices = myStore.getAllPrices().toArray(new Double[expectedPrices.length]);

        assertArrayEquals(expectedPrices,actualPrices);
    }

}
