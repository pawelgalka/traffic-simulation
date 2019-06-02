package sample;

import Model.Destination;
import Model.Road.Road;
import Model.Road.RoadUpdateStructure;
import Model.SimpleJunction.GhostJunction;
import Model.SimpleJunction.Junction;
import Model.SimpleJunction.JunctionStructure;
import Model.SimpleJunction.JunctionUpdateStructure;
import Model.Vehicle;
import Symulation.View;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Sim {
    public Text getText() {
        return text;
    }

    public Road getKabelPlaszowPart1() {
        return KabelPlaszowPart1;
    }

    public GhostJunction getPlaszowGhost() {
        return PlaszowGhost;
    }

    public RoadUpdateStructure getRoadUpdateStructure() {
        return roadUpdateStructure;
    }

    public Road getOfiarKatyniaZarzecze() {
        return OfiarKatyniaZarzecze;
    }

    public Road getZarzeczePrzegorzaly() {
        return ZarzeczePrzegorzaly;
    }

    public Road getPrzegorzalyRuczaj() {
        return PrzegorzalyRuczaj;
    }

    public Road getRuczajSolvaySquare() {
        return RuczajSolvaySquare;
    }

    public Road getRuczajSolvay() {
        return RuczajSolvay;
    }

    public Road getSolvayLagiewniki() {
        return SolvayLagiewniki;
    }

    public Road getLagiewnikiKabelSquare() {
        return LagiewnikiKabelSquare;
    }

    public Road getLagiewnikiKabel() {
        return LagiewnikiKabel;
    }

    public Road getKabelPlaszowPart() {
        return KabelPlaszowPart;
    }

    public Road getKabelPlaszow() {
        return KabelPlaszow;
    }

    public Road getPlaszowLeg() {
        return PlaszowLeg;
    }

    public Road getPlaszowLegPart() {
        return PlaszowLegPart;
    }

    public Road getLegDywizjonu308() {
        return LegDywizjonu308;
    }

    public Road getDywizjonu308Czyzyny() {
        return Dywizjonu308Czyzyny;
    }

    public Road getCzyzynyMistrzejowice() {
        return CzyzynyMistrzejowice;
    }

    public Road getImbramowskiWobromskiPart1() {
        return ImbramowskiWobromskiPart1;
    }

    public Road getPolsaduImbramowski() {
        return PolsaduImbramowski;
    }

    public Road getWobromskiOfiarKatyniaPart1() {
        return WobromskiOfiarKatyniaPart1;
    }

    public Road getImbramowskiWobromskiPart2() {
        return ImbramowskiWobromskiPart2;
    }

    public Road getMistrzejowicePolsaduPart1() {
        return MistrzejowicePolsaduPart1;
    }

    public Road getMistrzejowicePolsaduPart2() {
        return MistrzejowicePolsaduPart2;
    }

    public Road getWobromskiOfiarKatyniaPart2() {
        return WobromskiOfiarKatyniaPart2;
    }

    public Junction getZarzecze() {
        return Zarzecze;
    }

    public Junction getPrzegorzaly() {
        return Przegorzaly;
    }

    public Junction getRuczaj() {
        return Ruczaj;
    }

    public Junction getSolvay() {
        return Solvay;
    }

    public Junction getLagiewniki() {
        return Lagiewniki;
    }

    public Junction getKabel() {
        return Kabel;
    }

    public Junction getPlaszow() {
        return Plaszow;
    }

    public Junction getLeg() {
        return Leg;
    }

    public Junction getDywizjonow308() {
        return Dywizjonow308;
    }

    public Junction getCzyzyny() {
        return Czyzyny;
    }

    public Junction getMistrzejowice() {
        return Mistrzejowice;
    }

    public Junction getPolsadu() {
        return Polsadu;
    }

    public Junction getImbramowski() {
        return Imbramowski;
    }

    public Junction getWolbromski() {
        return Wolbromski;
    }

    public Junction getOfiarKatynia() {
        return OfiarKatynia;
    }

    public GhostJunction getRuczajSolvayGhost() {
        return RuczajSolvayGhost;
    }

    public GhostJunction getLagiewnikiKabelGhost() {
        return LagiewnikiKabelGhost;
    }

    public GhostJunction getKabelPlaszowGhost() {
        return KabelPlaszowGhost;
    }

    public GhostJunction getPlaszowLegGhost() {
        return PlaszowLegGhost;
    }

    public GhostJunction getMistrzejowicePolsaduGhost() {
        return MistrzejowicePolsaduGhost;
    }

    public GhostJunction getImbramowskiWolbromskiGhost() {
        return ImbramowskiWolbromskiGhost;
    }

    public GhostJunction getWolbromskiOfiarKatyniaGhost() {
        return WolbromskiOfiarKatyniaGhost;
    }

    public JunctionUpdateStructure getJunctionUpdateStructure() {
        return junctionUpdateStructure;
    }

    public int getTimer() {
        return timer;
    }

    public Thread getThread() {
        return thread;
    }

    Text text;
    RoadUpdateStructure roadUpdateStructure = new RoadUpdateStructure();
    Road OfiarKatyniaZarzecze = new Road();
    Road ZarzeczePrzegorzaly = new Road();
    Road PrzegorzalyRuczaj = new Road();
    Road RuczajSolvaySquare = new Road();
    Road RuczajSolvay = new Road();
    Road SolvayLagiewniki = new Road();
    Road LagiewnikiKabelSquare = new Road();
    Road LagiewnikiKabel = new Road();
    Road KabelPlaszowPart = new Road();
    Road KabelPlaszowPart1 = new Road();
    Road KabelPlaszow = new Road();
    Road PlaszowLeg = new Road();
    Road PlaszowLegPart = new Road();
    Road LegDywizjonu308 = new Road();
    Road Dywizjonu308Czyzyny = new Road();
    Road CzyzynyMistrzejowice = new Road();
    Road ImbramowskiWobromskiPart1 = new Road();
    Road PolsaduImbramowski = new Road();
    Road WobromskiOfiarKatyniaPart1 = new Road();
    Road ImbramowskiWobromskiPart2 = new Road();
    Road MistrzejowicePolsaduPart1 = new Road();
    Road MistrzejowicePolsaduPart2 = new Road();
    Road WobromskiOfiarKatyniaPart2 = new Road();
    Junction Zarzecze;
    Junction Przegorzaly;
    Junction Ruczaj;
    Junction Solvay;
    Junction Lagiewniki;
    Junction Kabel;
    Junction Plaszow;
    Junction Leg;
    Junction Dywizjonow308;
    Junction Czyzyny;
    Junction Mistrzejowice;
    Junction Polsadu;
    Junction Imbramowski;
    Junction Wolbromski;
    Junction OfiarKatynia;
    GhostJunction RuczajSolvayGhost;
    GhostJunction LagiewnikiKabelGhost;
    GhostJunction KabelPlaszowGhost;
    GhostJunction PlaszowGhost;
    GhostJunction PlaszowLegGhost;
    GhostJunction MistrzejowicePolsaduGhost ;
    GhostJunction ImbramowskiWolbromskiGhost ;
    GhostJunction WolbromskiOfiarKatyniaGhost ;
    //JunctionNOTUSED junction3 = new JunctionNOTUSED(junctionStructure3,5);
    JunctionUpdateStructure junctionUpdateStructure = new JunctionUpdateStructure();
    int timer = 0;
    public void setText(Text text) {
        this.text = text;
    }
    public void init() {
        roadUpdateStructure.addRoad(OfiarKatyniaZarzecze);
        OfiarKatyniaZarzecze.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        OfiarKatyniaZarzecze.new Lane(130, Road.DIRECTION.LEFT, true, 0),
                        OfiarKatyniaZarzecze.new Lane(130, Road.DIRECTION.LEFT, true, 1),
                        OfiarKatyniaZarzecze.new Lane(130, Road.DIRECTION.LEFT, true, 2))));

        OfiarKatyniaZarzecze.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        OfiarKatyniaZarzecze.new Lane(130, Road.DIRECTION.RIGHT, true, 2),
                        OfiarKatyniaZarzecze.new Lane(130, Road.DIRECTION.RIGHT, true, 1),
                        OfiarKatyniaZarzecze.new Lane(130, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(ZarzeczePrzegorzaly);
        ZarzeczePrzegorzaly.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        ZarzeczePrzegorzaly.new Lane(300, Road.DIRECTION.LEFT, true, 0),
                        ZarzeczePrzegorzaly.new Lane(300, Road.DIRECTION.LEFT, true, 1),
                        ZarzeczePrzegorzaly.new Lane(300, Road.DIRECTION.LEFT, true, 2))));

        ZarzeczePrzegorzaly.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        ZarzeczePrzegorzaly.new Lane(30, Road.DIRECTION.RIGHT, true, 2),
                        ZarzeczePrzegorzaly.new Lane(30, Road.DIRECTION.RIGHT, true, 1),
                        ZarzeczePrzegorzaly.new Lane(30, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(PrzegorzalyRuczaj);
        PrzegorzalyRuczaj.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PrzegorzalyRuczaj.new Lane(50, Road.DIRECTION.LEFT, true, 0),
                        PrzegorzalyRuczaj.new Lane(50, Road.DIRECTION.LEFT, true, 1),
                        PrzegorzalyRuczaj.new Lane(50, Road.DIRECTION.LEFT, true, 2))));

        PrzegorzalyRuczaj.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PrzegorzalyRuczaj.new Lane(50, Road.DIRECTION.RIGHT, true, 2),
                        PrzegorzalyRuczaj.new Lane(50, Road.DIRECTION.RIGHT, true, 1),
                        PrzegorzalyRuczaj.new Lane(50, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(RuczajSolvaySquare);
        RuczajSolvaySquare.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        RuczajSolvaySquare.new Lane(100, Road.DIRECTION.LEFT, true, 0),
                        RuczajSolvaySquare.new Lane(100, Road.DIRECTION.LEFT, true, 1),
                        RuczajSolvaySquare.new Lane(100, Road.DIRECTION.LEFT, true, 2))));

        RuczajSolvaySquare.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        RuczajSolvaySquare.new Lane(100, Road.DIRECTION.RIGHT, true, 2),
                        RuczajSolvaySquare.new Lane(100, Road.DIRECTION.RIGHT, true, 1),
                        RuczajSolvaySquare.new Lane(100, Road.DIRECTION.RIGHT, true, 0))));



        roadUpdateStructure.addRoad(RuczajSolvay);
        RuczajSolvay.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        RuczajSolvay.new Lane(90, Road.DIRECTION.LEFT, true, 0),
                        RuczajSolvay.new Lane(90, Road.DIRECTION.LEFT, true, 1),
                        RuczajSolvay.new Lane(90, Road.DIRECTION.LEFT, true, 2))));

        RuczajSolvay.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        RuczajSolvay.new Lane(90, Road.DIRECTION.RIGHT, true, 2),
                        RuczajSolvay.new Lane(90, Road.DIRECTION.RIGHT, true, 1),
                        RuczajSolvay.new Lane(90, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(SolvayLagiewniki);
        SolvayLagiewniki.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        SolvayLagiewniki.new Lane(110, Road.DIRECTION.LEFT, true, 0),
                        SolvayLagiewniki.new Lane(110, Road.DIRECTION.LEFT, true, 1),
                        SolvayLagiewniki.new Lane(110, Road.DIRECTION.LEFT, true, 2))));

        SolvayLagiewniki.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        SolvayLagiewniki.new Lane(110, Road.DIRECTION.RIGHT, true, 2),
                        SolvayLagiewniki.new Lane(110, Road.DIRECTION.RIGHT, true, 1),
                        SolvayLagiewniki.new Lane(110, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(LagiewnikiKabelSquare);
        LagiewnikiKabelSquare.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        LagiewnikiKabelSquare.new Lane(82, Road.DIRECTION.LEFT, true, 0),
                        LagiewnikiKabelSquare.new Lane(82, Road.DIRECTION.LEFT, true, 1),
                        LagiewnikiKabelSquare.new Lane(82, Road.DIRECTION.LEFT, true, 2))));


        LagiewnikiKabelSquare.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        LagiewnikiKabelSquare.new Lane(82, Road.DIRECTION.RIGHT, true, 2),
                        LagiewnikiKabelSquare.new Lane(82, Road.DIRECTION.RIGHT, true, 1),
                        LagiewnikiKabelSquare.new Lane(82, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(LagiewnikiKabel);
        LagiewnikiKabel.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        LagiewnikiKabel.new Lane(210, Road.DIRECTION.LEFT, true, 0),
                        LagiewnikiKabel.new Lane(210, Road.DIRECTION.LEFT, true, 1),
                        LagiewnikiKabel.new Lane(210, Road.DIRECTION.LEFT, true, 2))));

        LagiewnikiKabel.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        LagiewnikiKabel.new Lane(210, Road.DIRECTION.RIGHT, true, 2),
                        LagiewnikiKabel.new Lane(210, Road.DIRECTION.RIGHT, true, 1),
                        LagiewnikiKabel.new Lane(210, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(KabelPlaszowPart);
        KabelPlaszowPart.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        KabelPlaszowPart.new Lane(50, Road.DIRECTION.LEFT, true, 0),
                        KabelPlaszowPart.new Lane(50, Road.DIRECTION.LEFT, true, 1),
                        KabelPlaszowPart.new Lane(50, Road.DIRECTION.LEFT, true, 2))));

        KabelPlaszowPart.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        KabelPlaszowPart.new Lane(50, Road.DIRECTION.RIGHT, true, 2),
                        KabelPlaszowPart.new Lane(50, Road.DIRECTION.RIGHT, true, 1),
                        KabelPlaszowPart.new Lane(50, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(KabelPlaszowPart1);
        KabelPlaszowPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        KabelPlaszowPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        KabelPlaszowPart.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(KabelPlaszow);
        KabelPlaszow.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        KabelPlaszow.new Lane(100, Road.DIRECTION.LEFT, true, 0),
                        KabelPlaszow.new Lane(100, Road.DIRECTION.LEFT, true, 1),
                        KabelPlaszow.new Lane(100, Road.DIRECTION.LEFT, true, 2))));

        KabelPlaszow.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        KabelPlaszow.new Lane(100, Road.DIRECTION.RIGHT, true, 2),
                        KabelPlaszow.new Lane(100, Road.DIRECTION.RIGHT, true, 1),
                        KabelPlaszow.new Lane(100, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(PlaszowLegPart);
        PlaszowLegPart.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PlaszowLegPart.new Lane(100, Road.DIRECTION.LEFT, true, 0),
                        PlaszowLegPart.new Lane(100, Road.DIRECTION.LEFT, true, 1),
                        PlaszowLegPart.new Lane(100, Road.DIRECTION.LEFT, true, 2))));

        PlaszowLegPart.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PlaszowLegPart.new Lane(100, Road.DIRECTION.RIGHT, true, 2),
                        PlaszowLegPart.new Lane(100, Road.DIRECTION.RIGHT, true, 1),
                        PlaszowLegPart.new Lane(100, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(PlaszowLeg);
        PlaszowLeg.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PlaszowLeg.new Lane(20, Road.DIRECTION.LEFT, true, 0),
                        PlaszowLeg.new Lane(20, Road.DIRECTION.LEFT, true, 1),
                        PlaszowLeg.new Lane(20, Road.DIRECTION.LEFT, true, 2))));

        PlaszowLeg.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PlaszowLeg.new Lane(20, Road.DIRECTION.RIGHT, true, 2),
                        PlaszowLeg.new Lane(20, Road.DIRECTION.RIGHT, true, 1),
                        PlaszowLeg.new Lane(20, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(LegDywizjonu308);
        LegDywizjonu308.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        LegDywizjonu308.new Lane(100, Road.DIRECTION.LEFT, true, 0),
                        LegDywizjonu308.new Lane(100, Road.DIRECTION.LEFT, true, 1),
                        LegDywizjonu308.new Lane(100, Road.DIRECTION.LEFT, true, 2))));

        LegDywizjonu308.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        LegDywizjonu308.new Lane(100, Road.DIRECTION.RIGHT, true, 2),
                        LegDywizjonu308.new Lane(100, Road.DIRECTION.RIGHT, true, 1),
                        LegDywizjonu308.new Lane(100, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(Dywizjonu308Czyzyny);
        Dywizjonu308Czyzyny.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        Dywizjonu308Czyzyny.new Lane(100, Road.DIRECTION.LEFT, true, 0),
                        Dywizjonu308Czyzyny.new Lane(100, Road.DIRECTION.LEFT, true, 1),
                        Dywizjonu308Czyzyny.new Lane(100, Road.DIRECTION.LEFT, true, 2))));

        Dywizjonu308Czyzyny.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        Dywizjonu308Czyzyny.new Lane(100, Road.DIRECTION.RIGHT, true, 2),
                        Dywizjonu308Czyzyny.new Lane(100, Road.DIRECTION.RIGHT, true, 1),
                        Dywizjonu308Czyzyny.new Lane(100, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(CzyzynyMistrzejowice);
        CzyzynyMistrzejowice.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        CzyzynyMistrzejowice.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        CzyzynyMistrzejowice.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(MistrzejowicePolsaduPart1);
        MistrzejowicePolsaduPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        MistrzejowicePolsaduPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        MistrzejowicePolsaduPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(MistrzejowicePolsaduPart2);
        MistrzejowicePolsaduPart2.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        MistrzejowicePolsaduPart2.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        MistrzejowicePolsaduPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(PolsaduImbramowski);
        PolsaduImbramowski.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        PolsaduImbramowski.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        PolsaduImbramowski.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(ImbramowskiWobromskiPart1);
        ImbramowskiWobromskiPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        ImbramowskiWobromskiPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        ImbramowskiWobromskiPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(ImbramowskiWobromskiPart2);
        ImbramowskiWobromskiPart2.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        ImbramowskiWobromskiPart2.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        ImbramowskiWobromskiPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));


        roadUpdateStructure.addRoad(WobromskiOfiarKatyniaPart1);
        WobromskiOfiarKatyniaPart1.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        WobromskiOfiarKatyniaPart1.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        WobromskiOfiarKatyniaPart1.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));

        roadUpdateStructure.addRoad(WobromskiOfiarKatyniaPart2);
        WobromskiOfiarKatyniaPart2.setLeftLanes(new ArrayList<Road.Lane>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.LEFT, true, 0),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.LEFT, true, 1),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.LEFT, true, 2))));

        WobromskiOfiarKatyniaPart2.setRightLanes(new ArrayList<>(
                Arrays.asList(
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 2),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 1),
                        WobromskiOfiarKatyniaPart2.new Lane(10, Road.DIRECTION.RIGHT, true, 0))));


        JunctionStructure ZarzeczeStructure = new JunctionStructure(OfiarKatyniaZarzecze, ZarzeczePrzegorzaly);
        JunctionStructure PrzegorzalyStructure = new JunctionStructure(ZarzeczePrzegorzaly, PrzegorzalyRuczaj);
        JunctionStructure RuczajStructure = new JunctionStructure(PrzegorzalyRuczaj, RuczajSolvaySquare);
        JunctionStructure RuczajSolvayPartStructure = new JunctionStructure(RuczajSolvaySquare, RuczajSolvay,
                false);
        JunctionStructure SolvayMainStructure = new JunctionStructure(RuczajSolvay, SolvayLagiewniki);
        JunctionStructure LagiewnikiStructure = new JunctionStructure(SolvayLagiewniki, LagiewnikiKabelSquare);
        JunctionStructure LagiewnikiKabelPartStructure = new JunctionStructure(LagiewnikiKabelSquare, LagiewnikiKabel,
                false);
        JunctionStructure KabelStructure = new JunctionStructure(LagiewnikiKabel, KabelPlaszowPart);
        JunctionStructure KabelPlaszowPartStructure = new JunctionStructure(KabelPlaszowPart, KabelPlaszowPart1,
                false);
        JunctionStructure KabelPlaszowPartStructure1 = new JunctionStructure(KabelPlaszowPart1,KabelPlaszow
                ,false);
        JunctionStructure PlaszowStructure = new JunctionStructure(KabelPlaszow, PlaszowLegPart);
        JunctionStructure PlaszowLegPartStructure = new JunctionStructure(PlaszowLegPart, PlaszowLeg,
                false);
        JunctionStructure LegStructure = new JunctionStructure(PlaszowLeg, LegDywizjonu308);
        JunctionStructure Dywizjonu308Structure = new JunctionStructure(LegDywizjonu308, Dywizjonu308Czyzyny);
        JunctionStructure CzyzynyStructure = new JunctionStructure(Dywizjonu308Czyzyny, CzyzynyMistrzejowice);
        JunctionStructure MistrzejowiceStructure = new JunctionStructure(CzyzynyMistrzejowice, MistrzejowicePolsaduPart1);

        JunctionStructure MistrzejowicePolsaduPartStructure = new JunctionStructure(MistrzejowicePolsaduPart1,
                MistrzejowicePolsaduPart2, false);

        JunctionStructure PolsaduStructure = new JunctionStructure(MistrzejowicePolsaduPart2,
                PolsaduImbramowski);
        JunctionStructure ImbramowskiStructure = new JunctionStructure(PolsaduImbramowski, ImbramowskiWobromskiPart1);
        JunctionStructure ImbramowskiWolbromskiPartStructure = new JunctionStructure(ImbramowskiWobromskiPart1,
                ImbramowskiWobromskiPart2, false);

        JunctionStructure WolbromskiOfiarKatyniaPartStructure = new JunctionStructure(WobromskiOfiarKatyniaPart1,
                WobromskiOfiarKatyniaPart2, false);

        JunctionStructure WolbromskiStructure = new JunctionStructure(ImbramowskiWobromskiPart2, WobromskiOfiarKatyniaPart1);
        JunctionStructure OfiarKatyniaStructure = new JunctionStructure(WobromskiOfiarKatyniaPart2, OfiarKatyniaZarzecze);

        //JunctionStructure junctionStructure3 = new JunctionStructure(r3,r1);


        Zarzecze = new Junction(ZarzeczeStructure, 5);
        Przegorzaly = new Junction(PrzegorzalyStructure, 5);
        Ruczaj = new Junction(RuczajStructure, 5);
        Solvay = new Junction(SolvayMainStructure, 5);
        Lagiewniki = new Junction(LagiewnikiStructure, 5);
        Kabel = new Junction(KabelStructure, 5);
        Plaszow = new Junction(PlaszowStructure, 5);
        Leg = new Junction(LegStructure, 5);
        Dywizjonow308 = new Junction(Dywizjonu308Structure, 5);
        Czyzyny = new Junction(CzyzynyStructure, 5);
        Mistrzejowice = new Junction(MistrzejowiceStructure, 5);
        Polsadu = new Junction(PolsaduStructure, 5);
        Imbramowski = new Junction(ImbramowskiStructure, 5);
        Wolbromski = new Junction(WolbromskiStructure, 5);
        OfiarKatynia = new Junction(OfiarKatyniaStructure, 5);


        RuczajSolvayGhost = new GhostJunction(RuczajSolvayPartStructure);
        LagiewnikiKabelGhost = new GhostJunction(LagiewnikiKabelPartStructure);
        KabelPlaszowGhost = new GhostJunction(KabelPlaszowPartStructure);
        PlaszowGhost = new GhostJunction(KabelPlaszowPartStructure1);
        PlaszowLegGhost = new GhostJunction(PlaszowLegPartStructure);
        MistrzejowicePolsaduGhost = new GhostJunction(MistrzejowicePolsaduPartStructure);
        ImbramowskiWolbromskiGhost = new GhostJunction(ImbramowskiWolbromskiPartStructure);
        WolbromskiOfiarKatyniaGhost = new GhostJunction(WolbromskiOfiarKatyniaPartStructure);
        //JunctionNOTUSED junction3 = new JunctionNOTUSED(junctionStructure3,5);

        junctionUpdateStructure.addRoad(Arrays.asList(Zarzecze, Przegorzaly, Ruczaj, Solvay, Lagiewniki, Kabel,
                Plaszow, Leg, Dywizjonow308, Czyzyny, Mistrzejowice, Polsadu, Imbramowski, Wolbromski, OfiarKatynia,
                RuczajSolvayGhost, LagiewnikiKabelGhost, KabelPlaszowGhost,PlaszowGhost, PlaszowLegGhost, MistrzejowicePolsaduGhost,
                WolbromskiOfiarKatyniaGhost, ImbramowskiWolbromskiGhost));

        //Obsługa auta



    }

    Runnable runnable = new Runnable() {
        Destination destinationStraight = new Destination(0,0);
        Vehicle tmp2 = new Vehicle(2, 6, 6,Vehicle.TYPE.CAR);
        //TODO add destination to constructor


            @Override
            public void run() {
                OfiarKatyniaZarzecze.getRightLanes().get(0).addVehice(tmp2,0);
//                OfiarKatyniaZarzecze.getRightLanes().get(2).addVehice(new Vehicle(3,6,6,Vehicle.TYPE.CAR));
//                PrzegorzalyRuczaj.getLeftLanes().get(2).addVehice(new Vehicle(10,10,10, Vehicle.TYPE.CAR));
//                LagiewnikiKabelSquare.getRightLanes().get(0).addVehice(new Vehicle(4,6,6, Vehicle.TYPE.CAR));
//                LagiewnikiKabel.getLeftLanes().get(0).addVehice(new Vehicle(5,10,10, Vehicle.TYPE.CAR));
//                KabelPlaszowPart.getRightLanes().get(2).addVehice(new Vehicle(6,3,3, Vehicle.TYPE.CAR));
//                LegDywizjonu308.getLeftLanes().get(0).addVehice(new Vehicle(12,6,6, Vehicle.TYPE.CAR),5);
//                PlaszowLeg.getRightLanes().get(2).addVehice(new Vehicle(10,5,5, Vehicle.TYPE.CAR),0);
//                PlaszowLeg.getRightLanes().get(0).addVehice(new Vehicle(11,5,5, Vehicle.TYPE.CAR),5);
                RuczajSolvay.getLeftLanes().get(0).addVehice(new Vehicle(13,5,5, Vehicle.TYPE.CAR),0);
                while(true){
                System.out.println(tmp2);
                View zajebistywidok = new View(LegDywizjonu308);
                try {
//                    zajebistywidok.view();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                zajebistywidok = new View(Dywizjonu308Czyzyny);
                try {
//                    zajebistywidok.view();
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
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
        };
        Thread thread = new Thread(runnable);

    public Runnable getRunnable() {
        return runnable;
    }


    void run(){
            this.init();
            thread.start();
        }
}
