package com.dedic.oop;

import com.dedic.oop.model.Equipment;
import com.dedic.oop.model.Warehouse;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Equipment rope = new Equipment(
                "Tali Rescue",
                "Vertical Rescue",
                10
        );

        Equipment helmet = new Equipment(
                "Helm SAR",
                "Safety",
                5
        );

        Equipment radio = new Equipment(
                "HT Radio",
                "Communication",
                7
        );

        Equipment HT = new Equipment("HT","communication",10);

        warehouse.addEquipment(rope);
        warehouse.addEquipment(helmet);
        warehouse.addEquipment(radio);
        warehouse.addEquipment(HT);

        warehouse.showAllEquipments();

        warehouse.borrowEquipment("HT Radio", 2);

        System.out.println();
        System.out.println("SETELAH PEMINJAMAN");
        System.out.println("====================");

        warehouse.showAllEquipments();
    }
}