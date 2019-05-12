package src.Symulation;


import src.Model.Road.Lane;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.concurrent.TimeUnit;

public class View {
        private Road x;

        public View(Road x_){
            x=x_;
        }

        public void view() throws Throwable{
            showLaneSeparator('=',x.getRightLanes().get(0).getMaxLength());

            //System.out.println(x.getRightLanes().size());
            for (int i = 0; i < x.getRightLanes().size(); i++) {
                Lane tmp = x.getRightLanes().get(i);
                for (int j = x.getRightLanes().get(0).getMaxLength() - 1; j >= 0; j--) {
                    if (tmp.getPositionOnRoad()[j] != null) {
                        System.out.print("<");
                    } else
                        System.out.print(" ");
                }
                newLine(1);

                if (x.getRightLanes().size() - 1 != i) {
                    showLaneSeparator('-',x.getRightLanes().get(0).getMaxLength());
                }
            }
            showLaneSeparator('=',x.getRightLanes().get(0).getMaxLength());
            Lane tmp=new Lane(12, Lane.DIRECTION.LEFT,false);
            for (int i = 0; i < x.getLeftLanes().size(); i++) {
                tmp = x.getLeftLanes().get(i);

                for (int j = 0; j <tmp.getMaxLength(); j++) {
                    if (tmp.getPositionOnRoad()[j] != null) {
                        System.out.print(">");
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
