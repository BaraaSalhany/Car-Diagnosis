package entity;

import java.util.ArrayList;

public class OAV {
    private Objects obj;
    private Attributes attr;
    private boolean val;
    private Double cf;
    private ArrayList<OAV> next;

    public enum Objects{
        TheStarter,HeadLights,Group1,Group2,TheBushings,Battery,Wires,Group3
    }

    public enum TheStarterAttr implements Attributes{
        TryCrank("Try to crank the starter"),
        Dead("The starter is dead or cranks slowly"),
        CranksSlowly("The starter is dead or cranks slowly"),
        CranksNormally("the starter cranks normally"),
        SendOrReplace("send the starter to a test station or replace it"),
        ShortedToGround("it is probably because the starter is shorted to ground, Have the starter tested or replace it");

        private String name;
        TheStarterAttr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum HeadLightsAttr implements Attributes{
        TurnON("turn on the headlights"),
        Bright("the headlights are bright"),
        Out("the headlights are out, or very dim"),
        VeryDim("the headlights are out, or very dim"),
        DimDrastically("the lights dim drastically");

        private String name;
        HeadLightsAttr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum Group1Attr implements Attributes{
        Trouble("the trouble is either in the starter itself, the solenoid, or in the wiring");

        private String name;
        Group1Attr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum Group2Attr implements Attributes{
        Trouble("the problem is in the wiring up to the ignition switch or in the solenoid; check them");

        private String name;
        Group2Attr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum TheBushingsAttr implements Attributes{
        Check("check the bushings"),
        Good("the bushings are good");

        private String name;
        TheBushingsAttr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum BatteryAttr implements Attributes{
        Check("check the battery"),
        OK("the battery is OK");

        private String name;
        BatteryAttr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum WiresAttr implements Attributes{
        Check("check the wiring for breaks, shorts, and dirty connections"),
        NotFault("the battery and connecting wires are not at fault");

        private String name;
        WiresAttr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public enum Group3Attr implements Attributes{
        TurnONAndCrank("turn the headlights on and try to crank the starter");

        private String name;
        Group3Attr(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    ///////////////////////////////////

    public OAV(Objects obj, Attributes attr, boolean val, Double cf) {
        this.obj = obj;
        this.attr = attr;
        this.val = val;
        this.cf = cf;
        this.next = null;
    }

    public Objects getObj() {
        return obj;
    }

    public void setObj(Objects obj) {
        this.obj = obj;
    }

    public Attributes getAttr() {
        return attr;
    }

    public void setAttr(Attributes attr) {
        this.attr = attr;
    }

    public boolean isVal() {
        return val;
    }

    public void setVal(boolean val) {
        this.val = val;
    }

    public Double getCf() {
        return cf;
    }

    public void setCf(Double cf) {
        this.cf = cf;
    }

    public ArrayList<OAV> getNext() {
        return next;
    }

    public void addNext(OAV next) {
        if (this.next == null)
            this.next = new ArrayList<OAV>();
        this.next.add(next);
    }

    @Override
    public String toString() {
        return "OAV{" +
                "obj=" + obj +
                ", attr=" + attr +
                ", val=" + val +
                ", cf=" + cf +
                ", next=" + next +
                '}';
    }
}

