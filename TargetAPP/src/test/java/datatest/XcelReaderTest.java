package datatest;


import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import HomePageTarget.XcelElement;

import java.util.ArrayList;
import java.util.Iterator;

//import utilities.XlsDataReaderUtil;

public class XcelReaderTest extends XcelElement {


    XcelReaderTest objExcelFile;
    XcelElement xcelElement;

    @BeforeMethod
    public void initializePageObject() {

        objExcelFile = PageFactory.initElements(driver, XcelReaderTest.class);
        xcelElement = PageFactory.initElements(driver, XcelElement.class);
    }

    @DataProvider
    public Iterator<Object[]> supplyDataExcel() {
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }

    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String items) throws InterruptedException {

        //  TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        // }.getClass().getEnclosingMethod().getName()));
        //  objExcelFile.xcelElement.signInByDataProvider(items);
        String actual = XcelElement.getxlElement.getText();
        //  TestLogger.log("In Sign In Page");
        // String message = "TV Show not found";
        // Assert.assertEquals(actual, message);
    }
}