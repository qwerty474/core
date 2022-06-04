package APIUtils.src.main.java.requests;

import java.io.IOException;
//import UIUtils.src.main.java.NavigationPageNavigationHelper;

public class Main {
    public static void main(String[] args) throws IOException {
        final String GRADLE_HOME = "https://docs.gradle.org/current/userguide/getting_started.html";
//        Navigation.PageNavigationHelper pageNavigationHelper = new Navigation.PageNavigationHelper();
//        pageNavigationHelper.openPage("Gradle Home");
        Requests r = new Requests();
        r.sendGetRequest(GRADLE_HOME);
    }
}
