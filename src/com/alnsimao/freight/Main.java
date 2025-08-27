package com.alnsimao.freight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Freight Calculator -----");

        System.out.println("Enter destination street name: ");
        String destinationStreet = sc.nextLine();

        System.out.println("Enter destination number: ");
        int destinationNumber = sc.nextInt();
        sc.nextLine(); 

        Address destinationAddress = new Address(destinationStreet, destinationNumber);

     
        Freight freight = new Freight();
        freight.setAddress(destinationAddress);

        System.out.println("Enter the distance in km: ");
        double distance = sc.nextDouble();
        sc.nextLine();
        freight.setDistance(distance);

     
        List<Package> packages = new ArrayList<>();

        boolean addMorePackages;
        do {
            System.out.println("----- Add a new Package -----");

            System.out.println("Enter package ID: ");
           String packageId = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter package notes: ");
            String packageNotes = sc.nextLine();

            System.out.println("Enter origin street: ");
            String originStreet = sc.nextLine();

            System.out.println("Enter origin number: ");
            int originNumber = sc.nextInt();
            sc.nextLine();

            Address packageOrigin = new Address(originStreet, originNumber);

           
            List<Cargo> cargoList = new ArrayList<>();

            boolean addMoreCargo;
            do {
                System.out.println("----- Add new Cargo -----");

                System.out.println("Enter cargo description: ");
                String cargoDescription = sc.nextLine();

                System.out.println("Enter cargo mass (kg): ");
                double cargoMass = sc.nextDouble();
                sc.nextLine();

                Cargo cargo = new Cargo(cargoDescription, cargoMass);
                cargoList.add(cargo);

                System.out.println("Do you want to add another cargo to this package? (y/n)");
                addMoreCargo = sc.nextLine().equalsIgnoreCase("y");

            } while (addMoreCargo);

            
            Package pack = new Package();
            pack.setId(packageId);
            pack.setNotes(packageNotes);
            pack.setAddress(packageOrigin);
            pack.setListCargo(cargoList);

            packages.add(pack);

            System.out.println("Do you want to add another package? (y/n)");
            addMorePackages = sc.nextLine().equalsIgnoreCase("y");

        } while (addMorePackages);

        
        for (Package p : packages) {
            freight.addPackage(p);
        }

        
        System.out.println("\n----- Freight Summary -----");
        freight.displayPackages();
        freight.calculateFreightValue();
        System.out.println("Total freight cost: $" + freight.getValue());
        
        packages.forEach(p -> {
        	p.displayCargo();
        });
        
       
        
       
       
        sc.close();
    }
}
