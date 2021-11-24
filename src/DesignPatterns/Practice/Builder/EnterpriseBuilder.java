package DesignPatterns.Practice.Builder;

public class EnterpriseBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
