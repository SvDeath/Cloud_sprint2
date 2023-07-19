package cloud.sprint2.step_definitions;

import cloud.sprint2.pages.FilesPage_RA;
import cloud.sprint2.utilities.BrowserUtils;
import cloud.sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US002_Files_stepDefinition {

    FilesPage_RA filesPage_ra = new FilesPage_RA();
    Actions actions = new Actions(Driver.getDriver());


    @When("user click Files button he should be transferred to files page")
    public void user_click_files_button_he_should_be_transferred_to_files_page() {
        filesPage_ra.filesButton.click();

    }

    @And("user click ADD icon")
    public void userClickADDIcon() {
        filesPage_ra.addFileIcon.click();
    }


    @When("user pick upload file button")
    public void user_pick_upload_file_button() {


    }

    @Then("user should be able to upload file")
    public void user_should_be_able_to_upload_file() {

        String path = "D:\\Users\\roman\\Desktop\\Hello.txt";
        //BrowserUtils.sleep(3);
        filesPage_ra.uploadFileButton.sendKeys(path);
        //BrowserUtils.sleep(4);


        // filesPage_ra.uploadFileButton.sendKeys(path);


    }

    @Given("user is on files page")
    public void userIsOnFilesPage() {
        filesPage_ra.filesButton.click();
    }

    @And("user click New folder button")
    public void userClickNewFolderButton() {

        filesPage_ra.newFolderButton.click();
    }

    @And("user create a folder {string}")
    public void userNameAFolder(String folderName) {
        filesPage_ra.newFolderInputBox.clear();
        filesPage_ra.newFolderInputBox.sendKeys(folderName, Keys.ENTER);

        Assert.assertTrue(Driver.getDriver().findElement(By.linkText(folderName)).isEnabled());
    }

    @And("user submit new folder by pressing ENTER or submit button")
    public void userSubmitNewFolderByPressingENTEROrSubmitButton() {

    }

    @Then("new folder with given name created under file module")
    public void newFolderWithGivenNameCreatedUnderFileModule() {

    }


    @And("user select an item that need to be deleted {string}")
    public void userSelectAnItemThatNeedToBeDeleted(String item) {

        String id = "";
        for (WebElement each : filesPage_ra.fileListMenu) {
            if (each.getAttribute("data-file").contains(item)) {
                id = each.getAttribute("data-id");
            }
        }
        for (WebElement each : filesPage_ra.selectionCheckBoxes) {
            if (each.getAttribute("for").contains(id)) {
                each.click();
            }
        }
        filesPage_ra.threeDotActionsButton.click();
        filesPage_ra.deleteButton.click();


        BrowserUtils.sleep(2);
        System.out.println("filesPage_ra.listOfFilesOnPage.getText() = " + filesPage_ra.listOfFilesOnPage.getText());
        Assert.assertFalse(filesPage_ra.listOfFilesOnPage.getText().contains(item));


    }

    @Then("file or folder should be successfully deleted")
    public void fileFolderShouldBeSuccessfullyDeleted() {
    }


    @When("user scroll down the files page")
    public void userScrollDownTheFilesPage() {

        actions.moveToElement(filesPage_ra.amountOfFilesAndFolders).perform();
    }

    @Then("he should be able to see total number of files and folders on the page")
    public void heShouldBeAbleToSeeTotalNumberOfFilesAndFoldersOnThePage() {

        Assert.assertTrue(filesPage_ra.amountOfFilesAndFolders.isDisplayed());
    }
}
