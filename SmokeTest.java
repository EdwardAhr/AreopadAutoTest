package org.example;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SmokeTest {

    //String dkudzo = "https://dkudzo-areopad.digdes.com/";
    String Directory = "//*[@id=\"wrapper\"]/ng-include/div/div[2]/div/ul/li[12]/a";
    String Company = "//*[@id=\"page-content-wrapper\"]/div/div/ul/li[1]/a";
    String BttnAddCompany = "//*[@id=\"addDivision-wrapper\"]/button";

    String ModalWin_AddCompany = "/html/body/div[4]/div/div/div";

    @BeforeClass
    public static void setUp(){
        String Login = "AutoTest";
        String Password = "1234Qazx!";
        String Customer = "https://mkb-areopad.digdes.com/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open(Customer);
        $(By.xpath("//input[@type=\"text\"]")).setValue(Login);
        $(By.xpath("//input[@type=\"password\"]")).setValue(Password);
        $(By.xpath("//input[@type=\"submit\"]")).click();
        Configuration.timeout = 20000;
        $(By.xpath("//*[@id=\"wrapper\"]/ng-include/div/div[2]/div")).shouldBe(visible);
    }
    String SearchDictionary = "//*[@id=\"addDivision-wrapper\"]/input";


    @Test
    @Order(1)
    @DisplayName("Проверка создания организации")
    public void CreateCompany(){
        $(By.xpath(Directory)).click();
        $(By.xpath(Company)).click();
        $(By.xpath(BttnAddCompany)).click();
        $(By.xpath(ModalWin_AddCompany)).shouldBe(visible);
        //Заполняю данные в модальном окне создания Организации
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[2]/div[1]/input")).setValue("AutoTestCompany");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[3]/div/input")).setValue("AutoTestingCompany");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[4]/div/input")).setValue("Mailing address");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[5]/div/input")).setValue("Legal address");

        //Заполнение вкладки шаблонов
        $(By.xpath("/html/body/div[4]/div/div/form/div[1]/ul/li[2]/a")).click();

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[1]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[2]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[3]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[4]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[5]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[6]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[7]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[8]/div[1]/input")).setValue("Повестка_МКБ.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[9]/div[1]/input")).setValue("Повестка_МКБ.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[10]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[11]/div[1]/input")).setValue("ProtocolDD.docx");

        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div[1]/div/div/div[12]/div[1]/input")).setValue("ProtocolDD.docx");
        $(By.xpath("/html/body/div[4]/div/div/form/div[1]/ul/li[1]/a")).click();
        $(By.xpath("/html/body/div[4]/div/div/form/div[3]/input[1]")).click();
        Configuration.timeout = 4000;

        $(By.xpath(SearchDictionary)).setValue("AutoTestCompany");
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr")).shouldBe(visible);
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr")).shouldHave(text("AutoTestCompany"));
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr")).hover();
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr/td[3]/a[2]/i")).click();
        $(By.xpath("//*[@id=\"alertify-ok\"]")).click();
        Configuration.timeout = 4000;


    }
    @Test
    @Order(2)
    public void editCompany(){
        $(By.xpath(Directory)).click();
        $(By.xpath(Company)).click();
        $(By.xpath(BttnAddCompany)).click();
        $(By.xpath(ModalWin_AddCompany)).shouldBe(visible);
        //Заполняю данные в модальном окне создания Организации
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[2]/div[1]/input")).click();
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[2]/div[1]/input")).setValue("AutoTestCompany");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[3]/div/input")).setValue("AutoTestingCompany");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[4]/div/input")).setValue("Mailing address");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[5]/div/input")).setValue("Legal address");
        $(By.xpath("/html/body/div[4]/div/div/form/div[3]/input[1]")).click();
        Configuration.timeout = 4000;

        $(By.xpath(SearchDictionary)).setValue("AutoTestCompany");
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr/td[1]/p/label")).click();
        $(By.xpath("/html/body/div[5]/div/div/form/div[2]/div/div[1]/div/div/div[2]/div/div[1]/input")).setValue("AutoTestCompany(edited)");
        $(By.xpath("/html/body/div[5]/div/div/form/div[2]/div/div[2]/input[1]")).click();
        $(By.xpath(SearchDictionary)).setValue("AutoTestCompany(edited)");
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr")).shouldHave(text("AutoTestCompany(edited)"));
        Configuration.timeout = 4000;

        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr")).hover();
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr/td[3]/a[2]/i")).click();
        $(By.xpath("//*[@id=\"alertify-ok\"]")).click();
    }
    @Test
    @Order(3)
    public void deleteCompany(){
        $(By.xpath(Directory)).click();
        $(By.xpath(Company)).click();
        $(By.xpath(BttnAddCompany)).click();
        $(By.xpath(ModalWin_AddCompany)).shouldBe(visible);
        //Заполняю данные в модальном окне создания Организации
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[2]/div[1]/input")).click();
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[2]/div[1]/input")).setValue("AutoTestCompany");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[3]/div/input")).setValue("AutoTestingCompany");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[4]/div/input")).setValue("Mailing address");
        $(By.xpath("/html/body/div[4]/div/div/form/div[2]/div/div/div/div/div[5]/div/input")).setValue("Legal address");
        $(By.xpath("/html/body/div[4]/div/div/form/div[3]/input[1]")).click();
        Configuration.timeout = 4000;

        $(By.xpath(SearchDictionary)).setValue("AutoTestCompany");
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr")).hover();
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div/div/div/ng-include/div/div/table/tbody/tr/td[3]/a[2]/i")).click();
        $(By.xpath("//*[@id=\"alertify-ok\"]")).click();
        $(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div/div")).shouldNotHave(text("AutoTestCompany"));

    }
}
