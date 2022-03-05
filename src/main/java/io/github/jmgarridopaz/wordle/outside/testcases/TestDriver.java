package io.github.jmgarridopaz.wordle.outside.testcases;

import org.testng.TestNG;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * DRIVER (primary actor)
 *
 * Program that tests the behaviour offered by "forPlaying" port.
 * It calls the application port directly.
 * Doesn't need any adapter.
 * It uses TestNG framework.
 */
public class TestDriver {

    private static final String REPORTS_DIRECTORY = System.getProperty("user.home") + File.separator + "wordletestreports";

    public static void main (String[] args ) {
        // Run TestNG with a XML virtual file
        XmlSuite suite = new XmlSuite();
        suite.setName("Wordle_TestSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("Wordle_Test");

        List<XmlPackage> testPackages = new ArrayList<XmlPackage>();
        String newGameTestPackageName = TestDriver.class.getPackage().getName();
        testPackages.add( new XmlPackage(newGameTestPackageName) );
        test.setPackages(testPackages);

//        List<XmlClass> testClasses = new ArrayList<XmlClass>();
//        testClasses.add ( new XmlClass(HardcodedTest.class) );
//        test.setClasses(testClasses);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        TestNG testng = new TestNG();

        testng.setXmlSuites(suites);

        testng.setOutputDirectory (REPORTS_DIRECTORY);

        System.out.println();
        System.out.println("=====");
        System.out.println("Reports will be generated in the following output directory:");
        System.out.println( testng.getOutputDirectory() );
        System.out.println("=====");
        System.out.println();

        testng.run();
    }

}
