package Navigation;


import Exceptions.CustomException;
import Pages.GradleHomePage;

import static java.lang.String.format;

public class PageNavigationHelper {
   private GradleHomePage gradleHomePage;
        private GradleHomePage gradleHomePage() {
        return gradleHomePage.navigate();
    }

    public void openPage(String page) {

        final String GRADLE_HOME = "Gradle Home";
        switch (page) {
            case GRADLE_HOME:
                gradleHomePage().navigate();
                break;
            default:
                throw new CustomException(format("Expected '%s'!",
                        GRADLE_HOME));
        }
    }
}
