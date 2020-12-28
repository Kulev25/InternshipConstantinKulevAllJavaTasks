package com.endava.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareAddToCartPage {
    @FindBy(xpath = "//a[contains(@href, 'tv-audio-video-hi-fi')]")
    private WebElement tvAudioVideoHiFi;
    @FindBy(xpath = "//a[contains(@href, '686094')]")
    private WebElement tvAudioVideoHiFiCategory;
    @FindBy(xpath = "//div[@class='catalog-item-product'][1]//div[@class='aac-button-data product-right-button2']")
    private WebElement addToCompareList1;
    @FindBy(xpath = "//div[@class='catalog-item-product'][2]//div[@class='aac-button-data product-right-button2']")
    private WebElement addToCompareList2;
    @FindBy(xpath = "//a[contains(@href, 'product/compare')]")
    private WebElement openCompareList;
    @FindBy(xpath = "//div[@tabindex='0'][1]//div[@class='comparison-del']")
    private WebElement deleteFromCompareList;
    @FindBy(xpath = "//a[@class='add-to-cart'][1]")
    private WebElement addToCart;
    @FindBy(xpath = "//div[contains(@class, 'cart-item')]")
    private WebElement openCart;
    @FindBy(xpath = "//div[contains(@class, 'logo')]")
    private WebElement backToHomePage;

    private WebDriver driver;

    public CompareAddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void compareAddToCart() {
        tvAudioVideoHiFi.click();
        tvAudioVideoHiFiCategory.click();
        addToCompareList1.click();
        addToCompareList2.click();
        openCompareList.click();
        deleteFromCompareList.click();
        addToCart.click();
        openCart.click();
        backToHomePage.click();
    }
}
