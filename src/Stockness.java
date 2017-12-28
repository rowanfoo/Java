


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.jsoup.nodes.Attribute;
/**
 * import ASX news from ASX website
 * @author rowan
 *
 */
public class Stockness {

	
	private void  mytable(Element tb ){
		System.out.println("mytable");
		Elements ele= tb.select("tr");
		//System.out.println("ele:"+ele );
	
		 int vol =0;
		for(Element rows : ele  ){
			
			boolean ok = false;
			int count =0;
			
			for(Element e : rows.select("td")  ){
				if(e.text().endsWith("pm")  ){
					//System.out.println("time:"+e.text().substring(0, e.text().indexOf(":")));
					//  e.text().substring(0, e.text().indexOf(":"));
					 int hr = Integer.parseInt(e.text().substring(0, e.text().indexOf(":")) );
					 if(hr >= 4 & hr < 12  ){
							System.out.println("time:"+e.text() );
							ok=true;
									 
					 }
					
				
				}
				
				if(ok & count==3){
			
				
					int num = Integer.parseInt(e.text().replaceAll(",",""));
					System.out.println("num"+ num );
					vol += num;
					System.out.println("vol: "+ vol );
					
				}
				 //3
				 count++;	
			}
		
			
		}
		
		
	}
	
	public void run(){
		String url = "http://stocknessmonster.com/stock-trades?S=BHP&E=ASX";
		System.out.println("RUNB");

		try {
			int count = 0;
			Document doc = Jsoup.connect(url).get();

			Elements table = doc.select("table");
			System.out.println("RUNB 12:"+table.size());
			System.out.println("RUNB 12");
			int x=0;
			for(Element tb :  table  ){
			
				//System.out.println("RUNB tb:"+);
		/*
				tb.attributes().forEach( (Attribute s)->{
					int x=0;
					//System.out.println("Attribute tb:"+s.getKey()+":"+s.getValue());
					if(s.getKey().equalsIgnoreCase("width")&&s.getValue().equalsIgnoreCase("100%")   ){
						if(x==0){
							//System.out.println("tb:"+  tb );
							mytable( tb );
						}
						x++;
					}
				}
						
						
						);
				*/
				
				
				
				for(Attribute ab:tb.attributes()  ){
//					System.out.println("Attribute tb:"+ab.getKey()+":"+ab.getValue());
					if(ab.getKey().equalsIgnoreCase("width")&&ab.getValue().equalsIgnoreCase("100%")   ){
						System.out.println("Attribute tb:"+ab.getKey()+":"+ab.getValue());
						if(x==2){
							//System.out.println("tb:"+  tb );
							mytable( tb );
							
						}
						x++;
					}
				
				}
				
				
		}
		

		} catch (Exception e) {
			System.out.println("Error:" + e);

		}
	
	}
	
	
	
	public static void main(String[] args) {

		
	
		new Stockness().run();
			    
		
			        	
			        	
			        	
			        	
			   
			    
		

		
			
			
			  }
		
		
		

	

}
