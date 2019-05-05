package src.Symulation;


import src.Model.Lane;
import src.Model.Road;

import java.util.concurrent.TimeUnit;

public class View {
    private Road x;

    public View(Road x_){
        x=x_;
    }

    public void view() throws Throwable{
        for (int j = 0; j < x.getRightLanes().get(0).getMaxLength(); j++) {// Linia
            System.out.print("=");
        }
        System.out.println("");


        //////////////////////////////////////////////////////////////////////////////////////////// L  E  W  Y
        for (int i = 0; i < x.getLeftLanes().size(); i++) { //      ??
            Lane tmp = x.getLeftLanes().get(i);
            int z = 0;



            for (int j = x.getLeftLanes().get(0).getMaxLength() - 1; j >= 0 && z<tmp.getListOfVehicles().size(); j--) {// Linia
                if (tmp.getListOfVehicles().get(z).getPositionX() == j) {
                    System.out.print(z); //tmp.getListOfVehicles().get(z).getId()
                    z = z <= tmp.getListOfVehicles().size() ? ++z : z;
                } else
                    System.out.print(" ");
            }
            System.out.println("");

            if (x.getRightLanes().size() - 1 != i) {
                for (int j = 0; j < x.getLeftLanes().get(0).getMaxLength(); j++) {// Linia
                    System.out.print("-");
                }
                System.out.println("");
            }

            //for (Vehicle x: tmp.getListOfVehicles()) {
            //   System.out.println(x);
            //}


        }


        /////////////////////////////////////////////////////////////////////////////////////////////////////

        for (int j = 0; j < x.getRightLanes().get(0).getMaxLength(); j++) {// Linia Pomiedzy
            System.out.print("=");
        }

        System.out.println("");
        for (int i = 0; i < x.getLeftLanes().size(); i++) { //      ??
            Lane tmp = x.getRightLanes().get(i);

            int z = tmp.getListOfVehicles().size()-1;

            for (int j = 0; j < x.getLeftLanes().get(0).getMaxLength() && z<tmp.getListOfVehicles().size(); j++) {// Linia
                if (z >=0 && tmp.getListOfVehicles().get(z).getPositionX() == j) {
//                    System.out.print(">");
                    System.out.print(z);//tmp.getListOfVehicles().get(z).getId()
                    z = z > 0 ? --z : z;
                } else
                    System.out.print(" ");
            }

            System.out.println("");

            if (x.getLeftLanes().size() - 1 != i) {
                for (int j = 0; j < x.getLeftLanes().get(0).getMaxLength(); j++) {// Linia
                    System.out.print("-");
                }
                System.out.println("");
            }

            //for (Vehicle y: x.getLeftLanes().get(0).getListOfVehicles()) {
            //    System.out.println(y);
            //}


        }
        for (int j = 0; j < x.getRightLanes().get(0).getMaxLength(); j++) {// Linia
            System.out.print("=");
        }




        System.out.println("");

        //for (Vehicle a:x.getRightLanes().get(1).getListOfVehicles()) {
        //    System.out.println(a);
        //}




        System.out.println("");
        System.out.println("");

        System.out.println("");





        System.out.println("");

        TimeUnit.SECONDS.sleep(1);
    }

}
