package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getEndDate());
		System.out.println(arg0.getFailedTests());
		System.out.println(arg0.getPassedTests());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Name:"+arg0.getClass());
		System.out.println(arg0.getStartDate());
		System.out.println(arg0.getAllTestMethods().toString());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Name:"+arg0.getClass());
		System.out.println("Test Name:"+arg0.getName());
		System.out.println("Test Status:"+arg0.getStatus());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Name:"+arg0.getClass());
		System.out.println("Test Name:"+arg0.getName());
		System.out.println("Test Satuts:"+arg0.getStatus());
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Name:"+arg0.getClass());
		System.out.println("Test Name:"+arg0.getName());
		System.out.println("Test Satuts:"+arg0.getStatus());
		
	}

}
