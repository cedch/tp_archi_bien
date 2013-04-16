package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
                ListItems listItems = new ListItems();
                gildedRose.updateQuality(listItems);
	}
    public void updateQuality(ListItems list) {
        for (int i = 0; i < list.size(); i++) {
            
    		if (! list.isEqual(i,"Aged Brie") && !list.isEqual(i,"Backstage passes to a TAFKAL80ETC concert") && !list.isEqual(i,"Sulfuras, Hand of Ragnaros") && list.getQuality(i) > 0) {
                    list.setQuality(i,list.getQuality(i) - 1);
    		} if(list.isEqual(i,"Aged Brie") && list.isEqual(i,"Backstage passes to a TAFKAL80ETC concert")) {
    			if (list.getQuality(i) < 50) {
    				list.setQuality(i,list.getQuality(i) + 1);
    				if (list.isEqual(i,"Backstage passes to a TAFKAL80ETC concert")) {
    					if (list.get(i).getSellIn() < 11) {
    						if (list.getQuality(i) < 50) {
    							list.setQuality(i,list.getQuality(i) + 1);
    						}
    					}
    					if (list.get(i).getSellIn() < 6) {
    						if (list.getQuality(i) < 50) {
    							list.setQuality(i,list.getQuality(i) + 1);
    						}
    					}
    				}
    			}
    		}
    		if (!list.isEqual(i,"Sulfuras, Hand of Ragnaros")) {
    			list.get(i).setSellIn(list.get(i).getSellIn() - 1);
    		}
    		if (list.get(i).getSellIn() < 0) {
    			if (!list.isEqual(i,"Aged Brie")) {
    				if (!list.isEqual(i,"Backstage passes to a TAFKAL80ETC concert")) {
    					if (list.getQuality(i) > 0) {
    						if (!list.isEqual(i,"Sulfuras, Hand of Ragnaros")) {
    							list.setQuality(i,list.getQuality(i) - 1);
    						}
    					}
    				} if(list.isEqual(i,"Backstage passes to a TAFKAL80ETC concert")) {
    					list.setQuality(i,list.getQuality(i)- list.getQuality(i));
    				}
    			} if(list.isEqual(i,"Aged Brie")) {
    				if (list.getQuality(i) < 50) {
    					list.setQuality(i,list.getQuality(i) + 1);
    				}
    			}
    		}
    	}
    }
}
