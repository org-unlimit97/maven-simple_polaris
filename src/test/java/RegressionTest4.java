import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello ");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str28 = app0.greet("");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello " + "'", str24, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str26, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello " + "'", str28, "Hello ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str34, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass19 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello ");
        java.lang.String str24 = app0.greet("Hello ");
        java.lang.String str26 = app0.greet("Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello ");
        java.lang.String str30 = app0.greet("Hello Hello ");
        java.lang.String str32 = app0.greet("Hello Hello ");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str36 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str38 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str40 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str42 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str44 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str46 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str48 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello " + "'", str24, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello hi!" + "'", str26, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello " + "'", str30, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello " + "'", str32, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str34, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str36, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str38, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str40, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str42, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str44, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str46, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str48, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("Hello Hello ");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello ");
        java.lang.String str30 = app0.greet("hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello hi!" + "'", str22, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello " + "'", str26, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello hi!" + "'", str30, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str34, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("Hello Hello ");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass19 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str4, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello " + "'", str10, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str12, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello ");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello hi!" + "'", str20, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello " + "'", str24, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("hi!");
        java.lang.String str6 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello hi!" + "'", str4, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str6, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str10, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass23 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("Hello hi!");
        java.lang.String str8 = app0.greet("Hello hi!");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str18 = app0.greet("");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello hi!" + "'", str6, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello hi!" + "'", str8, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello " + "'", str18, "Hello ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello ");
        java.lang.String str20 = app0.greet("Hello Hello Hello ");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello " + "'", str18, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello " + "'", str20, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello Hello ");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello hi!");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello " + "'", str10, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str20, "Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello Hello ");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str18 = app0.greet("Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello " + "'", str10, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello ");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str28 = app0.greet("Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello ");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass35 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello " + "'", str22, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello hi!" + "'", str28, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello " + "'", str32, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str34, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass15 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str10, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello ");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello " + "'", str26, "Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass25 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello hi!" + "'", str22, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello Hello ");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str18 = app0.greet("Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello " + "'", str10, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str6 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str8 = app0.greet("Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str4, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str6, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("Hello hi!");
        java.lang.String str8 = app0.greet("Hello hi!");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass17 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello hi!" + "'", str6, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello hi!" + "'", str8, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello ");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello ");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello ");
        java.lang.String str36 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello " + "'", str26, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello " + "'", str34, "Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str36, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass27 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello " + "'", str18, "Hello ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello hi!" + "'", str22, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str6 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass11 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str4, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str6, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str10, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello ");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello ");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str32 = app0.greet("");
        java.lang.Class<?> wildcardClass33 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello " + "'", str26, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str30, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello " + "'", str32, "Hello ");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello ");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass25 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello " + "'", str20, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("Hello hi!");
        java.lang.String str8 = app0.greet("Hello hi!");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello ");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass23 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello hi!" + "'", str6, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello hi!" + "'", str8, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello " + "'", str20, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.Class<?> wildcardClass21 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("Hello hi!");
        java.lang.String str8 = app0.greet("Hello hi!");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello ");
        java.lang.String str12 = app0.greet("hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass27 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello hi!" + "'", str6, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello hi!" + "'", str8, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello " + "'", str10, "Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello hi!" + "'", str12, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str14, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str4, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello hi!" + "'", str12, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("Hello hi!");
        java.lang.String str8 = app0.greet("Hello hi!");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str20 = app0.greet("Hello Hello ");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello hi!" + "'", str6, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello hi!" + "'", str8, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str18, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello " + "'", str20, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello " + "'", str10, "Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello hi!" + "'", str22, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str34, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str24 = app0.greet("");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello hi!");
        java.lang.String str30 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str32 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str34 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str36 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str38 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello " + "'", str24, "Hello ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str30, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str32, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str34, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str36, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str38, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello Hello Hello ");
        java.lang.String str18 = app0.greet("Hello Hello ");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello ");
        java.lang.String str22 = app0.greet("Hello Hello hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str28 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello Hello " + "'", str16, "Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Hello Hello " + "'", str18, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello " + "'", str20, "Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello hi!" + "'", str22, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str28, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("Hello Hello Hello Hello Hello ");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str14 = app0.greet("Hello Hello hi!");
        java.lang.String str16 = app0.greet("Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Hello Hello Hello Hello Hello " + "'", str4, "Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str10, "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello hi!" + "'", str14, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.Class<?> wildcardClass13 = app0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str10, "Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello hi!");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("hi!");
        java.lang.String str16 = app0.greet("Hello ");
        java.lang.String str18 = app0.greet("hi!");
        java.lang.String str20 = app0.greet("Hello Hello hi!");
        java.lang.String str22 = app0.greet("hi!");
        java.lang.String str24 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str26 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str28 = app0.greet("Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello hi!" + "'", str10, "Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello hi!" + "'", str14, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello " + "'", str16, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello hi!" + "'", str18, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello hi!" + "'", str22, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str24, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str26, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello Hello Hello Hello hi!" + "'", str28, "Hello Hello Hello Hello hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("Hello Hello Hello Hello Hello hi!");
        java.lang.String str4 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str6 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello Hello Hello Hello Hello Hello hi!" + "'", str2, "Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str4, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str6, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("");
        java.lang.String str8 = app0.greet("");
        java.lang.String str10 = app0.greet("Hello Hello ");
        java.lang.String str12 = app0.greet("Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str16 = app0.greet("Hello Hello hi!");
        java.lang.String str18 = app0.greet("");
        java.lang.String str20 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str22 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello " + "'", str6, "Hello ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello " + "'", str8, "Hello ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello " + "'", str10, "Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello " + "'", str12, "Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hello Hello Hello hi!" + "'", str16, "Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello " + "'", str18, "Hello ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str20, "Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str22, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.github.jitpack.App app0 = new com.github.jitpack.App();
        java.lang.String str2 = app0.greet("hi!");
        java.lang.String str4 = app0.greet("");
        java.lang.String str6 = app0.greet("Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str8 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        java.lang.String str10 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str12 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello ");
        java.lang.String str14 = app0.greet("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello hi!" + "'", str2, "Hello hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello " + "'", str4, "Hello ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str6, "Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!" + "'", str8, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str10, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str12, "Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello " + "'", str14, "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello ");
    }
}

