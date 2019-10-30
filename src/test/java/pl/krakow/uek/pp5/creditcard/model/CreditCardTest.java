package pl.krakow.uek.pp5.creditcard.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int LIMIT = 2000;

    @Test
    public void itAllowAssignCreditToCard() {
        //Arrange / Given
        CreditCard card = new CreditCard("1234-5678");
        //Act / When
        card.assignLimit(BigDecimal.valueOf(LIMIT));
        //Assert / Then
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(LIMIT)));
    }

    @Test
    public void creditBelowGeneralLimitIsNotPossible() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act

        //Assert
        try {
            card.assignLimit(BigDecimal.valueOf(50));
            Assert.fail("exception should be thrown");
        } catch (CreditBelowLimitException e) {
            Assert.assertTrue(true);
        }
    }
}











