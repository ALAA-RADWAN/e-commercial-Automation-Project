package Listeners;

import Utilities.LogsUtil;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestResultListenerClass implements ITestListener {

    public void onTestStart(ITestResult result) {
        LogsUtil.info("Test Case " + result.getName() + " started");
    }

    public void onTestSuccess(ITestResult result) {
        LogsUtil.info("Test Case " + result.getName() + " passed");
    }

    public void onTestSkipped(ITestResult result) {
        LogsUtil.info("Test Case " + result.getName() + " skipped");
    }

}
