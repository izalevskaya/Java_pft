package ru.stqa.pft.adddressbook;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String phone;
  private final String email;

  public ContactData(String Name, String Lastname, String phone, String email) {
    name = Name;
    lastname = Lastname;
    this.phone = phone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
