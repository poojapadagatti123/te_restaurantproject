package com.technoelevate.restaurant;

public class GetItem {

	Items [] listItem=new Items[10];
	Items  item1=new Items("Chapati",35.6, 1);
	Items  item2=new Items("FriedRice",80.0, 2);
	Items  item3=new Items("Roti",40, 3);
	Items  item4=new Items("Poori",35, 4);
	Items  item5=new Items("Dosa",25, 5);
	Items  item6=new Items("KajuMasala",160, 6);
	Items  item7=new Items("KurmaBhaji", 90.00,7);
	Items  item8=new Items("ChikenMasala",160.00,8);
	Items  item9=new Items("PalakPanner", 170.00,9);
	Items  item10=new Items("GheeRice", 130.00,10);
	
	
	void createItem() {
		listItem[0]=item1;
		listItem[1]=item2;
		listItem[2]=item3;
		listItem[3]=item4;
		listItem[4]=item5;
		listItem[5]=item6;
		listItem[6]=item7;
		listItem[7]=item8;
		listItem[8]=item9;
		listItem[9]=item10;
		
	}


	public void displayItem() {
		 for(int i=0;i<listItem.length;i++) {
			 System.out.println(listItem[i].id+"  "+listItem[i].items+"( Rs "+listItem[i].price+")");		
          System.out.println();
		 
		 
		 }	
		 
		 
}

	
	public Items[] getListItem() {
		createItem();
		return listItem;
	}

	
}
