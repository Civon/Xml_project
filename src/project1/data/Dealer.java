/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.data;

// import java.util.ArrayList;

import java.util.Vector;

// import java.util.List;

/**
 *
 * @author Transpar
 */
public class Dealer extends Company{
	static protected Vector soldList ;
	protected Vector neededList;
	protected Company companyInfo;
        // protected Vector productList;
	// protected List<Sold> soldList;
	// protected List<Needed> neededList;
	// protected List<Product> productList;
//	private 

	public Dealer(){
		soldList = new Vector();
		neededList = new Vector();
		companyInfo = new Company();
		// productList = new Vector();

	}
        
        public void addSold(Sold s){
            soldList.add(s);
        } 
        
        public void addNeeded(Needed n){
			soldList.add(n);
		}
		public Vector getSoldList(){
			return soldList;
		}

		public Vector getNeededList(){
			return neededList;
		}
                public  void setNeededList(Vector n){
                    this.neededList = n;
                }
                public  void setSoldList(Vector n){
                    this.soldList = n;
                }
                
                public Vector convertN(Vector )
		// public void addProduct(Product )
//                public static Vector getTable(){
//                    return soldList;
//				}
//				
//				public static void convertXML(Vector v){
//					
//				}
                
}
