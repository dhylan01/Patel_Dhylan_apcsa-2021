//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner; 

public class CountPairsRunner extends CountPairs
{

    public static void main( String[] args )
    {
        CountPairs test = new CountPairs();
        System.out.println( test.pairCounter("ddogccatppig"));
        System.out.println( test.pairCounter("dogcatpig"));
        System.out.println( test.pairCounter("xxyyzz"));
        System.out.println( test.pairCounter("a"));
        System.out.println( test.pairCounter("abc"));
        System.out.println( test.pairCounter("aabb"));
        System.out.println( test.pairCounter("dogcatpigaabbcc"));
        System.out.println( test.pairCounter("aabbccdogcatpig"));
        System.out.println( test.pairCounter("dogabbcccatpig"));
        System.out.println( test.pairCounter("aaaa"));
        System.out.println( test.pairCounter("AAAAAAAAA"));

    }
}

