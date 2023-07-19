package cloud.sprint2.pages;


import cloud.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class FilesPage_RA {



    public FilesPage_RA(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesButton;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addFileIcon;

    @FindBy(xpath = "//li//label[@for='file_upload_start']")
    public WebElement uploadFileButton;


    @FindBy(xpath = "//a[@data-action='folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement newFolderInputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement newFolderSubmitButton;


    @FindBy(xpath = "//a[@data-action='delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//li[@class='action-5']")
    public WebElement secondDeleteOption;

    @FindBy(xpath = "//table[@id='filestable']//tbody/tr")
    public List<WebElement> fileListMenu;

    @FindBy(xpath = "//td[@class='selection']/label")
    public List<WebElement> selectionCheckBoxes;

    @FindBy(xpath = "(//a[@class='actions-selected'])[1]")
    public WebElement threeDotActionsButton;

    @FindBy(xpath = "(//tbody[@id='fileList'])[1]")
    public WebElement listOfFilesOnPage;

    @FindBy(xpath = "//td[@class='filesummary']")
    public WebElement amountOfFilesAndFolders;


}
