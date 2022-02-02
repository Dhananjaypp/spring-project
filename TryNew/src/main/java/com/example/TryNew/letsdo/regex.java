package com.example.TryNew.letsdo;
import java.util.regex. * ;

	
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class regex 
	{
	    public static void main(String[] args)
	    {
	    	int $EMS_00664=60;
	    	int $EMS_00665=30;
	        String string = " {$EMS_00664} *10+ {$EMS_00665} *10";
	        Pattern pattern = Pattern.compile("(\\{)(.*?)(\\})");
	        Matcher matcher = pattern.matcher(string);

	        List<String> listMatches = new ArrayList<String>();

	        while(matcher.find())
	        {
	            listMatches.add(matcher.group(2));
	        }

	        for(String s : listMatches)
	        {
	            System.out.println(s);
	            
	         
	        }
	    }
	}

