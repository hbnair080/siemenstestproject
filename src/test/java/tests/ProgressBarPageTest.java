package tests;

import org.testng.annotations.Test;

public class ProgressBarPageTest extends BaseTest {


    public void verifyProgressBarPage() throws InterruptedException {
        homepage
                .clickOnWidgetsCard()
                .clickOnProgressBarMenu()
                .verifyProgressBarHeading()
                .verifyProgressBarPresent()
                .verifyProgressBarLabelPresent();

    }


    public void verifyProgressBarBeforeStart() throws InterruptedException {
        homepage
                .clickOnWidgetsCard()
                .clickOnProgressBarMenu()
                .verifyProgressBarHeading()
                .verifyProgressBarScaleState()
                .verifyStartStopText("Start");


    }

    public void verifyProgressBarAfterStart() throws InterruptedException {
        homepage
                .clickOnWidgetsCard()
                .clickOnProgressBarMenu()
                .verifyProgressBarHeading()
                .clickOnStartStop()
                .verifyProgressBarScaleState()
                .verifyStartStopText("Stop");


    }

    public void verifyProgressBarAfterFinish() throws InterruptedException {
        homepage
                .clickOnWidgetsCard()
                .clickOnProgressBarMenu()
                .verifyProgressBarHeading()
                .clickOnStartStop()
                .waitProgressBar()
                .verifyProgressBarScaleState()
                .verifyProgressBarTextAt100()
                .verifyBackground("rgba(40, 167, 69, 1)")
                .verifyResetButton();


    }


    public void verifyProgressBarAfterReset() throws InterruptedException {
        homepage
                .clickOnWidgetsCard()
                .clickOnProgressBarMenu()
                .verifyProgressBarHeading()
                .clickOnStartStop()
                .waitProgressBar()
                .verifyBackground("rgba(40, 167, 69, 1)")
                .verifyResetButton()
                .clickOnResetButton()
                .verifyProgressBarScaleInvisible()
                .verifyBackground("rgba(23, 162, 184, 1)")
                .verifyStartStopButtonTextPresent("Start");


    }


    @Test
    public void verifyProgressBarInMoving() throws InterruptedException {
        homepage
                .clickOnWidgetsCard()
                .clickOnProgressBarMenu()
                .verifyProgressBarHeading()
                .clickOnStartStop()
                .verifyStartStopButtonTextPresent("Stop")
                .waitForProgressBarMiddle()
                .clickOnStartStop()
                .verifyBackground("rgba(23, 162, 184, 1)")
                .verifyProgressBarText()
                .verifyStartStopButtonTextPresent("Start");


    }



}
