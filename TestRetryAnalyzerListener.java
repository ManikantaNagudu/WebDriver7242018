package TestNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public abstract class TestRetryAnalyzerListener implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(TestRetryAnalyzer.class);
    }
}
	


