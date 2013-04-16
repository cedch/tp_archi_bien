package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class ListItems {
    
    private ArrayList <Item> itemList;
    
    public ListItems(){
        
        itemList = new ArrayList();
        makeItems();
        
    }
    
     public void makeItems() {
		itemList.add(new Item("+5 Dexterity Vest", 10, 20));
		itemList.add(new Item("Aged Brie", 2, 0));
		itemList.add(new Item("Elixir of the Mongoose", 5, 7));
		itemList.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		itemList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		itemList.add(new Item("Conjured Mana Cake", 3, 6));
    }
  
     public int size(){
         ArrayList <Item> tailleListe = new ArrayList ();
         tailleListe = this.itemList;
         return tailleListe.size();
     }
     public boolean isEqual(int index, String value){
         Item currentItem = itemList.get(index);
         String itemName = currentItem.getName();
         return itemName.equals(value);
     }
    public int getQuality(int index){
        Item currentItem = itemList.get(index);
        return currentItem.getQuality();
     }
     public void setQuality(int index,int qualityNeeded){
         Item currentItem = itemList.get(index);
         currentItem.setQuality(qualityNeeded);
     }
     public ArrayList getItemList(){
         return this.itemList;
     }
}
