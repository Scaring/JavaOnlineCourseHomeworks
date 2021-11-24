package DesignPatterns.Practice.Builder;

public class VisitCardBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
