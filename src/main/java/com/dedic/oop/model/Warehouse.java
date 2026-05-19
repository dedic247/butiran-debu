package com.dedic.oop.model;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Equipment> equipments;

    public Warehouse() {
        equipments = new ArrayList<>();
    }

    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    public void showAllEquipments() {

        System.out.println("DAFTAR ALAT SAR");
        System.out.println("====================");

        for (Equipment equipment : equipments) {
            equipment.displayInfo();
        }
    }

    public void borrowEquipment(String name, int amount) {

        for (Equipment equipment : equipments) {

            if (equipment.getName().equalsIgnoreCase(name)) {

                equipment.reduceStock(amount);

                System.out.println(amount + " unit " + name + " dipinjam");
                return;
            }
        }

        System.out.println("Alat tidak ditemukan");
    }
}