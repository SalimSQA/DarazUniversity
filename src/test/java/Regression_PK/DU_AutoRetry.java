package Regression_PK;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class DU_AutoRetry implements IRetryAnalyzer {

    // Testing


    private int retryCount = 0;
    private static final int maxRetryCount = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}