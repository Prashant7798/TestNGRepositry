package RetryLogicDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer 
{

	public void transform(ITestAnnotation testAnnotation, Class testclass, Constructor testConstructor, Method testMethod)
	{
		testAnnotation.setRetryAnalyzer(RetryAnalyser.class);
		
	}
}
