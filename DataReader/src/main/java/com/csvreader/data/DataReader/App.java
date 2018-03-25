package com.csvreader.data.DataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String path=args[0];
    	Properties prop = new Properties();
    	InputStream input = null;

    	try {

    		input = new FileInputStream(path);

    		// load a properties file
    		prop.load(input);

    		// get the property value and call CsvReader
    		String file_path=prop.getProperty("src_file_path");
            CsvReader reader=new CsvReader();
            reader.CsvProcesser(file_path);

    	} catch (IOException ex) {
    		ex.printStackTrace();
    	} finally {
    		if (input != null) {
    			try {
    				input.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}

      }
    }

//