package persistence;

import java.util.List;

public interface ShopADO {

	public void create(Shop shop);
	
	public void delete(Shop shop);
	
	public void update(Shop shop);
	
	public Shop getShop(int id);
	
	public List<Shop> getShopsByCity(String city);
	
	public List<Shop> getShops();

	public int numberOfShops();
	
}