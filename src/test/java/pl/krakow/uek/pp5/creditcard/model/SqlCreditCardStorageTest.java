package pl.krakow.uek.pp5.creditcard.model;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SqlCreditCardStorageTest {

    @Test
    public void itAllowToStoreCC() {
        SqlCreditCardStorage sqlCreditCardStorage = new SqlCreditCardStorage();

        CreditCard creditCard = new CreditCard("1234");
        sqlCreditCardStorage.add(creditCard);

        CreditCard loaded = sqlCreditCardStorage.load("1234");

        assertThat(creditCard.getNumber()).isEqualTo(loaded.getNumber());
    }
}
