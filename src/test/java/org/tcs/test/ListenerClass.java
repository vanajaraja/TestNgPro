package org.tcs.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ListenerClass implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstrcutor, Method testMethod) {
		
		annotation.setRetryAnalyzer(Rerun.class);
	}

}
