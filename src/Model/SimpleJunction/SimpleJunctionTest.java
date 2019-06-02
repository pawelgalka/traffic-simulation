package Model.SimpleJunction;

import Model.Destination;
import Model.Road.Road;
import Model.Road.RoadUpdateStructure;
import Model.Vehicle;
import Symulation.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SimpleJunctionTest {
    public static void main(String[] args) {
        RoadUpdateStructure roadUpdateStructure = new RoadUpdateStructure();

        Road OfiarKatyniaZarzecze = new Road();
        roadUpdateStructure.addRoad(OfiarKatyniaZarzecze);
        OfiarKatyniaZarzecze.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        OfiarKatyniaZarzecze.new Lane(15, Road.DIRECTION.LEFT,true,0),
                        OfiarKatyniaZarzecze.new Lane(15, Road.DIRECTION.LEFT,true,1),
                        OfiarKatyniaZarzecze.new Lane(15, Road.DIRECTION.LEFT,true,2))));

        OfiarKatyniaZarzecze.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        OfiarKatyniaZarzecze.new Lane(15, Road.DIRECTION.RIGHT,true,0),
                        OfiarKatyniaZarzecze.new Lane(15, Road.DIRECTION.RIGHT,true,1),
                        OfiarKatyniaZarzecze.new Lane(15, Road.DIRECTION.RIGHT,true,2))));


        Road ZarzeczePrzegorzaly = new Road();
        roadUpdateStructure.addRoad(ZarzeczePrzegorzaly );
        ZarzeczePrzegorzaly.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        ZarzeczePrzegorzaly.new Lane(20, Road.DIRECTION.LEFT,true,0),
                        ZarzeczePrzegorzaly.new Lane(20, Road.DIRECTION.LEFT,true,1),
                        ZarzeczePrzegorzaly.new Lane(20, Road.DIRECTION.LEFT,true,2))));

        ZarzeczePrzegorzaly.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        ZarzeczePrzegorzaly.new Lane(20, Road.DIRECTION.RIGHT,true,0),
                        ZarzeczePrzegorzaly.new Lane(20, Road.DIRECTION.RIGHT,true,1),
                        ZarzeczePrzegorzaly.new Lane(20, Road.DIRECTION.RIGHT,true,2))));

        Road PrzegorzalyRuczaj = new Road();
        roadUpdateStructure.addRoad(PrzegorzalyRuczaj);
        PrzegorzalyRuczaj.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PrzegorzalyRuczaj.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        PrzegorzalyRuczaj.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        PrzegorzalyRuczaj.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        PrzegorzalyRuczaj.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PrzegorzalyRuczaj.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        PrzegorzalyRuczaj.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        PrzegorzalyRuczaj.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road RuczajSolvaySquare = new Road();
        roadUpdateStructure.addRoad(RuczajSolvaySquare);
        RuczajSolvaySquare.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        RuczajSolvaySquare.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        RuczajSolvaySquare.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        RuczajSolvaySquare.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        RuczajSolvaySquare.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        RuczajSolvaySquare.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        RuczajSolvaySquare.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        RuczajSolvaySquare.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road RuczajSolvay = new Road();
        roadUpdateStructure.addRoad(RuczajSolvay);
        RuczajSolvay.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        RuczajSolvay.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        RuczajSolvay.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        RuczajSolvay.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        RuczajSolvay.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        RuczajSolvay.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        RuczajSolvay.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        RuczajSolvay.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road SolvayLagiewniki = new Road();
        roadUpdateStructure.addRoad(SolvayLagiewniki);
        SolvayLagiewniki.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        SolvayLagiewniki.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        SolvayLagiewniki.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        SolvayLagiewniki.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        SolvayLagiewniki.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        SolvayLagiewniki.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        SolvayLagiewniki.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        SolvayLagiewniki.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road LagiewnikiKabelSquare = new Road();
        roadUpdateStructure.addRoad(LagiewnikiKabelSquare);
        LagiewnikiKabelSquare.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        LagiewnikiKabelSquare.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        LagiewnikiKabelSquare.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        LagiewnikiKabelSquare.new Lane(10, Road.DIRECTION.LEFT,true,2))));


        LagiewnikiKabelSquare.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        LagiewnikiKabelSquare.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        LagiewnikiKabelSquare.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        LagiewnikiKabelSquare.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road LagiewnikiKabel = new Road();
        roadUpdateStructure.addRoad(LagiewnikiKabel);
        LagiewnikiKabel.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        LagiewnikiKabel.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        LagiewnikiKabel.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        LagiewnikiKabel.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        LagiewnikiKabel.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        LagiewnikiKabel.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        LagiewnikiKabel.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        LagiewnikiKabel.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road KabelPlaszowPart = new Road();
        roadUpdateStructure.addRoad(KabelPlaszowPart);
        KabelPlaszowPart.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        KabelPlaszowPart.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road KabelPlaszow = new Road();
        roadUpdateStructure.addRoad(KabelPlaszow);
        KabelPlaszow.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        KabelPlaszow.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        KabelPlaszow.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        KabelPlaszow.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        KabelPlaszow.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        KabelPlaszow.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        KabelPlaszow.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        KabelPlaszow.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road PlaszowLegPart = new Road();
        roadUpdateStructure.addRoad(PlaszowLegPart);
        PlaszowLegPart.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PlaszowLegPart.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        PlaszowLegPart.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        PlaszowLegPart.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        PlaszowLegPart.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PlaszowLegPart.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        PlaszowLegPart.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        PlaszowLegPart.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road PlaszowLeg = new Road();
        roadUpdateStructure.addRoad(PlaszowLeg);
        PlaszowLeg.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PlaszowLeg.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        PlaszowLeg.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        PlaszowLeg.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        PlaszowLeg.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PlaszowLeg.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        PlaszowLeg.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        PlaszowLeg.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road LegDywizjonu308 = new Road();
        roadUpdateStructure.addRoad(LegDywizjonu308);
        LegDywizjonu308.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        LegDywizjonu308.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        LegDywizjonu308.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        LegDywizjonu308.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        LegDywizjonu308.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        LegDywizjonu308.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        LegDywizjonu308.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        LegDywizjonu308.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road Dywizjonu308Czyzyny = new Road();
        roadUpdateStructure.addRoad(Dywizjonu308Czyzyny);
        Dywizjonu308Czyzyny.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        Dywizjonu308Czyzyny.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        Dywizjonu308Czyzyny.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        Dywizjonu308Czyzyny.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        Dywizjonu308Czyzyny.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        Dywizjonu308Czyzyny.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        Dywizjonu308Czyzyny.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        Dywizjonu308Czyzyny.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road CzyzynyMistrzejowice = new Road();
        roadUpdateStructure.addRoad(CzyzynyMistrzejowice);
        CzyzynyMistrzejowice.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        CzyzynyMistrzejowice.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road MistrzejowicePolsaduPart1 = new Road();
        roadUpdateStructure.addRoad(MistrzejowicePolsaduPart1 );
        MistrzejowicePolsaduPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        MistrzejowicePolsaduPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road MistrzejowicePolsaduPart2 = new Road();
        roadUpdateStructure.addRoad(MistrzejowicePolsaduPart2);
        MistrzejowicePolsaduPart2.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        MistrzejowicePolsaduPart2.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road PolsaduImbramowski = new Road();
        roadUpdateStructure.addRoad(PolsaduImbramowski);
        PolsaduImbramowski.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        PolsaduImbramowski.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road ImbramowskiWobromskiPart1 = new Road();
        roadUpdateStructure.addRoad(ImbramowskiWobromskiPart1);
        ImbramowskiWobromskiPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        ImbramowskiWobromskiPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road ImbramowskiWobromskiPart2 = new Road();
        roadUpdateStructure.addRoad(ImbramowskiWobromskiPart2);
        ImbramowskiWobromskiPart2.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        ImbramowskiWobromskiPart2.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        Road WobromskiOfiarKatyniaPart1 = new Road();
        roadUpdateStructure.addRoad(WobromskiOfiarKatyniaPart1);
        WobromskiOfiarKatyniaPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        WobromskiOfiarKatyniaPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.RIGHT,true,2))));

        Road WobromskiOfiarKatyniaPart2 = new Road();
        roadUpdateStructure.addRoad( WobromskiOfiarKatyniaPart2);
        WobromskiOfiarKatyniaPart2.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.LEFT,true,0),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.LEFT,true,1),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.LEFT,true,2))));

        WobromskiOfiarKatyniaPart2.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.RIGHT,true,0),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.RIGHT,true,1),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.RIGHT,true,2))));


        JunctionStructure ZarzeczeStructure = new JunctionStructure(OfiarKatyniaZarzecze,ZarzeczePrzegorzaly);
        JunctionStructure PrzegorzalyStructure = new JunctionStructure(ZarzeczePrzegorzaly,PrzegorzalyRuczaj);
        JunctionStructure RuczajStructure = new JunctionStructure(PrzegorzalyRuczaj,RuczajSolvaySquare);
        JunctionStructure RuczajSolvayPartStructure = new JunctionStructure(RuczajSolvaySquare,RuczajSolvay,
                false);
        JunctionStructure SolvayMainStructure = new JunctionStructure(RuczajSolvay,SolvayLagiewniki);
        JunctionStructure LagiewnikiStructure = new JunctionStructure(SolvayLagiewniki,LagiewnikiKabelSquare);
        JunctionStructure LagiewnikiKabelPartStructure = new JunctionStructure(LagiewnikiKabelSquare,LagiewnikiKabel,
                false);
        JunctionStructure KabelStructure = new JunctionStructure(LagiewnikiKabel,KabelPlaszowPart);
        JunctionStructure KabelPlaszowPartStructure = new JunctionStructure(KabelPlaszowPart,KabelPlaszow,
                false);
        JunctionStructure PlaszowStructure = new JunctionStructure(KabelPlaszow,PlaszowLegPart);
        JunctionStructure PlaszowLegPartStructure = new JunctionStructure(PlaszowLegPart,PlaszowLeg,
                false);
        JunctionStructure LegStructure = new JunctionStructure(PlaszowLeg,LegDywizjonu308);
        JunctionStructure Dywizjonu308Structure = new JunctionStructure(LegDywizjonu308,Dywizjonu308Czyzyny);
        JunctionStructure CzyzynyStructure = new JunctionStructure(Dywizjonu308Czyzyny,CzyzynyMistrzejowice);
        JunctionStructure MistrzejowiceStructure = new JunctionStructure(CzyzynyMistrzejowice,MistrzejowicePolsaduPart1);

        JunctionStructure MistrzejowicePolsaduPartStructure = new JunctionStructure(MistrzejowicePolsaduPart1,
                MistrzejowicePolsaduPart2,false);

        JunctionStructure PolsaduStructure = new JunctionStructure(MistrzejowicePolsaduPart2,
                PolsaduImbramowski);
        JunctionStructure ImbramowskiStructure = new JunctionStructure(PolsaduImbramowski,ImbramowskiWobromskiPart1);
        JunctionStructure ImbramowskiWolbromskiPartStructure = new JunctionStructure(ImbramowskiWobromskiPart1,
                ImbramowskiWobromskiPart2,false);

        JunctionStructure WolbromskiOfiarKatyniaPartStructure = new JunctionStructure(WobromskiOfiarKatyniaPart1,
                WobromskiOfiarKatyniaPart2,false);

        JunctionStructure WolbromskiStructure = new JunctionStructure(ImbramowskiWobromskiPart2,WobromskiOfiarKatyniaPart1);
        JunctionStructure OfiarKatyniaStructure = new JunctionStructure(WobromskiOfiarKatyniaPart2,OfiarKatyniaZarzecze);

        //JunctionStructure junctionStructure3 = new JunctionStructure(r3,r1);



        Junction Zarzecze = new Junction(ZarzeczeStructure,5);
        Junction Przegorzaly = new Junction(PrzegorzalyStructure,5);
        Junction Ruczaj = new Junction(RuczajStructure ,5);
        Junction Solvay = new Junction(SolvayMainStructure,5);
        Junction Lagiewniki = new Junction(LagiewnikiStructure,5);
        Junction Kabel = new Junction(KabelStructure ,5);
        Junction Plaszow = new Junction(PlaszowStructure,5);
        Junction Leg = new Junction(LegStructure,5);
        Junction Dywizjonow308 = new Junction(Dywizjonu308Structure,5);
        Junction Czyzyny = new Junction(CzyzynyStructure ,5);
        Junction Mistrzejowice = new Junction(MistrzejowiceStructure,5);
        Junction Polsadu  = new Junction(PolsaduStructure ,5);
        Junction Imbramowski = new Junction(ImbramowskiStructure,5);
        Junction Wolbromski = new Junction(WolbromskiStructure,5);
        Junction OfiarKatynia = new Junction(OfiarKatyniaStructure,5);


        GhostJunction RuczajSolvayGhost = new GhostJunction(RuczajSolvayPartStructure);
        GhostJunction LagiewnikiKabelGhost = new GhostJunction(LagiewnikiKabelPartStructure);
        GhostJunction KabelPlaszowGhost = new GhostJunction(KabelPlaszowPartStructure);
        GhostJunction PlaszowLegGhost = new GhostJunction(PlaszowLegPartStructure);
        GhostJunction MistrzejowicePolsaduGhost = new GhostJunction(MistrzejowicePolsaduPartStructure);
        GhostJunction ImbramowskiWolbromskiGhost = new GhostJunction(ImbramowskiWolbromskiPartStructure);
        GhostJunction WolbromskiOfiarKatyniaGhost = new GhostJunction(WolbromskiOfiarKatyniaPartStructure);
        //JunctionNOTUSED junction3 = new JunctionNOTUSED(junctionStructure3,5);

        JunctionUpdateStructure junctionUpdateStructure = new JunctionUpdateStructure();
        junctionUpdateStructure.addRoad(Arrays.asList(Zarzecze,Przegorzaly,Ruczaj,Solvay,Lagiewniki,Kabel,
                Plaszow,Leg,Dywizjonow308,Czyzyny,Mistrzejowice,Polsadu,Imbramowski,Wolbromski,OfiarKatynia,
                RuczajSolvayGhost,LagiewnikiKabelGhost,KabelPlaszowGhost,PlaszowLegGhost,MistrzejowicePolsaduGhost,
                WolbromskiOfiarKatyniaGhost,ImbramowskiWolbromskiGhost));

        //Obsługa auta
        Destination destinationStraight = new Destination(0,0);
        Vehicle tmp2 = new Vehicle(2, 6, 6,Vehicle.TYPE.CAR);
        //TODO add destination to constructor
        OfiarKatyniaZarzecze.getRightLanes().get(0).addVehice(tmp2,0);

        int timer=0;
        while(true){

            System.out.println(tmp2);
            View zajebistywidok = new View(OfiarKatyniaZarzecze);
            try {
                zajebistywidok.view();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            zajebistywidok = new View(ZarzeczePrzegorzaly);
            try {
                zajebistywidok.view();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }

            // First update roads
            try {
                roadUpdateStructure.update();
                junctionUpdateStructure.update(timer);

            } catch (Exception e) {
                e.printStackTrace();
            }
            timer++;
            try {
                TimeUnit.SECONDS.sleep(3/2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
