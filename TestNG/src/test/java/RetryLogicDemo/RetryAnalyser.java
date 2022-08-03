package RetryLogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{

	//counter to keep track of retry attempts
	int counterforRetryAttempt = 0;
	
	//set max limit for retry
	int setMaxlimitForRetry = 3;
    
	
	//method to retry fail to test casese
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess())
		{
			if(counterforRetryAttempt < setMaxlimitForRetry)
			{
				counterforRetryAttempt++;
				
			}
		}
		return false;		

	}
	
	
}
