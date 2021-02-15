package ru.stqa.pft.adddressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test 3", "Test 4", "Test 5"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
