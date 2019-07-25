package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {				
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		/*
		System.out.println("\n=== TEST 1: Seller findById ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
			
		System.out.println("\n=== TEST 3: Seller findAll ===");
		
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Seller Insert ===");
		
		Seller newseller = new Seller(0, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newseller);	
		System.out.println("Inserted! new Id = " + newseller.getId());
		
		System.out.println("\n=== TEST 5: Seller Insert ===");
		
		seller = sellerDao.findById(5);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		*/
		
		System.out.println("\n=== TEST 6: Seller Insert ===");
		
		System.out.println("Enter id for delete: ");
		int id = sc.nextInt();
		sellerDao.delete(id);
		System.out.println("Delete completed!");
		
		sc.close();
				
	}
}
