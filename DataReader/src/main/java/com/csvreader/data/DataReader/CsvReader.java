package com.csvreader.data.DataReader;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;


public class CsvReader {

	
	public void CsvProcesser(String file_path)  {
		String line="";
		String delimeter=",";
		int i=0;
		ArrayList<CobaltData> data=new ArrayList<CobaltData>();
		LinkedList<CsvHeader> header=new LinkedList<CsvHeader>();
		try {
		BufferedReader br = new BufferedReader(new FileReader(new File(file_path)));
	
		while ((line = br.readLine()) != null) {
			
			i++;
			String [] csv_rows=line.split(delimeter);
			if(i==1)
			{
			CsvHeader cv=new CsvHeader();
			cv.setHeaderOne(csv_rows[0]);
			cv.setHeaderTwo(csv_rows[1]);
			cv.setHeaderThree(csv_rows[2]);
			cv.setHeaderFour(csv_rows[3]);
			cv.setHeaderFive(csv_rows[4]);
			cv.setHeaderSix(csv_rows[5]);
			cv.setHeaderSeven(csv_rows[6]);
			header.add(cv);
			System.out.println(header.get(0).getHeaderOne()+" "
			+header.get(0).getHeaderTwo()+" "+
			header.get(0).getHeaderThree()+" "+header.get(0).getHeaderFour()+" "+
			header.get(0).getHeaderFive()+" "+header.get(0).getHeaderSix()+" "+
			header.get(0).getHeaderSeven());
			
			}
		else if(i<=50)
			{
			
			    CobaltData cd=new CobaltData();
				cd.setDate(csv_rows[0]);
				cd.setCash_buyer(csv_rows[1]);
				cd.setCash_seller(csv_rows[2]);
				cd.setThree_month_buyer(csv_rows[3]);
				cd.setThree_month_seller(csv_rows[4]);
				cd.setYearly_buyer(csv_rows[5]);
				cd.setYearly_seller(csv_rows[6]);
				data.add(cd);
				for(int j=0;j<data.size();j++) {
					
				System.out.println(data.get(j).getDate()+" "+data.get(j).getCash_buyer()+" "+
				data.get(j).getCash_seller()+" "+data.get(j).getThree_month_buyer()+" "
				+data.get(j).getThree_month_seller()+" "
				+data.get(j).getYearly_buyer()+
				" "+data.get(j).getYearly_seller());
				
			}}		}}
		
		catch(IOException e)
		{
		
		e.printStackTrace();
		
	}
		
	

}
}
