package ui.com.jk.sample;

import watij.elements.Button;
import watij.runtime.ie.IE;
import static watij.finders.SymbolFactory.caption;
//import static watij.finders.SymbolFactory.class;
public class SampleIEBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loading();
	}

	private static void loading() {
		// TODO Auto-generated method stub
		
		IE ie = new IE();
		
		try{
			ie.focus();
			String url = "http://www.naver.com";
			ie.start(url);


			//Button btn = ie.button(caption, "");//
			
			//static watij.finders.SymbolFactory.class c;
			
			//Button btn = ie.button( watij.finders.SymbolFactory.class, "btn");//
			
			//System.out.println( btn.html() );
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
