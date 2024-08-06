package dev.vero;

public class ShopOwner {
    private String name;
    private String contactInfo;

    public ShopOwner(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "ShopOwner{" +
                "name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}

