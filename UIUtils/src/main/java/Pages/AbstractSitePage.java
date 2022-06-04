package Pages;

import java.util.concurrent.TimeoutException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v100.page.Page;

public abstract class AbstractSitePage implements WebPage{
//    public String buildUrl() {
//        //TODO: check for null
//        return getURI().isAbsolute() ? resolvePageUrl() : resolveSite() + resolvePageUrl();
//    }
//
//    protected Page.URI getURI() {
//        return getClass().getAnnotation(Page.URI.class);
//    }
//
//    public static Object executeScript(String script, Object... elements) {
//        return ((JavascriptExecutor) getDriver()).executeScript(script, elements);
//    }
//
//    private String getDocumentReadyState() {
//        return (String) executeScript("return document.readyState");
//    }
//    protected boolean isInteractive() {
//        return getDocumentReadyState().equals("interactive");
//    }
//
//    @SuppressWarnings("unchecked")
//    public <T extends WebPage> T navigate() {
//        final String pageUrl = buildUrl();
//        try {
//            openAbsoluteUrl(pageUrl);
//        }
//        catch (TimeoutException e) {
//            if (isInteractive()) {
//                return (T) this;
//            }
//            throw e;
//        }
//        return (T) this;
//    }
}
