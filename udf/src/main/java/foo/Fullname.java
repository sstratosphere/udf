package foo;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

@Description(name="fullname",
value = "_FUNC_(name)- from the input string"+"returns Fullname ",
extended = "Example _Func_('aaple') from src;\n")
public class Fullname extends UDF{

	public Fullname (){
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	}
	public String evaluate(String shortname)
	{ 
		if(shortname == "aapl" || shortname =="AAPL")
		{
			return "APPLE";
		}
		else
			return shortname;
			
	}
}
	
