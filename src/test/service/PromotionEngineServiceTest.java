package test.service;

import main.service.PromotionEngineService;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Test class for PromotionEngineService
 */

public class PromotionEngineServiceTest {

    PromotionEngineService promotionEngineService = new PromotionEngineService();

    private static final String EXPECTED_MESSAGE = "Final Price should match expected price";

    @Test
    public void testForFirstActivePromotion() {
        int finalPrice = promotionEngineService.getFinalOfferPrice(Arrays.asList("A", "A", "A"));
        assertEquals(EXPECTED_MESSAGE, 130, finalPrice);
    }

    @Test
    public void testForSecondActivePromotion() {
        int finalPrice = promotionEngineService.getFinalOfferPrice(Arrays.asList("B", "B"));
        assertEquals(EXPECTED_MESSAGE, 45, finalPrice);
    }

    @Test
    public void testForScenarioA() {
        int finalPrice = promotionEngineService.getFinalOfferPrice(Arrays.asList("A", "B", "C"));
        assertEquals(EXPECTED_MESSAGE, 100, finalPrice);
    }

    @Test
    public void testForScenarioB() {
        int finalPrice = promotionEngineService.getFinalOfferPrice(Arrays.asList("A", "A", "A", "A", "A", "B", "B", "B", "B", "B", "C"));
        assertEquals(EXPECTED_MESSAGE, 370, finalPrice);
    }

    @Test
    public void testForScenarioC() {
        int finalPrice = promotionEngineService.getFinalOfferPrice(Arrays.asList("A", "A", "A", "B", "B", "B", "B", "B", "C", "D"));
        assertEquals(EXPECTED_MESSAGE, 280, finalPrice);
    }

}
