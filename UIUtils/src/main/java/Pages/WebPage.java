package Pages;

public interface WebPage {

    <T extends WebPage> T navigate();

}
