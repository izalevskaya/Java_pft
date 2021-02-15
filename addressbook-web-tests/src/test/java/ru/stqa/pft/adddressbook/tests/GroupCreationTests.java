package ru.stqa.pft.adddressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adddressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Test 3", "Test 4", "Test 5"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
