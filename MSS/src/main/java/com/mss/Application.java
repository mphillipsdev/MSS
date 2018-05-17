package com.mss;

public class Application
{

	public static void main(String[] args)
	{
		String x = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque id rutrum sapien, at rhoncus sem. Nullam mauris nibh, iaculis eu sollicitudin non, scelerisque at arcu. Donec ut mi eros. Integer faucibus, mauris et convallis pretium, lacus lorem gravida purus, mattis consectetur felis justo vitae diam. Maecenas in magna maximus, dignissim est et, mattis dolor. Vivamus convallis tincidunt nisl a efficitur. Phasellus nec tempus diam. Praesent molestie id ligula vel semper. Praesent ultrices rhoncus turpis. Pellentesque non sodales justo. Praesent ornare sagittis felis, nec ultricies odio congue non. In hac habitasse platea dictumst. Praesent pharetra diam elit, a vulputate leo malesuada sit amet.";
		
		System.out.println(recursivelyReverseString(0, x));
	}

	public static String recursivelyReverseString(int index, String stringX)
	{
		if(stringX.length() < 2)
		{
			return stringX;
		}
		char[] string = stringX.toCharArray();
		if(stringX.length() == 2)
		{
			swapInPlace(string, 0, 1);
			return String.valueOf(string);
		}
		if(stringX.length() == 3)
		{
			swapInPlace(string, 0, 2);
			return String.valueOf(string);
		}
		if(index <= stringX.length() / 2)
		{ 
			int endex = stringX.length() - 1 - index;
			swapInPlace(string, index, endex);
			System.out.println(stringX);
			stringX = recursivelyReverseString(++index, String.valueOf(string));
		}
		return stringX;
	}
	
	public static char[] swapInPlace(char[] string, int index, int endex)
	{
		string[index] = (char)((int)string[endex] + (int)string[index]);
		string[endex] = (char)((int)string[index] - (int)string[endex]);
		string[index] = (char)((int)string[index] - (int)string[endex]);
		return string;
	}
}
