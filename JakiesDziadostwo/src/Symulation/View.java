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
            showLaneSeparator('=',x.getRightLanes().get(0).getMaxLength());

            for (int i = 0; i < x.getLeftLanes().size(); i++) { //      ??
                Lane tmp = x.getLeftLanes().get(i);
                int indexOfVehicle = 0;

                for (int j = x.getLeftLanes().get(0).getMaxLength() - 1; j >= 0 && indexOfVehicle<tmp.getListOfVehicles().size(); j--) {// Linia
                    if (tmp.getListOfVehicles().get(indexOfVehicle).getPositionX() == j) {
                        System.out.print(indexOfVehicle); //tmp.getListOfVehicles().get(indexOfVehicle).getId()
                        indexOfVehicle = indexOfVehicle <= tmp.getListOfVehicles().size() ? ++indexOfVehicle : indexOfVehicle;
                    } else
                        System.out.print(" ");
                }

                newLine(1);

                if (x.getRightLanes().size() - 1 != i) {
                    showLaneSeparator('-',x.getRightLanes().get(0).getMaxLength());
                }
            }

            showLaneSeparator('=',x.getRightLanes().get(0).getMaxLength());

            for (int i = 0; i < x.getLeftLanes().size(); i++) { //      ??
                Lane tmp = x.getRightLanes().get(i);

                int indexOfVehicle = tmp.getListOfVehicles().size()-1;

                for (int j = 0; j < x.getLeftLanes().get(0).getMaxLength() && indexOfVehicle<tmp.getListOfVehicles().size(); j++) {
                    if (indexOfVehicle >=0 && tmp.getListOfVehicles().get(indexOfVehicle).getPositionX() == j) {
                        System.out.print(indexOfVehicle);   //tmp.getListOfVehicles().get(indexOfVehicle).getId()
                        indexOfVehicle = indexOfVehicle > 0 ? --indexOfVehicle : indexOfVehicle;
                    } else
                        System.out.print(" ");
                }

                newLine(1);

                if (x.getLeftLanes().size() - 1 != i) {
                    showLaneSeparator('-',x.getRightLanes().get(0).getMaxLength());
                }

            }

            showLaneSeparator('=',x.getRightLanes().get(0).getMaxLength());
            newLine(5);
            TimeUnit.SECONDS.sleep(1);
        }

        public void showLaneSeparator(char separator,int length){
            for (int j = 0; j < length; j++) {
                System.out.print(separator);
            }
            System.out.println("");
        }

        public void newLine(int numberOfNewLines){
            for (int i=0;i<numberOfNewLines;i++){
                System.out.println("");
            }
        }
}
