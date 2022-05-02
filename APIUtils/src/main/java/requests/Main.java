package requests;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final String GRADLE_HOME = "https://docs.gradle.org/current/userguide/getting_started.html";
        PageNavigationHelper pageNavigationHelper = new PageNavigationHelper;
        pageNavigationHelper.openPage("Gradle Home");
        Requests r = new Requests();
        r.sendGetRequest(GRADLE_HOME);
    }
}
