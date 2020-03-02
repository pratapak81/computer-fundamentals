package com.nsc.designpattern.creational.abstract_factory;

import com.nsc.designpattern.creational.abstract_factory.visa.VisaGoldCreditCard;
import com.nsc.designpattern.creational.abstract_factory.visa.VisaGoldValidator;
import com.nsc.designpattern.creational.abstract_factory.visa.VisaPlatinumCreditCard;
import com.nsc.designpattern.creational.abstract_factory.visa.VisaPlatinumValidator;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
            default:
                return null;
        }
    }
}
