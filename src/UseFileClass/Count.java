package UseFileClass;

public class Count {

	public static void main(String[] args) throws java.io.IOException
    {
		Thread ObjectData = new Thread();
		String StringData = "Java Mania";
		char CharArrayData[] = { 'a', 'b', 'c' };
		int IntegerData = 4;
		long LongData = Long.MIN_VALUE;
		float FloatData = Float.MAX_VALUE;
		double DoubleData = Math.PI;
		boolean BooleanData = true;

		System.out.println("object = " + ObjectData);//printing a Thread yields a string of this format
		//ThreadClass[name,priority,group]
		System.out.println("string = " + StringData);
		System.out.println("character array = " + CharArrayData);
		System.out.println("integer = " + IntegerData);
		System.out.println("long = " + LongData);
		System.out.println("float = " + FloatData);
		System.out.println("double = " + DoubleData);
		System.out.println("boolean = " + BooleanData);
        System.out.println("Input has chars.");

        int count = 0;
        char input = (char) System.in.read();
        System.out.println(input);
        while (input != -1)
            count++;
        System.out.println("Input has " + count + " chars.");
    }

}
